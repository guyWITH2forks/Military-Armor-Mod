package com.guywith2forks.armormod.init;

import java.util.ArrayList;
import java.util.List;

import com.guywith2forks.armormod.armor.MediumShoes;
import com.guywith2forks.armormod.armor.HeavyHelmet;
import com.guywith2forks.armormod.armor.HeavyPants;
import com.guywith2forks.armormod.armor.HeavyShoes;
import com.guywith2forks.armormod.armor.HeavyVest;
import com.guywith2forks.armormod.armor.LightHelmet;
import com.guywith2forks.armormod.armor.LightPants;
import com.guywith2forks.armormod.armor.LightShoes;
import com.guywith2forks.armormod.armor.LightVest;
import com.guywith2forks.armormod.armor.MediumHelmet;
import com.guywith2forks.armormod.armor.MediumPants;
import com.guywith2forks.armormod.armor.MediumVest;
import com.guywith2forks.armormod.armor.arctic.HeavyHelmetArctic;
import com.guywith2forks.armormod.armor.arctic.HeavyPantsArctic;
import com.guywith2forks.armormod.armor.arctic.HeavyShoesArctic;
import com.guywith2forks.armormod.armor.arctic.HeavyVestArctic;
import com.guywith2forks.armormod.armor.arctic.LightHelmetArctic;
import com.guywith2forks.armormod.armor.arctic.LightPantsArctic;
import com.guywith2forks.armormod.armor.arctic.LightShoesArctic;
import com.guywith2forks.armormod.armor.arctic.LightVestArctic;
import com.guywith2forks.armormod.armor.arctic.MediumHelmetArctic;
import com.guywith2forks.armormod.armor.arctic.MediumPantsArctic;
import com.guywith2forks.armormod.armor.arctic.MediumShoesArctic;
import com.guywith2forks.armormod.armor.arctic.MediumVestArctic;
import com.guywith2forks.armormod.armor.nv.MonoNv;
import com.guywith2forks.armormod.items.ItemBase;
import com.guywith2forks.armormod.items.camo.ArcticCamoKit;
import com.guywith2forks.armormod.items.tools.ToolAxe;
import com.guywith2forks.armormod.items.tools.ToolPickaxe;
import com.guywith2forks.armormod.items.tools.ToolSpade;
import com.guywith2forks.armormod.items.tools.ToolSword;
import com.guywith2forks.armormod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// ======= Material =======
	public static final ArmorMaterial ARMOR_HEAVY = EnumHelper.addArmorMaterial
			("armor_heavy", "am:heavy", 100, new int[] {1, 0, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_HEAVY_ARCTIC = EnumHelper.addArmorMaterial
			("armor_heavy_arctic", "am:heavy_arctic", 100, new int[] {1, 0, 8, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	//--------
	public static final ArmorMaterial ARMOR_MEDIUM = EnumHelper.addArmorMaterial
			("armor_medium", "am:medium", 100, new int[] {1, 0, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
														// {Boots, Legs, Chest, Head}
	public static final ArmorMaterial ARMOR_MEDIUM_ARCTIC = EnumHelper.addArmorMaterial
			("armor_medium_arctic", "am:medium_arctic", 100, new int[] {1, 1, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//--------
	public static final ArmorMaterial ARMOR_LIGHT = EnumHelper.addArmorMaterial
			("armor_light", "am:light", 100, new int[] {0, 0, 3, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static final ArmorMaterial ARMOR_LIGHT_ARCTIC = EnumHelper.addArmorMaterial
			("armor_light_arctic", "am:light_arctic", 100, new int[] {0, 0, 3, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);	

	//--------
	public static final ArmorMaterial NIGHT_VISION = EnumHelper.addArmorMaterial
			("night_vision", "am:nv", 100, new int[] {0, 0, 0, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	
	public static final ToolMaterial MATERIAL_CARBON = EnumHelper.addToolMaterial("material_carbon", 3, 2000, 6.5F, 1.0F, 5);
	
	// =======   Armor  =======
			// Heavy Base
	@SideOnly(Side.CLIENT)
	public static final Item HEAVY_HELMET = new HeavyHelmet("heavy_helmet", ARMOR_HEAVY, 1, EntityEquipmentSlot.HEAD);
	public static final Item HEAVY_VEST = new HeavyVest("heavy_vest", ARMOR_HEAVY, 1, EntityEquipmentSlot.CHEST);
	public static final Item HEAVY_PANTS = new HeavyPants("heavy_pants", ARMOR_MEDIUM, 2, EntityEquipmentSlot.LEGS);		
	public static final Item HEAVY_SHOES = new HeavyShoes("heavy_shoes", ARMOR_MEDIUM, 1, EntityEquipmentSlot.FEET);
		
	public static final Item HEAVY_HELMET_ARCTIC = new HeavyHelmetArctic("heavy_helmet_arctic", ARMOR_HEAVY_ARCTIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item HEAVY_VEST_ARCTIC = new HeavyVestArctic("heavy_vest_arctic", ARMOR_HEAVY_ARCTIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item HEAVY_PANTS_ARCTIC = new HeavyPantsArctic("heavy_pants_arctic", ARMOR_MEDIUM_ARCTIC, 2, EntityEquipmentSlot.LEGS);		
	public static final Item HEAVY_SHOES_ARCTIC = new HeavyShoesArctic("heavy_shoes_arctic", ARMOR_MEDIUM_ARCTIC, 1, EntityEquipmentSlot.FEET);
	
			// Medium Base
	public static final Item MEDIUM_HELMET = new MediumHelmet("medium_helmet", ARMOR_MEDIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item MEDIUM_VEST = new MediumVest("medium_vest", ARMOR_MEDIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item MEDIUM_PANTS = new MediumPants("medium_pants", ARMOR_MEDIUM, 2, EntityEquipmentSlot.LEGS);		
	public static final Item MEDIUM_SHOES = new MediumShoes("medium_shoes", ARMOR_MEDIUM, 1, EntityEquipmentSlot.FEET);
			// Medium Arctic
	public static final Item MEDIUM_HELMET_ARCTIC = new MediumHelmetArctic("medium_helmet_arctic", ARMOR_MEDIUM_ARCTIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item MEDIUM_VEST_ARCTIC = new MediumVestArctic("medium_vest_arctic", ARMOR_MEDIUM_ARCTIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item MEDIUM_PANTS_ARCTIC = new MediumPantsArctic("medium_pants_arctic", ARMOR_MEDIUM_ARCTIC, 2, EntityEquipmentSlot.LEGS);		
	public static final Item MEDIUM_SHOES_ARCTIC = new MediumShoesArctic("medium_shoes_arctic", ARMOR_MEDIUM_ARCTIC, 1, EntityEquipmentSlot.FEET);
	
	
	
			//Light Base
	public static final Item LIGHT_HELMET = new LightHelmet("light_helmet", ARMOR_LIGHT, 1, EntityEquipmentSlot.HEAD);
	public static final Item LIGHT_VEST = new LightVest("light_vest", ARMOR_LIGHT, 1, EntityEquipmentSlot.CHEST);
	public static final Item LIGHT_PANTS = new LightPants("light_pants", ARMOR_MEDIUM, 2, EntityEquipmentSlot.LEGS);		
	public static final Item LIGHT_SHOES = new LightShoes("light_shoes", ARMOR_MEDIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item LIGHT_HELMET_ARCTIC = new LightHelmetArctic("light_helmet_arctic", ARMOR_LIGHT_ARCTIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item LIGHT_VEST_ARCTIC = new LightVestArctic("light_vest_arctic", ARMOR_LIGHT_ARCTIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item LIGHT_PANTS_ARCTIC = new LightPantsArctic("light_pants_arctic", ARMOR_MEDIUM_ARCTIC, 2, EntityEquipmentSlot.LEGS);		
	public static final Item LIGHT_SHOES_ARCTIC = new LightShoesArctic("light_shoes_arctic", ARMOR_MEDIUM_ARCTIC, 1, EntityEquipmentSlot.FEET);
	
	
	
			//Specials
	//public static final Item MONO_NV = new MonoNv("mono_nv", NIGHT_VISION, 1, EntityEquipmentSlot.HEAD);
	
	
	// =======   Items  =======
	public static final Item ARCTIC_CAMO_KIT = new ArcticCamoKit("arctic_camo_kit");
	
	
	
	// ======= Tools =======
	public static final ItemSword CARBON_SWORD = new ToolSword("carbon_knife", MATERIAL_CARBON);
	public static final ItemSpade CARBON_SHOVEL = new ToolSpade("carbon_shovel", MATERIAL_CARBON);
	public static final ItemPickaxe CARBON_PICKAXE = new ToolPickaxe("carbon_pickaxe", MATERIAL_CARBON);
	public static final ItemAxe CARBON_AXE = new ToolAxe("carbon_axe", MATERIAL_CARBON);
	
	
	
	
//	static final CreativeTabs tabGWTFArmor = (new CreativeTabs("tabGWTFArmor"));
//			{
//				@Override
//				public ItemStack getTabIconItem() 
//				{
//					return new ItemStack(medium_vest);
//				}
//			}
	static final CreativeTabs tabArmorMod = (new CreativeTabs("tabArmorMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MEDIUM_VEST);
		}
		
	});
	
}
