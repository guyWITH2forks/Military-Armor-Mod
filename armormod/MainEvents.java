package com.guywith2forks.armormod;

import com.guywith2forks.armormod.init.ModKeyBindings;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MainEvents 
{
//	@SubscribeEvent
//	public static void onClientTick(ClientTickEvent event) {
//	  KeyBinding[] keyBindings = ModKeyBindings.keyBindings;
//	 
//	  // while the key is pressed down, these statements will fire every client tick
//	  if (keyBindings[0].isKeyDown()) {
//	      System.out.println("Key binding P");
//	  }
//	  
//	  if (keyBindings[1].isKeyDown()) {
//	      System.out.println("Key binding H");
//	  }
//    }
	
//	@SubscribeEvent
//	public static void onKeyPress(KeyInputEvent event) {
//		KeyBinding[] keyBindings = ModKeyBindings.keyBindings;
//		
//		if (keyBindings[0].isKeyDown()) {
//			System.out.println("Key binding P");
//		}
//	  
//		if (keyBindings[1].isKeyDown()) {
//			System.out.println("Key binding H");
//		}
//	}
	
	@SubscribeEvent
	public static void onAgility(PlayerTickEvent event)
	{

	}
}
