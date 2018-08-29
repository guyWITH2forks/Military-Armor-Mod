package com.guywith2forks.armormod.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMediumVest extends ModelBiped
{
  //fields
    ModelRenderer C_F_Top;
    ModelRenderer C_F_Bottom;
    ModelRenderer C_R_FrontStrap;
    ModelRenderer C_L_FrontStrap;
    ModelRenderer C_L_FrontStrap_2;
    ModelRenderer C_R_FrontStrap_2;
    ModelRenderer C_R_Shoulder;
    ModelRenderer C_L_Shoulder;
    ModelRenderer C_R_Side_Strap;
    ModelRenderer C_L_Side_Strap;
    ModelRenderer C_Back;
    ModelRenderer C_L_Back_Piece;
    ModelRenderer C_R_Back_Piece;
    ModelRenderer C_L_Mag;
    ModelRenderer C_C_Mag;
    ModelRenderer C_R_Mag;
  
  public ModelMediumVest(float scale)
  {
	  super(scale, 0, 128, 128);
    textureWidth = 128;
    textureHeight = 128;
    
    C_F_Top = new ModelRenderer(this, 40, 81);
    C_F_Top.addBox(-3F, 2F, -4F, 6, 2, 2);
    C_F_Top.setRotationPoint(0F, 0F, 0F);
    C_F_Top.setTextureSize(128, 128);
    C_F_Top.mirror = true;
    setRotation(C_F_Top, 0F, 0F, 0F);
    C_F_Bottom = new ModelRenderer(this, 39, 85);
    C_F_Bottom.addBox(-3.5F, 4F, -4F, 7, 6, 2);
    C_F_Bottom.setRotationPoint(0F, 0F, 0F);
    C_F_Bottom.setTextureSize(128, 128);
    C_F_Bottom.mirror = true;
    setRotation(C_F_Bottom, 0F, 0F, 0F);
    C_R_FrontStrap = new ModelRenderer(this, 36, 79);
    C_R_FrontStrap.addBox(-5F, 1F, -3F, 3, 1, 1);
    C_R_FrontStrap.setRotationPoint(0F, 0F, 0F);
    C_R_FrontStrap.setTextureSize(128, 128);
    C_R_FrontStrap.mirror = true;
    setRotation(C_R_FrontStrap, 0F, 0F, 0F);
    C_L_FrontStrap = new ModelRenderer(this, 52, 79);
    C_L_FrontStrap.addBox(2F, 1F, -3F, 3, 1, 1);
    C_L_FrontStrap.setRotationPoint(0F, 0F, 0F);
    C_L_FrontStrap.setTextureSize(128, 128);
    C_L_FrontStrap.mirror = true;
    setRotation(C_L_FrontStrap, 0F, 0F, 0F);
    C_L_FrontStrap_2 = new ModelRenderer(this, 52, 77);
    C_L_FrontStrap_2.addBox(3F, 0F, -3F, 1, 1, 1);
    C_L_FrontStrap_2.setRotationPoint(0F, 0F, 0F);
    C_L_FrontStrap_2.setTextureSize(128, 128);
    C_L_FrontStrap_2.mirror = true;
    setRotation(C_L_FrontStrap_2, 0F, 0F, 0F);
    C_R_FrontStrap_2 = new ModelRenderer(this, 40, 77);
    C_R_FrontStrap_2.addBox(-4F, 0F, -3F, 1, 1, 1);
    C_R_FrontStrap_2.setRotationPoint(0F, 0F, 0F);
    C_R_FrontStrap_2.setTextureSize(128, 128);
    C_R_FrontStrap_2.mirror = true;
    setRotation(C_R_FrontStrap_2, 0F, 0F, 0F);
    C_R_Shoulder = new ModelRenderer(this, 22, 79);
    C_R_Shoulder.addBox(-5F, -0.5F, -3F, 1, 2, 6);
    C_R_Shoulder.setRotationPoint(0F, 0F, 0F);
    C_R_Shoulder.setTextureSize(128, 128);
    C_R_Shoulder.mirror = true;
    setRotation(C_R_Shoulder, 0F, 0F, 0F);
    C_L_Shoulder = new ModelRenderer(this, 60, 79);
    C_L_Shoulder.addBox(4F, -0.5F, -3F, 1, 2, 6);
    C_L_Shoulder.setRotationPoint(0F, 0F, 0F);
    C_L_Shoulder.setTextureSize(128, 128);
    C_L_Shoulder.mirror = true;
    setRotation(C_L_Shoulder, 0F, 0F, 0F);
    C_R_Side_Strap = new ModelRenderer(this, 23, 87);
    C_R_Side_Strap.addBox(-5F, 6.5F, -3F, 2, 3, 6);
    C_R_Side_Strap.setRotationPoint(0F, 0F, 0F);
    C_R_Side_Strap.setTextureSize(128, 128);
    C_R_Side_Strap.mirror = true;
    setRotation(C_R_Side_Strap, 0F, 0F, 0F);
    C_L_Side_Strap = new ModelRenderer(this, 57, 87);
    C_L_Side_Strap.addBox(3F, 6.5F, -3F, 2, 3, 6);
    C_L_Side_Strap.setRotationPoint(0F, 0F, 0F);
    C_L_Side_Strap.setTextureSize(128, 128);
    C_L_Side_Strap.mirror = true;
    setRotation(C_L_Side_Strap, 0F, 0F, 0F);
    C_Back = new ModelRenderer(this, 41, 95);
    C_Back.addBox(-3F, 1F, 2F, 6, 8, 1);
    C_Back.setRotationPoint(0F, 0F, 0F);
    C_Back.setTextureSize(128, 128);
    C_Back.mirror = true;
    setRotation(C_Back, 0F, 0F, 0F);
    C_L_Back_Piece = new ModelRenderer(this, 37, 96);
    C_L_Back_Piece.addBox(3F, 1F, 2F, 1, 1, 1);
    C_L_Back_Piece.setRotationPoint(0F, 0F, 0F);
    C_L_Back_Piece.setTextureSize(128, 128);
    C_L_Back_Piece.mirror = true;
    setRotation(C_L_Back_Piece, 0F, 0F, 0F);
    C_R_Back_Piece = new ModelRenderer(this, 55, 96);
    C_R_Back_Piece.addBox(-4F, 1F, 2F, 1, 1, 1);
    C_R_Back_Piece.setRotationPoint(0F, 0F, 0F);
    C_R_Back_Piece.setTextureSize(128, 128);
    C_R_Back_Piece.mirror = true;
    setRotation(C_R_Back_Piece, 0F, 0F, 0F);
    C_L_Mag = new ModelRenderer(this, 52, 104);
    C_L_Mag.addBox(1.2F, 6F, -5F, 2, 3, 1);
    C_L_Mag.setRotationPoint(0F, 0F, 0F);
    C_L_Mag.setTextureSize(128, 128);
    C_L_Mag.mirror = true;
    setRotation(C_L_Mag, 0F, 0F, 0F);
    C_C_Mag = new ModelRenderer(this, 45, 104);
    C_C_Mag.addBox(-1F, 6F, -5F, 2, 3, 1);
    C_C_Mag.setRotationPoint(0F, 0F, 0F);
    C_C_Mag.setTextureSize(128, 128);
    C_C_Mag.mirror = true;
    setRotation(C_C_Mag, 0F, 0F, 0F);
    C_R_Mag = new ModelRenderer(this, 38, 104);
    C_R_Mag.addBox(-3.2F, 6F, -5F, 2, 3, 1);
    C_R_Mag.setRotationPoint(0F, 0F, 0F);
    C_R_Mag.setTextureSize(128, 128);
    C_R_Mag.mirror = true;
    setRotation(C_R_Mag, 0F, 0F, 0F);
      
      
      bipedBody.addChild(C_F_Top);
      bipedBody.addChild(C_F_Bottom);
      bipedBody.addChild(C_R_FrontStrap);
      bipedBody.addChild(C_L_FrontStrap);
      bipedBody.addChild(C_L_FrontStrap_2);
      bipedBody.addChild(C_R_FrontStrap_2);
      bipedBody.addChild(C_R_Shoulder);
      bipedBody.addChild(C_L_Shoulder);
      bipedBody.addChild(C_R_Side_Strap);
      bipedBody.addChild(C_L_Side_Strap);
      bipedBody.addChild(C_Back);
      bipedBody.addChild(C_L_Back_Piece);
      bipedBody.addChild(C_R_Back_Piece);
      bipedBody.addChild(C_L_Mag);
      bipedBody.addChild(C_C_Mag);
      bipedBody.addChild(C_R_Mag);
      
      
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