package com.guywith2forks.armormod.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelLightHelmet extends ModelBiped
{
	  //fields
	    
	ModelRenderer L_Ear;
    ModelRenderer R_Ear;
    ModelRenderer R_Head_Strap;
    ModelRenderer L_Head_Strap;
    ModelRenderer Top_Strap;
    ModelRenderer Mic_Arm1;
    ModelRenderer Mic_Arm_2;

	    	
	  public ModelLightHelmet(float scale)
	  {
	    	super(scale, 0, 128, 128);
	    textureWidth = 128;
	    textureHeight = 128;
	    
	    
	    L_Ear = new ModelRenderer(this, 50, 90);
	      L_Ear.addBox(4F, -5.5F, -1F, 1, 3, 3);
	      L_Ear.setRotationPoint(0F, 0F, 0F);
	      L_Ear.setTextureSize(128, 128);
	      L_Ear.mirror = true;
	      setRotation(L_Ear, 0F, 0F, 0F);
	      R_Ear = new ModelRenderer(this, 70, 90);
	      R_Ear.addBox(-5F, -5.5F, -1F, 1, 3, 3);
	      R_Ear.setRotationPoint(0F, 0F, 0F);
	      R_Ear.setTextureSize(128, 128);
	      R_Ear.mirror = true;
	      setRotation(R_Ear, 0F, 0F, 0F);
	      R_Head_Strap = new ModelRenderer(this, 66, 90);
	      R_Head_Strap.addBox(-5F, -8.5F, 0.3F, 1, 3, 1);
	      R_Head_Strap.setRotationPoint(0F, 0F, 0F);
	      R_Head_Strap.setTextureSize(128, 128);
	      R_Head_Strap.mirror = true;
	      setRotation(R_Head_Strap, 0F, 0F, 0F);
	      L_Head_Strap = new ModelRenderer(this, 58, 90);
	      L_Head_Strap.addBox(4F, -8.5F, 0.3F, 1, 3, 1);
	      L_Head_Strap.setRotationPoint(0F, 0F, 0F);
	      L_Head_Strap.setTextureSize(128, 128);
	      L_Head_Strap.mirror = true;
	      setRotation(L_Head_Strap, 0F, 0F, 0F);
	      Top_Strap = new ModelRenderer(this, 55, 88);
	      Top_Strap.addBox(-4F, -8.5F, 0.3F, 8, 1, 1);
	      Top_Strap.setRotationPoint(0F, 0F, 0F);
	      Top_Strap.setTextureSize(128, 128);
	      Top_Strap.mirror = true;
	      setRotation(Top_Strap, 0F, 0F, 0F);
	      Mic_Arm1 = new ModelRenderer(this, 60, 96);
	      Mic_Arm1.addBox(-4.7F, -3F, -5F, 0, 1, 4);
	      Mic_Arm1.setRotationPoint(0F, 0F, 0F);
	      Mic_Arm1.setTextureSize(128, 128);
	      Mic_Arm1.mirror = true;
	      setRotation(Mic_Arm1, 0F, 0F, 0F);
	      Mic_Arm_2 = new ModelRenderer(this, 65, 95);
	      Mic_Arm_2.addBox(-4.7F, -3F, -5F, 2, 1, 0);
	      Mic_Arm_2.setRotationPoint(0F, 0F, 0F);
	      Mic_Arm_2.setTextureSize(128, 128);
	      Mic_Arm_2.mirror = true;
	      setRotation(Mic_Arm_2, 0F, 0F, 0F);	
	        
	        bipedHead.addChild(L_Ear);
	        bipedHead.addChild(R_Ear);
	        bipedHead.addChild(R_Head_Strap);
	        bipedHead.addChild(L_Head_Strap);
	        bipedHead.addChild(Top_Strap);
	        bipedHead.addChild(Mic_Arm1);
	        bipedHead.addChild(Mic_Arm_2);
	        
	        
	        
	        
	        
	        
	        
	  	}
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
}	  
