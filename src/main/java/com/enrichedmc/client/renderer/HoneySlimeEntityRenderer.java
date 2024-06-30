package com.enrichedmc.client.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;

import static com.enrichedmc.Enriched.MOD_ID;

@Environment(EnvType.CLIENT)
public class HoneySlimeEntityRenderer extends SlimeEntityRenderer
{
    public HoneySlimeEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context);
    }

    @Override
    public Identifier getTexture(SlimeEntity entity)
    {
        return Identifier.of(MOD_ID, "textures/entity/slime/honey_slime.png");
    }
}
