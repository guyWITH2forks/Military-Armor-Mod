package com.guywith2forks.armormod.armor.arctic;

import com.guywith2forks.armormod.Main;
import com.guywith2forks.armormod.init.ModItems;
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

public class LightVestArctic extends ItemArmor implements IHasModel
{
	public LightVestArctic(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
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
			if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.LIGHT_HELMET_ARCTIC
					&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.LIGHT_VEST_ARCTIC
					&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.LIGHT_PANTS_ARCTIC
					&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.LIGHT_SHOES_ARCTIC) 
			{
				this.effectPlayerOne(player, null, 0);
				this.effectPlayerTwo(player, null, 0);
			}
		}
			//
		private void effectPlayerOne(EntityPlayer player, Potion potion, int amplifier) 
		{
				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
						player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 60, 0, false, false));
		}
		private void effectPlayerTwo(EntityPlayer player, Potion potion, int amplifier) 
		{
				if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
						player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 60, 0, false, false));
		}
		
	//============================================================================================================	
	
	
	
	
	@Override
	public ModelLightVest getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
		{
		if(!itemStack.isEmpty()) {
			if(itemStack.getItem() instanceof ItemArmor) {
				
				ModelLightVest armorModel = new ModelLightVest(1.0F);
				ModelLightVest armorModelLegs = new ModelLightVest(0.5F);
				
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
