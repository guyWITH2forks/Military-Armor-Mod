package com.guywith2forks.armormod;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.Mod.Instance;

import org.lwjgl.input.Keyboard;

import com.guywith2forks.armormod.init.ModKeyBindings;
import com.guywith2forks.armormod.potion.PotionAgility;
import com.guywith2forks.armormod.potion.PotionTypeRegistry;
import com.guywith2forks.armormod.proxy.ClientProxy;
import com.guywith2forks.armormod.proxy.CommonProxy;
import com.guywith2forks.armormod.util.Reference;
import com.guywith2forks.armormod.util.handlers.RenderGuiHandler;


@Mod
(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

    @Instance
    public static Main Instance;
    
    @SidedProxy
    (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

//	private static KeyBinding[] keyBindings;
    
    //Potion Registration
    public static final Potion AGILITY_POTION = new PotionAgility(false, 60);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      
    	ForgeRegistries.POTIONS.register(AGILITY_POTION);
    	PotionTypeRegistry.registerPotionTypes();    	
    }

    @EventHandler
    
    public void init(FMLInitializationEvent event)
    {
    	System.out.println("CHan was here from FML INIt");
   // 	ModKeyBindings.registerKeyBindings();
    	
    }
    
    @EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
    	MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
    	MinecraftForge.EVENT_BUS.register(MainEvents.class);
	}
}
