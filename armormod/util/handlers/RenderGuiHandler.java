package com.guywith2forks.armormod.util.handlers;

import com.guywith2forks.armormod.gui.GuiMonoNv;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class RenderGuiHandler 
{
	
	@SubscribeEvent
	public void onRenderGui(RenderGameOverlayEvent.Post event)
	{
		if (event.getType() != ElementType.EXPERIENCE) return;
		new GuiMonoNv(Minecraft.getMinecraft());
	}
	
	
}
