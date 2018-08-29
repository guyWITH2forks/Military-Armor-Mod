package com.guywith2forks.armormod.model;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMediumHelmet extends ModelBiped
{
	//fields
    ModelRenderer H_Top;
    ModelRenderer H_L_Top;
    ModelRenderer H_R_Top;
    ModelRenderer H_Back;
    ModelRenderer H_R_Bottom;
    ModelRenderer H_L_Bottom;
    ModelRenderer H_Forehead;
    ModelRenderer H_Forehead_Cant;
    ModelRenderer H_R_Cant;
    ModelRenderer H_L_Cant;
    ModelRenderer H_Back_Cant;
    ModelRenderer H_Vert_Cant_L;
    ModelRenderer H_Vert_Cant_R;
    ModelRenderer H_Rear_Comm_Pack;
	
    public ModelMediumHelmet(float scale)
    {
    	super(scale, 0, 128, 128);
        textureWidth = 128;
        textureHeight = 128;
    	
    	
    	
    	
    	H_Top = new ModelRenderer(this, 18, 48);
        H_Top.addBox(-4F, -8.7F, -4F, 8, 1, 8);
        H_Top.setRotationPoint(0F, 0F, 0F);
        H_Top.setTextureSize(128, 128);
        H_Top.mirror = true;
        setRotation(H_Top, 0F, 0F, 0F);
        H_L_Top = new ModelRenderer(this, 0, 47);
        H_L_Top.addBox(3.7F, -8F, -4F, 1, 2, 8);
        H_L_Top.setRotationPoint(0F, 0F, 0F);
        H_L_Top.setTextureSize(128, 128);
        H_L_Top.mirror = true;
        setRotation(H_L_Top, 0F, 0F, 0F);
        H_R_Top = new ModelRenderer(this, 50, 47);
        H_R_Top.addBox(-4.7F, -8F, -4F, 1, 2, 8);
        H_R_Top.setRotationPoint(0F, 0F, 0F);
        H_R_Top.setTextureSize(128, 128);
        H_R_Top.mirror = true;
        setRotation(H_R_Top, 0F, 0F, 0F);
        H_Back = new ModelRenderer(this, 25, 57);
        H_Back.addBox(-4F, -8F, 3.7F, 8, 5, 1);
        H_Back.setRotationPoint(0F, 0F, 0F);
        H_Back.setTextureSize(128, 128);
        H_Back.mirror = true;
        setRotation(H_Back, 0F, 0F, 0F);
        H_R_Bottom = new ModelRenderer(this, 50, 57);
        H_R_Bottom.addBox(-5F, -6F, 0F, 1, 3, 4);
        H_R_Bottom.setRotationPoint(0F, 0F, 0F);
        H_R_Bottom.setTextureSize(128, 128);
        H_R_Bottom.mirror = true;
        setRotation(H_R_Bottom, 0F, 0F, 0F);
        H_L_Bottom = new ModelRenderer(this, 8, 57);
        H_L_Bottom.addBox(4F, -6F, 0F, 1, 3, 4);
        H_L_Bottom.setRotationPoint(0F, 0F, 0F);
        H_L_Bottom.setTextureSize(128, 128);
        H_L_Bottom.mirror = true;
        setRotation(H_L_Bottom, 0F, 0F, 0F);
        H_Forehead = new ModelRenderer(this, 25, 46);
        H_Forehead.addBox(-4F, -8F, -4.7F, 8, 1, 1);
        H_Forehead.setRotationPoint(0F, 0F, 0F);
        H_Forehead.setTextureSize(128, 128);
        H_Forehead.mirror = true;
        setRotation(H_Forehead, 0F, 0F, 0F);
        H_Forehead_Cant = new ModelRenderer(this, 25, 44);
        H_Forehead_Cant.addBox(-4F, -9F, 2.3F, 8, 1, 1);
        H_Forehead_Cant.setRotationPoint(0F, 0F, 0F);
        H_Forehead_Cant.setTextureSize(128, 128);
        H_Forehead_Cant.mirror = true;
        setRotation(H_Forehead_Cant, 0.7853982F, 0F, 0F);
        H_R_Cant = new ModelRenderer(this, 43, 38);
        H_R_Cant.addBox(-8.9F, -3.5F, -4F, 1, 1, 8);
        H_R_Cant.setRotationPoint(0F, 0F, 0F);
        H_R_Cant.setTextureSize(128, 128);
        H_R_Cant.mirror = true;
        setRotation(H_R_Cant, 0F, 0F, 0.7679449F);
        H_L_Cant = new ModelRenderer(this, 7, 38);
        H_L_Cant.addBox(-3.3F, -9F, -4F, 1, 1, 8);
        H_L_Cant.setRotationPoint(0F, 0F, 0F);
        H_L_Cant.setTextureSize(128, 128);
        H_L_Cant.mirror = true;
        setRotation(H_L_Cant, 0F, 0F, 0.7853982F);
        H_Back_Cant = new ModelRenderer(this, 25, 63);
        H_Back_Cant.addBox(-4F, -3.4F, 8F, 8, 1, 1);
        H_Back_Cant.setRotationPoint(0F, 0F, 0F);
        H_Back_Cant.setTextureSize(128, 128);
        H_Back_Cant.mirror = true;
        setRotation(H_Back_Cant, 0.7853982F, 0F, 0F);
        H_Vert_Cant_L = new ModelRenderer(this, 3, 41);
        H_Vert_Cant_L.addBox(-0.5F, -8F, 5.2F, 1, 5, 1);
        H_Vert_Cant_L.setRotationPoint(0F, 0F, 0F);
        H_Vert_Cant_L.setTextureSize(128, 128);
        H_Vert_Cant_L.mirror = true;
        setRotation(H_Vert_Cant_L, 0F, 0.7853982F, 0F);
        H_Vert_Cant_R = new ModelRenderer(this, 61, 41);
        H_Vert_Cant_R.addBox(-6.2F, -8F, -0.5F, 1, 5, 1);
        H_Vert_Cant_R.setRotationPoint(0F, 0F, 0F);
        H_Vert_Cant_R.setTextureSize(128, 128);
        H_Vert_Cant_R.mirror = true;
        setRotation(H_Vert_Cant_R, 0F, 0.7853982F, 0F);
        H_Rear_Comm_Pack = new ModelRenderer(this, 31, 40);
        H_Rear_Comm_Pack.addBox(-1F, -7F, 4.5F, 2, 3, 1);
        H_Rear_Comm_Pack.setRotationPoint(0F, 0F, 0F);
        H_Rear_Comm_Pack.setTextureSize(128, 128);
        H_Rear_Comm_Pack.mirror = true;
        setRotation(H_Rear_Comm_Pack, 0.0349066F, 0F, 0F);
    	
    	
        bipedHead.addChild(H_Top);
        bipedHead.addChild(H_L_Top);
        bipedHead.addChild(H_R_Top);
        bipedHead.addChild(H_Back);
        bipedHead.addChild(H_R_Bottom);
        bipedHead.addChild(H_L_Bottom);
        bipedHead.addChild(H_Forehead);
        bipedHead.addChild(H_Forehead_Cant);
        bipedHead.addChild(H_R_Cant);
        bipedHead.addChild(H_L_Cant);
        bipedHead.addChild(H_Back_Cant);
        bipedHead.addChild(H_Vert_Cant_L);
        bipedHead.addChild(H_Vert_Cant_R);
        bipedHead.addChild(H_Rear_Comm_Pack);
        
        
        
        
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
