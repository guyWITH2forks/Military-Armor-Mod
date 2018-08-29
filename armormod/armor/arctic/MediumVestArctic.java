package com.guywith2forks.armormod.armor.arctic;

import com.guywith2forks.armormod.armor.MediumVest;
import com.guywith2forks.armormod.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MediumVestArctic extends MediumVest

{

	public MediumVestArctic(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		
	}
	
	//============================================================================================================
		//Provided by ChampionAsh5357
		@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
		{
			if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.MEDIUM_HELMET_ARCTIC
					&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.MEDIUM_VEST_ARCTIC
					&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.MEDIUM_PANTS_ARCTIC
					&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.MEDIUM_SHOES_ARCTIC) 
			{
				this.effectPlayerOne(player, null, 0);
				//this.effectPlayerTwo(player, null, 0);
			}
		}
			//
		private void effectPlayerOne(EntityPlayer player, Potion potion, int amplifier) 
		{
				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
						player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 60, 0, false, false));
		}
//		private void effectPlayerTwo(EntityPlayer player, Potion potion, int amplifier) 
//		{
//				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
//						player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5000, 0, false, false));
//		}
		
	//============================================================================================================	
	
	
	
}
