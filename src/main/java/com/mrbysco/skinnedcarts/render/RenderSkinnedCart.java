package com.mrbysco.skinnedcarts.render;

import com.mrbysco.skinnedcarts.Reference;
import com.mrbysco.skinnedcarts.entity.EntitySkinnedCart;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSkinnedCart<T extends EntitySkinnedCart> extends Render<T>
{
    private ResourceLocation CART_TEXTURES;

    public RenderSkinnedCart(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
        this.shadowSize = 0.5F;
    }
    
    public static ResourceLocation createLocation(String cartName) {
    	return new ResourceLocation(Reference.MOD_PREFIX + "textures/entity/" + cartName + ".png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(T entity)
    {
        return CART_TEXTURES;
    }
}