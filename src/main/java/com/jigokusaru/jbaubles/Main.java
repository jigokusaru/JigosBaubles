package com.jigokusaru.jbaubles;

import com.jigokusaru.jbaubles.proxy.CommonProxy;
import com.jigokusaru.jbaubles.utils.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class Main {
	
	@Instance
	public Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent e){
				
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent e){
		
	}
}
