package com.mrbysco.skinnedcarts.entity;

import java.util.Calendar;

import com.mrbysco.skinnedcarts.config.CartConfigGen;
import com.mrbysco.skinnedcarts.init.CartSounds;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityFrogCart extends EntitySkinnedCart{
	
	public EntityFrogCart(World worldIn) {
		super(worldIn);
	}
	
	private void playLivingSound() {
		SoundEvent sound = CartSounds.wednesday_frog_cart;
        this.playSound(sound, this.getSoundVolume() , this.getSoundPitch());
	}
	
	protected float getSoundVolume()
    {
        return 1.0F;
    }
	
	protected float getSoundPitch()
    {
        return (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F;
    }
	
	@Override
	public SoundCategory getSoundCategory() {
		return SoundCategory.NEUTRAL;
	}
	
	@Override
	public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, EnumHand hand) {
		if(CartConfigGen.general.WednesdayFrogCarts && itsWednesday()) {
			if (!world.isRemote) {
	            this.playLivingSound();
			}
		}
		return super.applyPlayerInteraction(player, vec, hand);
	}
	
	private boolean itsWednesday() {
		return this.world.getCurrentDate().get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
