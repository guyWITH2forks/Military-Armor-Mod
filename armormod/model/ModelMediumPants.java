package com.guywith2forks.armormod.model;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMediumPants extends ModelBiped
{
	ModelRenderer P_Waist_F;
    ModelRenderer P_Waist_B;
    ModelRenderer P_Waist_R;
    ModelRenderer P_Waist_L;
    ModelRenderer P_L_Leg_L;
    ModelRenderer P_L_Leg_R;
    ModelRenderer P_L_Leg_B;
    ModelRenderer P_L_Leg_F;
    ModelRenderer P_R_Leg_L;
    ModelRenderer P_R_Leg_R;
    ModelRenderer P_R_Leg_B;
    ModelRenderer P_R_Leg_F;
	
	
	
    public ModelMediumPants (float scale)
	{
		super(scale, 0, 128, 128);
	    textureWidth = 128;
	    textureHeight = 128;
	
	      P_Waist_F = new ModelRenderer(this, 15, 40);
	      P_Waist_F.addBox(-4F, 10F, -2.1F, 8, 3, 1);
	      P_Waist_F.setRotationPoint(0F, 0F, 0F);
	      P_Waist_F.setTextureSize(128, 128);
	      P_Waist_F.mirror = true;
	      setRotation(P_Waist_F, 0F, 0F, 0F);
	      P_Waist_B = new ModelRenderer(this, 15, 44);
	      P_Waist_B.addBox(-4F, 10F, 1.1F, 8, 3, 1);
	      P_Waist_B.setRotationPoint(0F, 0F, 0F);
	      P_Waist_B.setTextureSize(128, 128);
	      P_Waist_B.mirror = true;
	      setRotation(P_Waist_B, 0F, 0F, 0F);
	      P_Waist_R = new ModelRenderer(this, 33, 41);
	      P_Waist_R.addBox(-4.1F, 10F, -2F, 1, 3, 4);
	      P_Waist_R.setRotationPoint(0F, 0F, 0F);
	      P_Waist_R.setTextureSize(128, 128);
	      P_Waist_R.mirror = true;
	      setRotation(P_Waist_R, 0F, 0F, 0F);
	      P_Waist_L = new ModelRenderer(this, 5, 41);
	      P_Waist_L.addBox(3.1F, 10F, -2F, 1, 3, 4);
	      P_Waist_L.setRotationPoint(0F, 0F, 0F);
	      P_Waist_L.setTextureSize(128, 128);
	      P_Waist_L.mirror = true;
	      setRotation(P_Waist_L, 0F, 0F, 0F);
	      P_L_Leg_L = new ModelRenderer(this, 10, 56);
	      P_L_Leg_L.addBox(1.1F, 0F, -2F, 1, 11, 4);
	      P_L_Leg_L.setRotationPoint(0F, 0F, 0F);
	      P_L_Leg_L.setTextureSize(128, 128);
	      P_L_Leg_L.mirror = true;
	      setRotation(P_L_Leg_L, 0F, 0F, 0F);
	      P_L_Leg_R = new ModelRenderer(this, 20, 56);
	      P_L_Leg_R.addBox(-2.1F, 0F, -2F, 1, 11, 4);
	      P_L_Leg_R.setRotationPoint(0F, 0F, 0F);
	      P_L_Leg_R.setTextureSize(128, 128);
	      P_L_Leg_R.mirror = true;
	      setRotation(P_L_Leg_R, 0F, 0F, 0F);
	      P_L_Leg_B = new ModelRenderer(this, 10, 71);
	      P_L_Leg_B.addBox(-2F, 0F, 1.1F, 4, 11, 1);
	      P_L_Leg_B.setRotationPoint(0F, 0F, 0F);
	      P_L_Leg_B.setTextureSize(128, 128);
	      P_L_Leg_B.mirror = true;
	      setRotation(P_L_Leg_B, 0F, 0F, 0F);
	      P_L_Leg_F = new ModelRenderer(this, 20, 71);
	      P_L_Leg_F.addBox(-2F, 0F, -2.1F, 4, 11, 1);
	      P_L_Leg_F.setRotationPoint(0F, 0F, 0F);
	      P_L_Leg_F.setTextureSize(128, 128);
	      P_L_Leg_F.mirror = true;
	      setRotation(P_L_Leg_F, 0F, 0F, 0F);
	      P_R_Leg_L = new ModelRenderer(this, 36, 56);
	      P_R_Leg_L.addBox(1.1F, 0F, -2F, 1, 11, 4);
	      P_R_Leg_L.setRotationPoint(0F, 0F, 0F);
	      P_R_Leg_L.setTextureSize(128, 128);
	      P_R_Leg_L.mirror = true;
	      setRotation(P_R_Leg_L, 0F, 0F, 0F);
	      P_R_Leg_R = new ModelRenderer(this, 46, 56);
	      P_R_Leg_R.addBox(-2.1F, 0F, -2F, 1, 11, 4);
	      P_R_Leg_R.setRotationPoint(0F, 0F, 0F);
	      P_R_Leg_R.setTextureSize(128, 128);
	      P_R_Leg_R.mirror = true;
	      setRotation(P_R_Leg_R, 0F, 0F, 0F);
	      P_R_Leg_B = new ModelRenderer(this, 36, 71);
	      P_R_Leg_B.addBox(-2F, 0F, 1.1F, 4, 11, 1);
	      P_R_Leg_B.setRotationPoint(0F, 0F, 0F);
	      P_R_Leg_B.setTextureSize(128, 128);
	      P_R_Leg_B.mirror = true;
	      setRotation(P_R_Leg_B, 0F, 0F, 0F);
	      P_R_Leg_F = new ModelRenderer(this, 46, 71);
	      P_R_Leg_F.addBox(-2F, 0F, -2.1F, 4, 11, 1);
	      P_R_Leg_F.setRotationPoint(0F, 0F, 0F);
	      P_R_Leg_F.setTextureSize(128, 128);
	      P_R_Leg_F.mirror = true;
	      setRotation(P_R_Leg_F, 0F, 0F, 0F);
	      
	      bipedBody.addChild(P_Waist_F);
	      bipedBody.addChild(P_Waist_B);
	      bipedBody.addChild(P_Waist_R);
	      bipedBody.addChild(P_Waist_L);
	      bipedLeftLeg.addChild(P_L_Leg_L);
	      bipedLeftLeg.addChild(P_L_Leg_R);
	      bipedLeftLeg.addChild(P_L_Leg_B);
	      bipedLeftLeg.addChild(P_L_Leg_F);
	      bipedRightLeg.addChild(P_R_Leg_L);
	      bipedRightLeg.addChild(P_R_Leg_R);
	      bipedRightLeg.addChild(P_R_Leg_B);
	      bipedRightLeg.addChild(P_R_Leg_F);
	
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