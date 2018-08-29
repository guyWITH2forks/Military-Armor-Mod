package com.guywith2forks.armormod.armor;

import com.guywith2forks.armormod.Main;
import com.guywith2forks.armormod.init.ModItems;
import com.guywith2forks.armormod.model.ModelMediumShoes;
import com.guywith2forks.armormod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MediumShoes extends ItemArmor implements IHasModel
{
	public MediumShoes(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
	
		ModItems.ITEMS.add(this);
	}

			//Insert Model Code Here
	
	@Override
	public ModelMediumShoes getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
		{
		if(!itemStack.isEmpty()) {
			if(itemStack.getItem() instanceof ItemArmor) {
				
				ModelMediumShoes armorModel = new ModelMediumShoes(1.0F);
				ModelMediumShoes armorModelLegs = new ModelMediumShoes(1.0F);
				
				armorModel.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
				armorModel.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
				
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
