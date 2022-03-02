package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

import java.util.function.Supplier;

public abstract class AbstractSkinnedCart extends AbstractMinecart {

	public AbstractSkinnedCart(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public AbstractSkinnedCart(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	@Override
	public void destroy(DamageSource source) {
		this.remove(Entity.RemovalReason.KILLED);
		if (this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
			ItemStack itemstack = this.getReturnItem();
			if (this.hasCustomName()) {
				itemstack.setHoverName(this.getCustomName());
			}

			this.spawnAtLocation(itemstack);
		}
	}


	public ItemStack getReturnItem() {
		return new ItemStack(this.getSkinCartType().getReturnItem().get());
	}

	@Override
	public AbstractMinecart.Type getMinecartType() {
		return AbstractMinecart.Type.RIDEABLE;
	}

	abstract AbstractSkinnedCart.Type getSkinCartType();

	@Override
	public ItemStack getPickedResult(HitResult target) {
		return this.getCartItem();
	}

	@Override
	public ItemStack getPickResult() {
		return this.getReturnItem();
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	public InteractionResult interact(Player player, InteractionHand hand) {
		InteractionResult ret = super.interact(player, hand);
		if (ret.consumesAction()) return ret;
		if (player.isSecondaryUseActive()) {
			return InteractionResult.PASS;
		} else if (this.isVehicle()) {
			return InteractionResult.PASS;
		} else if (!this.level.isClientSide) {
			return player.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.PASS;
		} else {
			return InteractionResult.SUCCESS;
		}
	}

	/**
	 * Called every tick the minecart is on an activator rail.
	 */
	public void activateMinecart(int x, int y, int z, boolean receivingPower) {
		if (receivingPower) {
			if (this.isVehicle()) {
				this.ejectPassengers();
			}

			if (this.getHurtTime() == 0) {
				this.setHurtDir(-this.getHurtDir());
				this.setHurtTime(10);
				this.setDamage(50.0F);
				this.markHurt();
			}
		}
	}

	public static AbstractSkinnedCart create(Level worldIn, double x, double y, double z, AbstractSkinnedCart.Type typeIn) {
		AbstractSkinnedCart cart = switch (typeIn) {
			default -> new TurtleCartEntity(CartRegistry.TURTLE_CART.get(), worldIn, x, y, z);
			case ELEPHANT -> new ElephantCartEntity(CartRegistry.ELEPHANT_CART.get(), worldIn, x, y, z);
			case FROG -> new FrogCartEntity(CartRegistry.FROG_CART.get(), worldIn, x, y, z);
			case PANDA -> new PandaCartEntity(CartRegistry.PANDA_CART.get(), worldIn, x, y, z);
			case PELICAN -> new PelicanCartEntity(CartRegistry.PELICAN_CART.get(), worldIn, x, y, z);
			case PUFFERFISH -> new PufferFishCartEntity(CartRegistry.PUFFERFISH_CART.get(), worldIn, x, y, z);
			case SNAIL -> new SnailCartEntity(CartRegistry.SNAIL_CART.get(), worldIn, x, y, z);
			case BEE -> new BeeCartEntity(CartRegistry.BEE_CART.get(), worldIn, x, y, z);
			case GREEN_FROG -> new GreenFrogCartEntity(CartRegistry.GREEN_FROG_CART.get(), worldIn, x, y, z);
			case LADYBUG -> new LadybugCartEntity(CartRegistry.LADYBUG_CART.get(), worldIn, x, y, z);
			case PENGUIN -> new PenguinCartEntity(CartRegistry.PENGUIN_CART.get(), worldIn, x, y, z);
			case WOMBAT -> new WombatCartEntity(CartRegistry.WOMBAT_CART.get(), worldIn, x, y, z);
		};

		return cart;
	}

	public enum Type {
		ELEPHANT(CartRegistry.ELEPHANT_CART_ITEM),
		FROG(CartRegistry.FROG_CART_ITEM),
		PANDA(CartRegistry.PANDA_CART_ITEM),
		PELICAN(CartRegistry.PELICAN_CART_ITEM),
		PUFFERFISH(CartRegistry.PUFFERFISH_CART_ITEM),
		SNAIL(CartRegistry.SNAIL_CART_ITEM),
		TURTLE(CartRegistry.TURTLE_CART_ITEM),
		BEE(CartRegistry.BEE_CART_ITEM),
		GREEN_FROG(CartRegistry.GREEN_FROG_CART_ITEM),
		LADYBUG(CartRegistry.LADYBUG_CART_ITEM),
		PENGUIN(CartRegistry.PENGUIN_CART_ITEM),
		WOMBAT(CartRegistry.WOMBAT_CART_ITEM);

		private final Supplier<Item> returnItem;

		Type(Supplier<Item> itemSupplier) {
			this.returnItem = itemSupplier;
		}

		public Supplier<Item> getReturnItem() {
			return returnItem;
		}
	}
}
