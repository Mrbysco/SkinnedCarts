package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public abstract class AbstractSkinnedCart extends Minecart {

	public AbstractSkinnedCart(EntityType<?> type, Level level) {
		super(type, level);
	}

	public AbstractSkinnedCart(EntityType<?> type, Level level, double x, double y, double z) {
		super(level, x, y, z);
	}

	protected abstract Item getReturnItem();

	@Override
	public Item getDropItem() {
		return this.getReturnItem();
	}

	public abstract AbstractSkinnedCart.Type getSkinCartType();

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(this.getDropItem());
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	public static AbstractSkinnedCart create(Level level, double x, double y, double z, AbstractSkinnedCart.Type typeIn) {
		AbstractSkinnedCart cart = switch (typeIn) {
			default -> new TurtleCartEntity(CartRegistry.TURTLE_CART.get(), level, x, y, z);
			case ELEPHANT -> new ElephantCartEntity(CartRegistry.ELEPHANT_CART.get(), level, x, y, z);
			case FROG -> new FrogCartEntity(CartRegistry.FROG_CART.get(), level, x, y, z);
			case PANDA -> new PandaCartEntity(CartRegistry.PANDA_CART.get(), level, x, y, z);
			case PELICAN -> new PelicanCartEntity(CartRegistry.PELICAN_CART.get(), level, x, y, z);
			case PUFFERFISH -> new PufferFishCartEntity(CartRegistry.PUFFERFISH_CART.get(), level, x, y, z);
			case SNAIL -> new SnailCartEntity(CartRegistry.SNAIL_CART.get(), level, x, y, z);
			case BEE -> new BeeCartEntity(CartRegistry.BEE_CART.get(), level, x, y, z);
			case GREEN_FROG -> new GreenFrogCartEntity(CartRegistry.GREEN_FROG_CART.get(), level, x, y, z);
			case LADYBUG -> new LadybugCartEntity(CartRegistry.LADYBUG_CART.get(), level, x, y, z);
			case PENGUIN -> new PenguinCartEntity(CartRegistry.PENGUIN_CART.get(), level, x, y, z);
			case WOMBAT -> new WombatCartEntity(CartRegistry.WOMBAT_CART.get(), level, x, y, z);
		};

		return cart;
	}

	public enum Type {
		ELEPHANT,
		FROG,
		PANDA,
		PELICAN,
		PUFFERFISH,
		SNAIL,
		TURTLE,
		BEE,
		GREEN_FROG,
		LADYBUG,
		PENGUIN,
		WOMBAT;
	}
}
