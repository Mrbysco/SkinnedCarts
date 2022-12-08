package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class PufferFishCartEntity extends AbstractSkinnedCart {

	public PufferFishCartEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PufferFishCartEntity(EntityType<?> type, Level worldIn, double x, double y, double z) {
		super(type, worldIn, x, y, z);
	}

	public PufferFishCartEntity(SpawnEntity spawnEntity, Level worldIn) {
		this(CartRegistry.PUFFERFISH_CART.get(), worldIn);
	}

	@Override
	public EntityType<?> getType() {
		return CartRegistry.PUFFERFISH_CART.get();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return (Packet<ClientGamePacketListener>) NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public AbstractSkinnedCart.Type getSkinCartType() {
		return Type.PUFFERFISH;
	}

	@Override
	protected Item getReturnItem() {
		return CartRegistry.PUFFERFISH_CART_ITEM.get();
	}
}
