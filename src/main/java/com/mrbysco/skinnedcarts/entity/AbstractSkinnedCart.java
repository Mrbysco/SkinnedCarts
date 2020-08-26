package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.function.Supplier;

public abstract class AbstractSkinnedCart extends AbstractMinecartEntity {
    
	public AbstractSkinnedCart(EntityType<?> type, World worldIn) {
		super(type, worldIn);
	}
	
	public AbstractSkinnedCart(EntityType<?> type, World worldIn, double x, double y, double z)
    {
        super(type, worldIn, x, y, z);
    }

	@Override
	public void killMinecart(DamageSource source) {
        this.remove();
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            ItemStack itemstack = this.getReturnItem();
            if (this.hasCustomName()) {
                itemstack.setDisplayName(this.getCustomName());
            }

            this.entityDropItem(itemstack);
        }
	}
	
	
	public ItemStack getReturnItem()
    {
        return new ItemStack(this.getSkinCartType().getReturnItem().get());
    }

    @Override
    public AbstractMinecartEntity.Type getMinecartType() {
        return AbstractMinecartEntity.Type.RIDEABLE;
    }

    abstract AbstractSkinnedCart.Type getSkinCartType();

    @Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return this.getCartItem();
	}
	
	@Override
	public ItemStack getCartItem() {
		return this.getReturnItem();
	}
	
	@Override
	public boolean isPoweredCart() {
		return false;
	}

    @Override
    public boolean processInitialInteract(PlayerEntity player, Hand hand) {
        if (super.processInitialInteract(player, hand)) return true;
        if (player.isSecondaryUseActive()) {
            return false;
        } else if (this.isBeingRidden()) {
            return true;
        } else {
            if (!this.world.isRemote) {
                player.startRiding(this);
            }

            return true;
        }
    }

    /**
     * Called every tick the minecart is on an activator rail.
     */
    public void onActivatorRailPass(int x, int y, int z, boolean receivingPower)
    {
        if (receivingPower) {
            if (this.isBeingRidden()) {
                this.removePassengers();
            }

            if (this.getRollingAmplitude() == 0) {
                this.setRollingDirection(-this.getRollingDirection());
                this.setRollingAmplitude(10);
                this.setDamage(50.0F);
                this.markVelocityChanged();
            }
        }
    }

    public static AbstractSkinnedCart create(World worldIn, double x, double y, double z, AbstractSkinnedCart.Type typeIn) {
        AbstractSkinnedCart cart;
        switch(typeIn) {
            default:
                cart = new TurtleCartEntity(CartRegistry.TURTLE_CART.get(), worldIn, x, y, z);
                break;
            case ELEPHANT:
                cart = new ElephantCartEntity(CartRegistry.ELEPHANT_CART.get(), worldIn, x, y, z);
                break;
            case FROG:
                cart = new FrogCartEntity(CartRegistry.FROG_CART.get(), worldIn, x, y, z);
                break;
            case PANDA:
                cart = new PandaCartEntity(CartRegistry.PANDA_CART.get(), worldIn, x, y, z);
                break;
            case PELICAN:
                cart = new PelicanCartEntity(CartRegistry.PELICAN_CART.get(), worldIn, x, y, z);
                break;
            case PUFFERFISH:
                cart = new PufferFishCartEntity(CartRegistry.PUFFERFISH_CART.get(), worldIn, x, y, z);
                break;
            case SNAIL:
                cart = new SnailCartEntity(CartRegistry.SNAIL_CART.get(), worldIn, x, y, z);
                break;
            case BEE:
                cart = new SnailCartEntity(CartRegistry.BEE_CART.get(), worldIn, x, y, z);
                break;
            case GREEN_FROG:
                cart = new SnailCartEntity(CartRegistry.GREEN_FROG_CART.get(), worldIn, x, y, z);
                break;
            case LADYBUG:
                cart = new SnailCartEntity(CartRegistry.LADYBUG_CART.get(), worldIn, x, y, z);
                break;
            case PENGUIN:
                cart = new SnailCartEntity(CartRegistry.PENGUIN_CART.get(), worldIn, x, y, z);
                break;
            case WOMBAT:
                cart = new SnailCartEntity(CartRegistry.WOMBAT_CART.get(), worldIn, x, y, z);
                break;
        }

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
