package com.guywith2forks.armormod.potion;

import com.guywith2forks.armormod.Main;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionTypeRegistry 

{
	public static final PotionType AGILITY = new PotionType("agility", new PotionEffect[] {new PotionEffect(Main.AGILITY_POTION, 2400)}).setRegistryName("agility");
	public static final PotionType LONG_AGILITY = new PotionType("agility", new PotionEffect[] {new PotionEffect(Main.AGILITY_POTION, 9600)}).setRegistryName("long_fly");

	public static void registerPotionTypes() 
	{
		ForgeRegistries.POTION_TYPES.register(AGILITY);
		ForgeRegistries.POTION_TYPES.register(LONG_AGILITY);
		PotionHelper.addMix(PotionTypes.INVISIBILITY, Items.ENDER_EYE, AGILITY);
		PotionHelper.addMix(AGILITY, Items.REDSTONE, LONG_AGILITY);
	}
	
}
