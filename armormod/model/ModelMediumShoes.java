package com.guywith2forks.armormod.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMediumShoes extends ModelBiped
{

	//fields
	ModelRenderer B_L_Soul;
    ModelRenderer B_LL;
    ModelRenderer B_LR;
    ModelRenderer B_LF;
    ModelRenderer B_LB;
    ModelRenderer B_R_Soul;
    ModelRenderer B_RL;
    ModelRenderer B_RR;
    ModelRenderer B_RF;
    ModelRenderer B_RB;
	
	public ModelMediumShoes (float scale)
	{
		super(scale, 0, 128, 128);
	    textureWidth = 128;
	    textureHeight = 128;
		
	    B_L_Soul = new ModelRenderer(this, 10, 116);
	      B_L_Soul.addBox(-2F, 11.1F, -3F, 4, 1, 5);
	      B_L_Soul.setRotationPoint(0F, 0F, 0F);
	      B_L_Soul.setTextureSize(128, 128);
	      B_L_Soul.mirror = true;
	      setRotation(B_L_Soul, 0F, 0F, 0F);
	      B_LL = new ModelRenderer(this, 0, 116);
	      B_LL.addBox(-2.1F, 10F, -2F, 1, 2, 4);
	      B_LL.setRotationPoint(0F, 0F, 0F);
	      B_LL.setTextureSize(128, 128);
	      B_LL.mirror = true;
	      setRotation(B_LL, 0F, 0F, 0F);
	      B_LR = new ModelRenderer(this, 28, 116);
	      B_LR.addBox(1.1F, 10F, -2F, 1, 2, 4);
	      B_LR.setRotationPoint(0F, 0F, 0F);
	      B_LR.setTextureSize(128, 128);
	      B_LR.mirror = true;
	      setRotation(B_LR, 0F, 0F, 0F);
	      B_LF = new ModelRenderer(this, 10, 113);
	      B_LF.addBox(-2F, 10F, -2.1F, 4, 2, 1);
	      B_LF.setRotationPoint(0F, 0F, 0F);
	      B_LF.setTextureSize(128, 128);
	      B_LF.mirror = true;
	      setRotation(B_LF, 0F, 0F, 0F);
	      B_LB = new ModelRenderer(this, 10, 122);
	      B_LB.addBox(-2F, 10F, 1.1F, 4, 2, 1);
	      B_LB.setRotationPoint(0F, 0F, 0F);
	      B_LB.setTextureSize(128, 128);
	      B_LB.mirror = true;
	      setRotation(B_LB, 0F, 0F, 0F);
	      B_R_Soul = new ModelRenderer(this, 50, 116);
	      B_R_Soul.addBox(-2F, 11.1F, -3F, 4, 1, 5);
	      B_R_Soul.setRotationPoint(0F, 0F, 0F);
	      B_R_Soul.setTextureSize(128, 128);
	      B_R_Soul.mirror = true;
	      setRotation(B_R_Soul, 0F, 0F, 0F);
	      B_RL = new ModelRenderer(this, 40, 116);
	      B_RL.addBox(-2.1F, 10F, -2F, 1, 2, 4);
	      B_RL.setRotationPoint(0F, 0F, 0F);
	      B_RL.setTextureSize(128, 128);
	      B_RL.mirror = true;
	      setRotation(B_RL, 0F, 0F, 0F);
	      B_RR = new ModelRenderer(this, 68, 116);
	      B_RR.addBox(1.1F, 10F, -2F, 1, 2, 4);
	      B_RR.setRotationPoint(0F, 0F, 0F);
	      B_RR.setTextureSize(128, 128);
	      B_RR.mirror = true;
	      setRotation(B_RR, 0F, 0F, 0F);
	      B_RF = new ModelRenderer(this, 50, 113);
	      B_RF.addBox(-2F, 10F, -2.1F, 4, 2, 1);
	      B_RF.setRotationPoint(0F, 0F, 0F);
	      B_RF.setTextureSize(128, 128);
	      B_RF.mirror = true;
	      setRotation(B_RF, 0F, 0F, 0F);
	      B_RB = new ModelRenderer(this, 50, 122);
	      B_RB.addBox(-2F, 10F, 1.1F, 4, 2, 1);
	      B_RB.setRotationPoint(0F, 0F, 0F);
	      B_RB.setTextureSize(128, 128);
	      B_RB.mirror = true;
	      setRotation(B_RB, 0F, 0F, 0F);
		
	      bipedLeftLeg.addChild(B_L_Soul);
	      bipedLeftLeg.addChild(B_LL);
	      bipedLeftLeg.addChild(B_LR);
	      bipedLeftLeg.addChild(B_LF);
	      bipedLeftLeg.addChild(B_LB);
	      bipedRightLeg.addChild(B_R_Soul);
	      bipedRightLeg.addChild(B_RL);
	      bipedRightLeg.addChild(B_RR);
	      bipedRightLeg.addChild(B_RF);
	      bipedRightLeg.addChild(B_RB);
	      
	      
	      
	      
	      
		
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