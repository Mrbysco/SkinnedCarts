package com.mrbysco.skinnedcarts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrbysco.skinnedcarts.config.CartConfigGen;
import com.mrbysco.skinnedcarts.init.CartEntities;
import com.mrbysco.skinnedcarts.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, 
	name = Reference.MOD_NAME, 
	version = Reference.VERSION, 
	acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS,
	dependencies = Reference.DEPENDENCIES)

public class SkinnedCarts {
	@Instance(Reference.MOD_ID)
	public static SkinnedCarts instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
		
	public static CartTab cartTab = new CartTab();
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		logger.info("Registering Skinned Cart Config");
		MinecraftForge.EVENT_BUS.register(new CartConfigGen());

		logger.info("Registering Skinned Cart Entities");
		CartEntities.register();
		
		proxy.Preinit();
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event)
	{
		proxy.Init();
    }
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		proxy.PostInit();
    }
}
