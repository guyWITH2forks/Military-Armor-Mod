package com.guywith2forks.armormod.armor;

import com.guywith2forks.armormod.Main;
import com.guywith2forks.armormod.init.ModItems;
import com.guywith2forks.armormod.model.ModelHeavyVest;
import com.guywith2forks.armormod.model.ModelLightVest;
import com.guywith2forks.armormod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HeavyVest extends ItemArmor implements IHasModel
{
	public HeavyVest(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	//============================================================================================================
		//Provided by ChampionAsh5357
		@Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
		{
			if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.HEAVY_HELMET
					&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.HEAVY_VEST
					&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.HEAVY_PANTS
					&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.HEAVY_SHOES) 
			{
				this.effectPlayerOne(player, null, 0);
				this.effectPlayerTwo(player, null, 0);
			}
		}
			//
		private void effectPlayerOne(EntityPlayer player, Potion potion, int amplifier) 
		{
				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
						player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 60, 1, false, false));
		}
		private void effectPlayerTwo(EntityPlayer player, Potion potion, int amplifier) 
		{
				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
						player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 0, false, false));
		}
		
	//============================================================================================================	
	
	
	
	
	public ModelHeavyVest getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
		{
		if(!itemStack.isEmpty()) {
			if(itemStack.getItem() instanceof ItemArmor) {
				
				ModelHeavyVest armorModel = new ModelHeavyVest(1.0F);
				ModelHeavyVest armorModelLegs = new ModelHeavyVest(0.5F);
				
				armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
							
				armorModel.isSneak = _default.isSneak;
				armorModel.isRiding = _default.isRiding;
				armorModel.isChild = _default.isChild;
				armorModel.rightArmPose = _default.rightArmPose;
				armorModel.leftArmPose = _default.leftArmPose;

				return armorModel;
			}
		}
		return null;
	
		}
	
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
