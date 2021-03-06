package com.mrbysco.skinnedcarts.items;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.SkinnedCarts;
import com.mrbysco.skinnedcarts.entity.EntityElephantCart;
import com.mrbysco.skinnedcarts.entity.EntityFrogCart;
import com.mrbysco.skinnedcarts.entity.EntityPandaCart;
import com.mrbysco.skinnedcarts.entity.EntityPelicanCart;
import com.mrbysco.skinnedcarts.entity.EntityPufferFishCart;
import com.mrbysco.skinnedcarts.entity.EntitySkinnedCart;
import com.mrbysco.skinnedcarts.entity.EntitySnailCart;
import com.mrbysco.skinnedcarts.entity.EntityTurtleCart;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemCustomCart extends Item {

	private static final IBehaviorDispenseItem MINECART_DISPENSER_BEHAVIOR = new BehaviorDefaultDispenseItem()
    {
        private final BehaviorDefaultDispenseItem behaviourDefaultDispenseItem = new BehaviorDefaultDispenseItem();
        /**
         * Dispense the specified stack, play the dispense sound and spawn particles.
         */
        public ItemStack dispenseStack(IBlockSource source, ItemStack stack)
        {
            EnumFacing enumfacing = (EnumFacing)source.getBlockState().getValue(BlockDispenser.FACING);
            World world = source.getWorld();
            double d0 = source.getX() + (double)enumfacing.getXOffset() * 1.125D;
            double d1 = Math.floor(source.getY()) + (double)enumfacing.getYOffset();
            double d2 = source.getZ() + (double)enumfacing.getZOffset() * 1.125D;
            BlockPos blockpos = source.getBlockPos().offset(enumfacing);
            IBlockState iblockstate = world.getBlockState(blockpos);
            BlockRailBase.EnumRailDirection blockrailbase$enumraildirection = iblockstate.getBlock() instanceof BlockRailBase ? ((BlockRailBase)iblockstate.getBlock()).getRailDirection(world, blockpos, iblockstate, null) : BlockRailBase.EnumRailDirection.NORTH_SOUTH;
            double d3;

            if (BlockRailBase.isRailBlock(iblockstate))
            {
                if (blockrailbase$enumraildirection.isAscending())
                {
                    d3 = 0.6D;
                }
                else
                {
                    d3 = 0.1D;
                }
            }
            else
            {
                if (iblockstate.getMaterial() != Material.AIR || !BlockRailBase.isRailBlock(world.getBlockState(blockpos.down())))
                {
                    return this.behaviourDefaultDispenseItem.dispense(source, stack);
                }

                IBlockState iblockstate1 = world.getBlockState(blockpos.down());
                BlockRailBase.EnumRailDirection blockrailbase$enumraildirection1 = iblockstate1.getBlock() instanceof BlockRailBase ? ((BlockRailBase)iblockstate1.getBlock()).getRailDirection(world, blockpos.down(), iblockstate1, null) : BlockRailBase.EnumRailDirection.NORTH_SOUTH;

                if (enumfacing != EnumFacing.DOWN && blockrailbase$enumraildirection1.isAscending())
                {
                    d3 = -0.4D;
                }
                else
                {
                    d3 = -0.9D;
                }
            }

            EntitySkinnedCart entityminecart = ((ItemCustomCart)stack.getItem()).getMinecartEntity(world, d0, d1 + d3, d2, stack.getItem());

            if(entityminecart != null) {
            	if (stack.hasDisplayName())
                {
                    entityminecart.setCustomNameTag(stack.getDisplayName());
                }

                world.spawnEntity(entityminecart);
                stack.shrink(1);
            }
            
            return stack;
        }
        /**
         * Play the dispense sound from the specified block.
         */
        protected void playDispenseSound(IBlockSource source)
        {
            source.getWorld().playEvent(1000, source.getBlockPos(), 0);
        }
    };

    public ItemCustomCart(String cartName)
    {
		setTranslationKey(Reference.MOD_PREFIX + cartName);
		setRegistryName(cartName);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.TRANSPORTATION);
        BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(this, MINECART_DISPENSER_BEHAVIOR);
    }
    
    @Override
    public CreativeTabs[] getCreativeTabs() {
    	return new CreativeTabs[] {CreativeTabs.TRANSPORTATION, SkinnedCarts.cartTab};
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        boolean cartExists = true;

        if (!BlockRailBase.isRailBlock(iblockstate))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            ItemStack itemstack = player.getHeldItem(hand);
        	String cartName = itemstack.getItem().getRegistryName().getPath();

            if (!worldIn.isRemote)
            {
                BlockRailBase.EnumRailDirection blockrailbase$enumraildirection = iblockstate.getBlock() instanceof BlockRailBase ? ((BlockRailBase)iblockstate.getBlock()).getRailDirection(worldIn, pos, iblockstate, null) : BlockRailBase.EnumRailDirection.NORTH_SOUTH;
                double d0 = 0.0D;

                if (blockrailbase$enumraildirection.isAscending())
                {
                    d0 = 0.5D;
                }

                EntitySkinnedCart entityminecart = getMinecartEntity(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.0625D + d0, (double)pos.getZ() + 0.5D, itemstack.getItem());

                if(entityminecart != null) {
                	if (itemstack.hasDisplayName())
                    {
                        entityminecart.setCustomNameTag(itemstack.getDisplayName());
                    }

                    worldIn.spawnEntity(entityminecart);
                } else {
                	cartExists = false;
                	player.sendMessage(new TextComponentString("Entity: " + cartName + " does not exist."));
                }
            }
            if(cartExists) {
                itemstack.shrink(1);
            }
            
            return EnumActionResult.SUCCESS;
        }
    }
    
    public static EntitySkinnedCart getMinecartEntity(World worldIn, double x, double y, double z, Item stack) {
    	String cartName = stack.getRegistryName().getPath();
    	EntitySkinnedCart cart = null;
    	switch(cartName) {
    		default:
    			cart = new EntityFrogCart(worldIn);
    			break;
    		case "elephant_minecart":
    			cart = new EntityElephantCart(worldIn);
    			break;
    		case "panda_minecart":
    			cart = new EntityPandaCart(worldIn);
    			break;
    		case "pelican_minecart":
    			cart = new EntityPelicanCart(worldIn);
    			break;
    		case "pufferfish_minecart":
    			cart = new EntityPufferFishCart(worldIn);
    			break;
    		case "snail_minecart":
    			cart = new EntitySnailCart(worldIn);
    			break;
    		case "turtle_minecart":
    			cart = new EntityTurtleCart(worldIn);
    			break;
    	}
    	
    	if(cart != null ) {
    		cart.setPosition(x, y, z);
    		cart.setReturnItem(stack.getRegistryName().toString());
		}
    	
    	return cart;
    }
}
