package com.enrichedmc.enriched.entity.render;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.entity.custom.HoneySlimeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.util.Identifier;

public class HoneySlimeEntityRenderer extends MobEntityRenderer<HoneySlimeEntity, SlimeEntityModel<HoneySlimeEntity>>
{
    public HoneySlimeEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25f);
    }

    @Override
    public Identifier getTexture(HoneySlimeEntity entity)
    {
        return Identifier.of(EnrichedMod.MOD_ID, "textures/entity/slime/honey_slime.png");
    }
}
