package com.vanillaenhanced.mixin;

import net.minecraft.world.biome.layer.SetBaseBiomesLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SetBaseBiomesLayer.class)
public interface SetBaseBiomesLayerAccessor {
    @Accessor("TEMPERATE_BIOMES")
    public static int[] getTemperateBiomes() {
        throw new AssertionError();
    }

    @Accessor("TEMPERATE_BIOMES")
    public static void setTemperateBiomes(int[] biomes) {
        throw new AssertionError();
    }

    @Accessor("DRY_BIOMES")
    public static int[] getDryBiomes() {
        throw new AssertionError();
    }

    @Accessor("DRY_BIOMES")
    public static void setDryBiomes(int[] biomes) {
        throw new AssertionError();
    }

    @Accessor("SNOWY_BIOMES")
    public static int[] getSnowyBiomes() {
        throw new AssertionError();
    }

    @Accessor("SNOWY_BIOMES")
    public static void setSnowyBiomes(int[] biomes) {
        throw new AssertionError();
    }

    @Accessor("COOL_BIOMES")
    public static int[] getCoolBiomes() {
        throw new AssertionError();
    }

    @Accessor("COOL_BIOMES")
    public static void setCoolBiomes(int[] biomes) {
        throw new AssertionError();
    }

}