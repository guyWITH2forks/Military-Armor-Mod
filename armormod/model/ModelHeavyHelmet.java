package com.guywith2forks.armormod.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelHeavyHelmet extends ModelBiped
{
	
	ModelRenderer H_Front;
    ModelRenderer H_Back;
    ModelRenderer H_L_Top;
    ModelRenderer H_R_Top;
    ModelRenderer H_R_Low;
    ModelRenderer H_L_Low;
    ModelRenderer H_Top;
	
	
    public ModelHeavyHelmet(float scale)
    {
    	super(scale, 0, 128, 128);
	    textureWidth = 128;
	    textureHeight = 128;
	    
	    H_Front = new ModelRenderer(this, 82, 41);
	      H_Front.addBox(-4.5F, -8.5F, -5F, 9, 3, 1);
	      H_Front.setRotationPoint(0F, 0F, 0F);
	      H_Front.setTextureSize(64, 32);
	      H_Front.mirror = true;
	      setRotation(H_Front, 0F, 0F, 0F);
	      H_Back = new ModelRenderer(this, 82, 16);
	      H_Back.addBox(-4.5F, -8.5F, 4F, 9, 7, 1);
	      H_Back.setRotationPoint(0F, 0F, 0F);
	      H_Back.setTextureSize(64, 32);
	      H_Back.mirror = true;
	      setRotation(H_Back, 0F, 0F, 0F);
	      H_L_Top = new ModelRenderer(this, 64, 27);
	      H_L_Top.addBox(3.5F, -8.5F, -4F, 1, 3, 8);
	      H_L_Top.setRotationPoint(0F, 0F, 0F);
	      H_L_Top.setTextureSize(64, 32);
	      H_L_Top.mirror = true;
	      setRotation(H_L_Top, 0F, 0F, 0F);
	      H_R_Top = new ModelRenderer(this, 102, 27);
	      H_R_Top.addBox(-4.5F, -8.5F, -4F, 1, 3, 8);
	      H_R_Top.setRotationPoint(0F, 0F, 0F);
	      H_R_Top.setTextureSize(64, 32);
	      H_R_Top.mirror = true;
	      setRotation(H_R_Top, 0F, 0F, 0F);
	      H_R_Low = new ModelRenderer(this, 103, 39);
	      H_R_Low.addBox(-5F, -5.5F, -2F, 1, 4, 6);
	      H_R_Low.setRotationPoint(0F, 0F, 0F);
	      H_R_Low.setTextureSize(64, 32);
	      H_R_Low.mirror = true;
	      setRotation(H_R_Low, 0F, 0F, 0F);
	      H_L_Low = new ModelRenderer(this, 67, 39);
	      H_L_Low.addBox(4F, -5.5F, -2F, 1, 4, 6);
	      H_L_Low.setRotationPoint(0F, 0F, 0F);
	      H_L_Low.setTextureSize(64, 32);
	      H_L_Low.mirror = true;
	      setRotation(H_L_Low, 0F, 0F, 0F);
	      H_Top = new ModelRenderer(this, 77, 6);
	      H_Top.addBox(-3.5F, -9F, -4F, 7, 1, 8);
	      H_Top.setRotationPoint(0F, 0F, 0F);
	      H_Top.setTextureSize(64, 32);
	      H_Top.mirror = true;
	      setRotation(H_Top, 0F, 0F, 0F);
	    
	        bipedHead.addChild(H_Front);
	        bipedHead.addChild(H_Back);
	        bipedHead.addChild(H_L_Top);
	        bipedHead.addChild(H_R_Top);
	        bipedHead.addChild(H_R_Low);
	        bipedHead.addChild(H_L_Low);
	        bipedHead.addChild(H_Top);
	    
	    
	    
	    
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
    

