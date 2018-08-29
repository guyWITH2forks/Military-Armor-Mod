package com.guywith2forks.armormod.potion;

import com.guywith2forks.armormod.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionAgility extends Potion

{

	public PotionAgility(boolean isBadEffectIn, int liquidColorIn) 
	{
		super(false, 12379323);
		setPotionName("effect.agility");
		setIconIndex(3, 2);
		setRegistryName( new ResourceLocation(Reference.MOD_ID + ":" + "agility"));
	
	}
	
}
