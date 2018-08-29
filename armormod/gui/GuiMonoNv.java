package com.guywith2forks.armormod.gui;

import com.guywith2forks.armormod.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiMonoNv
{
	 String text = "Hello world!";
	 
	 
	 
	 
	public GuiMonoNv(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		drawCenteredString(mc.fontRenderer, text, width / 2, (height / 2) - 4, Integer.parseInt("FFAA00", 16));
		
	}




	private void drawCenteredString(FontRenderer fontRenderer, String text2, int i, int j, int parseInt) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
