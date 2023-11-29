package com.mrbysco.skinnedcarts.items;

import com.mrbysco.skinnedcarts.entity.AbstractSkinnedCart;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.phys.Vec3;

public class CustomCartItem extends Item {

	private static final DispenseItemBehavior MINECART_DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior() {
		private final DefaultDispenseItemBehavior behaviourDefaultDispenseItem = new DefaultDispenseItemBehavior();

		/**
		 * Dispense the specified stack, play the dispense sound and spawn particles.
		 */
		public ItemStack execute(BlockSource source, ItemStack stack) {
			Direction direction = source.state().getValue(DispenserBlock.FACING);
			Level level = source.level();
			Vec3 center = source.center();
			double d0 = center.x() + (double) direction.getStepX() * 1.125D;
			double d1 = Math.floor(center.y()) + (double) direction.getStepY();
			double d2 = center.z() + (double) direction.getStepZ() * 1.125D;
			BlockPos blockpos = source.pos().relative(direction);
			BlockState blockstate = level.getBlockState(blockpos);
			RailShape railshape = blockstate.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) blockstate.getBlock()).getRailDirection(blockstate, level, blockpos, null) : RailShape.NORTH_SOUTH;
			double d3;
			if (blockstate.is(BlockTags.RAILS)) {
				if (railshape.isAscending()) {
					d3 = 0.6D;
				} else {
					d3 = 0.1D;
				}
			} else {
				if (!blockstate.isAir() || !level.getBlockState(blockpos.below()).is(BlockTags.RAILS)) {
					return this.behaviourDefaultDispenseItem.dispense(source, stack);
				}

				BlockState blockstate1 = level.getBlockState(blockpos.below());
				RailShape railshape1 = blockstate1.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) blockstate1.getBlock()).getRailDirection(blockstate1, level, blockpos.below(), null) : RailShape.NORTH_SOUTH;
				if (direction != Direction.DOWN && railshape1.isAscending()) {
					d3 = -0.4D;
				} else {
					d3 = -0.9D;
				}
			}

			AbstractSkinnedCart skinnedCart = AbstractSkinnedCart.create(level, d0, d1 + d3, d2, ((CustomCartItem) stack.getItem()).cartType);
			if (stack.hasCustomHoverName()) {
				skinnedCart.setCustomName(stack.getHoverName());
			}
			level.addFreshEntity(skinnedCart);
			stack.shrink(1);

			return stack;
		}

		/**
		 * Play the dispense sound from the specified block.
		 */
		protected void playSound(BlockSource source) {
			source.level().levelEvent(1000, source.pos(), 0);
		}
	};
	private final AbstractSkinnedCart.Type cartType;

	public CustomCartItem(AbstractSkinnedCart.Type type, Properties properties) {
		super(properties.stacksTo(1));
		this.cartType = type;
		DispenserBlock.registerBehavior(this, MINECART_DISPENSER_BEHAVIOR);
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
				RailShape shape = state.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) state.getBlock()).getRailDirection(state, level, pos, null) : RailShape.NORTH_SOUTH;
				double d0 = 0.0D;
				if (shape.isAscending()) {
					d0 = 0.5D;
				}

				AbstractSkinnedCart skinnedCart = AbstractSkinnedCart.create(level, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.0625D + d0, (double) pos.getZ() + 0.5D, this.cartType);
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
