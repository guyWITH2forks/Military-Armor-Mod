package com.guywith2forks.armormod.armor.nv;

import com.guywith2forks.armormod.Main;
import com.guywith2forks.armormod.init.ModItems;
import com.guywith2forks.armormod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class MonoNv extends ItemArmor implements IHasModel
{

	public MonoNv(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	//============================================================================================================
		//Provided by ChampionAsh5357
//		@Override
//		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
//		{
//			if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.MONO_NV)
//					 
//			{
//				this.effectPlayerOne(player, null, 0);
//			//	this.effectPlayerTwo(player, null, 0);
//			}
//		}
//			//
//		private void effectPlayerOne(EntityPlayer player, Potion potion, int amplifier) 
//		{
//				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
//						player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 210, 0, false, false));
//		}
////		private void effectPlayerTwo(EntityPlayer player, Potion potion, int amplifier) 
////		{
////				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
////						player.addPotionEffect(new PotionEffect(MobEffects., 60, 0, false, false));
////					
////		}
		
	//============================================================================================================	
	
	
	
	
	
	
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
