package com.mrbysco.skinnedcarts.entity;

import com.mrbysco.skinnedcarts.init.CartRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
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
	public void destroy(DamageSource source) {
        this.remove();
        if (this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
            ItemStack itemstack = this.getReturnItem();
            if (this.hasCustomName()) {
                itemstack.setHoverName(this.getCustomName());
            }

            this.spawnAtLocation(itemstack);
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
	
	public ActionResultType interact(PlayerEntity player, Hand hand) {
        ActionResultType ret = super.interact(player, hand);
        if (ret.consumesAction()) return ret;
        if (player.isSecondaryUseActive()) {
            return ActionResultType.PASS;
        } else if (this.isVehicle()) {
            return ActionResultType.PASS;
        } else if (!this.level.isClientSide) {
            return player.startRiding(this) ? ActionResultType.CONSUME : ActionResultType.PASS;
        } else {
            return ActionResultType.SUCCESS;
        }
    }

    /**
     * Called every tick the minecart is on an activator rail.
     */
    public void activateMinecart(int x, int y, int z, boolean receivingPower)
    {
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
                cart = new BeeCartEntity(CartRegistry.BEE_CART.get(), worldIn, x, y, z);
                break;
            case GREEN_FROG:
                cart = new GreenFrogCartEntity(CartRegistry.GREEN_FROG_CART.get(), worldIn, x, y, z);
                break;
            case LADYBUG:
                cart = new LadybugCartEntity(CartRegistry.LADYBUG_CART.get(), worldIn, x, y, z);
                break;
            case PENGUIN:
                cart = new PenguinCartEntity(CartRegistry.PENGUIN_CART.get(), worldIn, x, y, z);
                break;
            case WOMBAT:
                cart = new WombatCartEntity(CartRegistry.WOMBAT_CART.get(), worldIn, x, y, z);
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
