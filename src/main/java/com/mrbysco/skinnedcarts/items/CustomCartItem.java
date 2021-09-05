package com.mrbysco.skinnedcarts.items;

import com.mrbysco.skinnedcarts.CartTab;
import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;

import java.util.Arrays;
import java.util.Collection;

public class CustomCartItem extends Item {

    private static final DispenseItemBehavior MINECART_DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior() {
        private final DefaultDispenseItemBehavior behaviourDefaultDispenseItem = new DefaultDispenseItemBehavior();

        /**
         * Dispense the specified stack, play the dispense sound and spawn particles.
         */
        public ItemStack execute(BlockSource source, ItemStack stack) {
            Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
            Level world = source.getLevel();
            double d0 = source.x() + (double)direction.getStepX() * 1.125D;
            double d1 = Math.floor(source.y()) + (double)direction.getStepY();
            double d2 = source.z() + (double)direction.getStepZ() * 1.125D;
            BlockPos blockpos = source.getPos().relative(direction);
            BlockState blockstate = world.getBlockState(blockpos);
            RailShape railshape = blockstate.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock)blockstate.getBlock()).getRailDirection(blockstate, world, blockpos, null) : RailShape.NORTH_SOUTH;
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
                if (!blockstate.isAir() || !world.getBlockState(blockpos.below()).is(BlockTags.RAILS)) {
                    return this.behaviourDefaultDispenseItem.dispense(source, stack);
                }

                BlockState blockstate1 = world.getBlockState(blockpos.below());
                RailShape railshape1 = blockstate1.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock)blockstate1.getBlock()).getRailDirection(blockstate1, world, blockpos.below(), null) : RailShape.NORTH_SOUTH;
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
        protected void playSound(BlockSource source)
        {
            source.getLevel().levelEvent(1000, source.getPos(), 0);
        }
    };
    private final AbstractSkinnedCart.Type cartType;

    public CustomCartItem(AbstractSkinnedCart.Type type, Properties properties)
    {
        super(properties.stacksTo(1));
        this.cartType = type;
        DispenserBlock.registerBehavior(this, MINECART_DISPENSER_BEHAVIOR);
    }

    @Override
    public Collection<CreativeModeTab> getCreativeTabs() {
        return Arrays.asList(CreativeModeTab.TAB_TRANSPORTATION, CartTab.CART_TAB);
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        if (!state.is(BlockTags.RAILS)) {
            return InteractionResult.FAIL;
        } else {
            ItemStack itemstack = context.getItemInHand();
            if (!level.isClientSide) {
                RailShape shape = state.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock)state.getBlock()).getRailDirection(state, level, pos, null) : RailShape.NORTH_SOUTH;
                double d0 = 0.0D;
                if (shape.isAscending()) {
                    d0 = 0.5D;
                }

                AbstractSkinnedCart skinnedCart = AbstractSkinnedCart.create(level, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.0625D + d0, (double)pos.getZ() + 0.5D, this.cartType);
                if (itemstack.hasCustomHoverName()) {
                    skinnedCart.setCustomName(itemstack.getHoverName());
                }

                level.addFreshEntity(skinnedCart);
            }

            itemstack.shrink(1);
            return InteractionResult.SUCCESS;
        }
    }
}
