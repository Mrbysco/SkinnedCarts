package com.mrbysco.skinnedcarts.items;

import com.mrbysco.skinnedcarts.CartTab;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.RailShape;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Collection;

public class CustomCartItem extends Item {

    private static final IDispenseItemBehavior MINECART_DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior() {
        private final DefaultDispenseItemBehavior behaviourDefaultDispenseItem = new DefaultDispenseItemBehavior();

        /**
         * Dispense the specified stack, play the dispense sound and spawn particles.
         */
        public ItemStack execute(IBlockSource source, ItemStack stack)
        {
            Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
            World world = source.getLevel();
            double d0 = source.x() + (double)direction.getStepX() * 1.125D;
            double d1 = Math.floor(source.y()) + (double)direction.getStepY();
            double d2 = source.z() + (double)direction.getStepZ() * 1.125D;
            BlockPos blockpos = source.getPos().relative(direction);
            BlockState blockstate = world.getBlockState(blockpos);
            RailShape railshape = blockstate.getBlock() instanceof AbstractRailBlock ? ((AbstractRailBlock)blockstate.getBlock()).getRailDirection(blockstate, world, blockpos, null) : RailShape.NORTH_SOUTH;
            double d3;
            if (blockstate.is(BlockTags.RAILS)) {
                if (railshape.isAscending()) {
                    d3 = 0.6D;
                } else {
                    d3 = 0.1D;
                }
            }
            else
            {
                if (!blockstate.isAir(world, blockpos) || !world.getBlockState(blockpos.below()).is(BlockTags.RAILS)) {
                    return this.behaviourDefaultDispenseItem.dispense(source, stack);
                }

                BlockState blockstate1 = world.getBlockState(blockpos.below());
                RailShape railshape1 = blockstate1.getBlock() instanceof AbstractRailBlock ? ((AbstractRailBlock)blockstate1.getBlock()).getRailDirection(blockstate1, world, blockpos.below(), null) : RailShape.NORTH_SOUTH;
                if (direction != Direction.DOWN && railshape1.isAscending()) {
                    d3 = -0.4D;
                } else {
                    d3 = -0.9D;
                }
            }

            AbstractSkinnedCart skinnedCart = AbstractSkinnedCart.create(world, d0, d1 + d3, d2, ((CustomCartItem)stack.getItem()).cartType);
            if (stack.hasCustomHoverName()) {
                skinnedCart.setCustomName(stack.getHoverName());
            }
            world.addFreshEntity(skinnedCart);
            stack.shrink(1);
            
            return stack;
        }
        /**
         * Play the dispense sound from the specified block.
         */
        protected void playSound(IBlockSource source)
        {
            source.getLevel().levelEvent(1000, source.getPos(), 0);
        }
    };
    private final AbstractSkinnedCart.Type cartType;

    public CustomCartItem(AbstractSkinnedCart.Type minecartTypeIn, Item.Properties builder)
    {
        super(builder.stacksTo(1));
        this.cartType = minecartTypeIn;
        DispenserBlock.registerBehavior(this, MINECART_DISPENSER_BEHAVIOR);
    }

    @Override
    public Collection<ItemGroup> getCreativeTabs() {
        return Arrays.asList(ItemGroup.TAB_TRANSPORTATION, CartTab.CART_TAB);
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = world.getBlockState(blockpos);
        if (!blockstate.is(BlockTags.RAILS)) {
            return ActionResultType.FAIL;
        } else {
            ItemStack itemstack = context.getItemInHand();
            if (!world.isClientSide) {
                RailShape railshape = blockstate.getBlock() instanceof AbstractRailBlock ? ((AbstractRailBlock)blockstate.getBlock()).getRailDirection(blockstate, world, blockpos, null) : RailShape.NORTH_SOUTH;
                double d0 = 0.0D;
                if (railshape.isAscending()) {
                    d0 = 0.5D;
                }

                AbstractSkinnedCart abstractminecartentity = AbstractSkinnedCart.create(world, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.0625D + d0, (double)blockpos.getZ() + 0.5D, this.cartType);
                if (itemstack.hasCustomHoverName()) {
                    abstractminecartentity.setCustomName(itemstack.getHoverName());
                }

                world.addFreshEntity(abstractminecartentity);
            }

            itemstack.shrink(1);
            return ActionResultType.SUCCESS;
        }
    }
}
