package com.guywith2forks.armormod.model;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelHeavyVest extends ModelBiped


{
	ModelRenderer Front_Plate;
    ModelRenderer R_F_Strap;
    ModelRenderer L_F_Strap;
    ModelRenderer Lower_Strap;
    ModelRenderer L_R_Side_Strap;
    ModelRenderer L_L_Side_Strap;
    ModelRenderer Back_Plate;
    ModelRenderer R_L_Strap;
    ModelRenderer R_R_Strap;
    ModelRenderer Mag_1;
    ModelRenderer Mag_2;
    ModelRenderer Mag_3;
    ModelRenderer Mag_4;
	
    public ModelHeavyVest(float scale)
    {
  	  super(scale, 0, 128, 128);
      textureWidth = 128;
      textureHeight = 128;
      
      Front_Plate = new ModelRenderer(this, 40, 60);
      Front_Plate.addBox(-3F, 2F, -2.8F, 6, 8, 1);
      Front_Plate.setRotationPoint(0F, 0F, 0F);
      Front_Plate.setTextureSize(64, 32);
      Front_Plate.mirror = true;
      setRotation(Front_Plate, 0F, 0F, 0F);
      R_F_Strap = new ModelRenderer(this, 54, 60);
      R_F_Strap.addBox(-5F, 0F, -2.5F, 2, 7, 1);
      R_F_Strap.setRotationPoint(0F, 0F, 0F);
      R_F_Strap.setTextureSize(64, 32);
      R_F_Strap.mirror = true;
      setRotation(R_F_Strap, 0F, 0F, 0F);
      L_F_Strap = new ModelRenderer(this, 34, 60);
      L_F_Strap.addBox(3F, 0F, -2.5F, 2, 7, 1);
      L_F_Strap.setRotationPoint(0F, 0F, 0F);
      L_F_Strap.setTextureSize(64, 32);
      L_F_Strap.mirror = true;
      setRotation(L_F_Strap, 0F, 0F, 0F);
      Lower_Strap = new ModelRenderer(this, 38, 69);
      Lower_Strap.addBox(-4F, 10F, -3F, 8, 2, 1);
      Lower_Strap.setRotationPoint(0F, 0F, 0F);
      Lower_Strap.setTextureSize(64, 32);
      Lower_Strap.mirror = true;
      setRotation(Lower_Strap, 0F, 0F, 0F);
      L_R_Side_Strap = new ModelRenderer(this, 60, 68);
      L_R_Side_Strap.addBox(-5F, 9F, -3F, 1, 3, 6);
      L_R_Side_Strap.setRotationPoint(0F, 0F, 0F);
      L_R_Side_Strap.setTextureSize(64, 32);
      L_R_Side_Strap.mirror = true;
      setRotation(L_R_Side_Strap, 0F, 0F, 0F);
      L_L_Side_Strap = new ModelRenderer(this, 20, 68);
      L_L_Side_Strap.addBox(4F, 9F, -3F, 1, 3, 6);
      L_L_Side_Strap.setRotationPoint(0F, 0F, 0F);
      L_L_Side_Strap.setTextureSize(64, 32);
      L_L_Side_Strap.mirror = true;
      setRotation(L_L_Side_Strap, 0F, 0F, 0F);
      Back_Plate = new ModelRenderer(this, 38, 74);
      Back_Plate.addBox(-4F, 1F, 1.8F, 8, 10, 1);
      Back_Plate.setRotationPoint(0F, 0F, 0F);
      Back_Plate.setTextureSize(64, 32);
      Back_Plate.mirror = true;
      setRotation(Back_Plate, 0F, 0F, 0F);
      R_L_Strap = new ModelRenderer(this, 34, 78);
      R_L_Strap.addBox(4F, 0F, 2F, 1, 6, 1);
      R_L_Strap.setRotationPoint(0F, 0F, 0F);
      R_L_Strap.setTextureSize(64, 32);
      R_L_Strap.mirror = true;
      setRotation(R_L_Strap, 0F, 0F, 0F);
      R_R_Strap = new ModelRenderer(this, 56, 78);
      R_R_Strap.addBox(-5F, 0F, 2F, 1, 6, 1);
      R_R_Strap.setRotationPoint(0F, 0F, 0F);
      R_R_Strap.setTextureSize(64, 32);
      R_R_Strap.mirror = true;
      setRotation(R_R_Strap, 0F, 0F, 0F);
      Mag_1 = new ModelRenderer(this, 36, 86);
      Mag_1.addBox(-2.5F, 7F, -3.6F, 3, 2, 1);
      Mag_1.setRotationPoint(0F, 0F, 0F);
      Mag_1.setTextureSize(64, 32);
      Mag_1.mirror = true;
      setRotation(Mag_1, 0F, 0F, 0F);
      Mag_2 = new ModelRenderer(this, 44, 86);
      Mag_2.addBox(0.8F, 6F, -3.6F, 2, 3, 1);
      Mag_2.setRotationPoint(0F, 0F, 0F);
      Mag_2.setTextureSize(64, 32);
      Mag_2.mirror = true;
      setRotation(Mag_2, 0F, 0F, 0F);
      Mag_3 = new ModelRenderer(this, 50, 86);
      Mag_3.addBox(-2F, 3F, -3.6F, 4, 2, 1);
      Mag_3.setRotationPoint(0F, 0F, 0F);
      Mag_3.setTextureSize(64, 32);
      Mag_3.mirror = true;
      setRotation(Mag_3, 0F, 0F, 0F);
      Mag_4 = new ModelRenderer(this, 42, 91);
      Mag_4.addBox(-2F, 2F, 2.4F, 4, 2, 1);
      Mag_4.setRotationPoint(0F, 0F, 0F);
      Mag_4.setTextureSize(64, 32);
      Mag_4.mirror = true;
      setRotation(Mag_4, 0F, 0F, 0F);
      
      bipedBody.addChild(Front_Plate);
      bipedBody.addChild(R_F_Strap);
      bipedBody.addChild(L_F_Strap);
      bipedBody.addChild(Lower_Strap);
      bipedBody.addChild(L_R_Side_Strap);
      bipedBody.addChild(L_L_Side_Strap);
      bipedBody.addChild(Back_Plate);
      bipedBody.addChild(R_L_Strap);
      bipedBody.addChild(R_R_Strap);
      bipedBody.addChild(Mag_1);
      bipedBody.addChild(Mag_2);
      bipedBody.addChild(Mag_3);
      bipedBody.addChild(Mag_4);
      
      
      
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
