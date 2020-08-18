package com.vanillaenhanced.client.renderer;

import com.vanillaenhanced.client.model.HoneySlimeEntityModel;
import com.vanillaenhanced.entity.HoneySlime;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static com.vanillaenhanced.VanillaEnhanced.MOD_ID;

/*
 * A renderer is used to provide an entity model, shadow size, and texture.
 */
public class HoneySlimeEntityRenderer extends MobEntityRenderer<HoneySlime, HoneySlimeEntityModel> {

    public HoneySlimeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new HoneySlimeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(HoneySlime entity) {
        return new Identifier(MOD_ID, "textures/entity/slime/honey_slime.png");
    }
}
