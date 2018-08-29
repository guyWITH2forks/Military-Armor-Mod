package com.guywith2forks.armormod.armor;

import com.guywith2forks.armormod.Main;
import com.guywith2forks.armormod.init.ModItems;
import com.guywith2forks.armormod.model.ModelHeavyHelmet;
import com.guywith2forks.armormod.model.ModelLightHelmet;
import com.guywith2forks.armormod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class HeavyHelmet extends ItemArmor implements IHasModel
{
	public HeavyHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	
	@Override
	
	public ModelHeavyHelmet getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
		{
		if(!itemStack.isEmpty()) {
			if(itemStack.getItem() instanceof ItemArmor) {
				
				ModelHeavyHelmet armorModel = new ModelHeavyHelmet(1.0F);
				ModelHeavyHelmet armorModelLegs = new ModelHeavyHelmet(0.5F);
				
				armorModel.bipedHead.showModel = (armorSlot == EntityEquipmentSlot.HEAD);
				armorModel.bipedHeadwear.showModel = (armorSlot == EntityEquipmentSlot.HEAD);
				
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