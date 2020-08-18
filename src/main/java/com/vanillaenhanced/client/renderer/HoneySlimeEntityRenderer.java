package com.vanillaenhanced.client.renderer;

//import com.vanillaenhanced.client.model.HoneySlimeEntityModel;
import com.vanillaenhanced.entity.HoneySlime;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

/*
 * A renderer is used to provide an entity model, shadow size, and texture.
 */
public class HoneySlimeEntityRenderer extends SlimeEntityRenderer {

    public HoneySlimeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher);
    }

    @Override
    public Identifier getTexture(SlimeEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/slime/honey_slime.png");
    }
}
