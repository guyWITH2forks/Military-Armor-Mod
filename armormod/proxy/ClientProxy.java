package com.guywith2forks.armormod.proxy;

import org.lwjgl.input.Keyboard;

import com.guywith2forks.armormod.armor.HeavyHelmet;
import com.guywith2forks.armormod.init.ModItems;
import com.guywith2forks.armormod.init.ModKeyBindings;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy
{
	protected boolean isClient()
	  {
	    return true;
	  }
	
	
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	
//@EventHandler
//    
//    public void init(FMLInitializationEvent event)
//    {
//	
//	 final ArmorMaterial ARMOR_HEAVY = EnumHelper.addArmorMaterial
//			("armor_heavy", "am:heavy", 100, new int[] {1, 0, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
//	
//	
//	 final Item HEAVY_HELMET = new HeavyHelmet("heavy_helmet", ARMOR_HEAVY, 1, EntityEquipmentSlot.HEAD);
//    	
//    }
	
	
	
	
	
	
	
	
}

