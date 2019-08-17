package com.mrbysco.skinnedcarts.entity;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntitySkinnedCart extends EntityMinecart{

    private static final DataParameter<String> ITEM = EntityDataManager.<String>createKey(EntitySkinnedCart.class, DataSerializers.STRING);
    
    private ItemStack returnItem = new ItemStack(Items.MINECART, 1);
    
	public EntitySkinnedCart(World worldIn) {
		super(worldIn);
	}
	
	public EntitySkinnedCart(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
	
	@Override
	protected void entityInit() {
		super.entityInit();
        this.dataManager.register(ITEM, "minecraft:minecart");
	}
	
	@Override
	public void killMinecart(DamageSource source) {
		this.setDead();

        if (this.world.getGameRules().getBoolean("doEntityDrops"))
        {
            ItemStack itemstack = getReturnItem();

            if (this.hasCustomName())
            {
                itemstack.setStackDisplayName(this.getCustomNameTag());
            }

            this.entityDropItem(itemstack, 0.0F);
        }
	}
	
	
	public ItemStack getReturnItem()
    {
        return new ItemStack(Item.getByNameOrId(((String)this.dataManager.get(ITEM))), 1);
    }

    public void setReturnItem(String item)
    {
        this.dataManager.set(ITEM, String.valueOf(item));
    }
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		
		if (((String)this.dataManager.get(ITEM)).isEmpty())
        {
            compound.setString("returnItem", ((String)this.dataManager.get(ITEM)));
        }
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		
        this.dataManager.set(ITEM, String.valueOf(compound.getString("returnItem")));

		this.returnItem = new ItemStack(Item.getByNameOrId(compound.getString("returnItem")), 1);
	}
	
	@Override
	public Type getType() {
		return Type.RIDEABLE;
	}
	
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
	
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
    {
        if (super.processInitialInteract(player, hand)) return true;

        if (player.isSneaking())
        {
            return false;
        }
        else if (this.isBeingRidden())
        {
            return true;
        }
        else
        {
            if (!this.world.isRemote)
            {
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
        if (receivingPower)
        {
            if (this.isBeingRidden())
            {
                this.removePassengers();
            }

            if (this.getRollingAmplitude() == 0)
            {
                this.setRollingDirection(-this.getRollingDirection());
                this.setRollingAmplitude(10);
                this.setDamage(50.0F);
                this.markVelocityChanged();
            }
        }
    }
}
