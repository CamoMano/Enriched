package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.materials.armor.EnrichedArmorMaterials;
import com.enrichedmc.enriched.registry.EnrichedRegisters;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

/**
 * Writes the equipment models that tell the game which textures to draw on an entity wearing
 * Enriched's armor. These replace the armor material layers used before 1.21.4.
 */
public class EnrichedEquipmentAssetProvider implements DataProvider {
  private final PackOutput.PathProvider pathProvider;

  public EnrichedEquipmentAssetProvider(FabricPackOutput output) {
    this.pathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
  }

  @Override
  public CompletableFuture<?> run(CachedOutput writer) {
    Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
    EnrichedEquipmentAssetProvider.bootstrap(equipmentAssets::put);

    return DataProvider.saveAll(
        writer,
        EquipmentClientInfo.CODEC,
        equipmentAsset -> this.pathProvider.json(equipmentAsset.identifier()),
        equipmentAssets);
  }

  private static void bootstrap(
      BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
    EnrichedEquipmentAssetProvider.addHumanoidArmor(consumer, EnrichedArmorMaterials.RUBY_ASSET, "ruby");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.SAPPHIRE_ASSET, "sapphire");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.TANZANITE_ASSET, "tanzanite");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.STEEL_ASSET, "steel");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.OBSIDIAN_ASSET, "obsidian");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.EMERALD_ASSET, "emerald");
    EnrichedEquipmentAssetProvider.addHumanoidArmor(
        consumer, EnrichedArmorMaterials.BRONZE_ASSET, "bronze");
  }

  private static void addHumanoidArmor(
      BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer,
      ResourceKey<EquipmentAsset> equipmentAsset,
      String textureName) {
    EquipmentClientInfo.Layer layer = new EquipmentClientInfo.Layer(EnrichedRegisters.id(textureName));

    // The layers are added individually rather than through addHumanoidLayers(), which would also
    // declare a HUMANOID_BABY layer. Baby armour uses a separate 64x64 texture layout that Enriched
    // doesn't have artwork for, so declaring it would only point at a texture that doesn't exist.
    consumer.accept(
        equipmentAsset,
        EquipmentClientInfo.builder()
            .addLayers(EquipmentClientInfo.LayerType.HUMANOID, layer)
            .addLayers(EquipmentClientInfo.LayerType.HUMANOID_LEGGINGS, layer)
            .build());
  }

  @Override
  public String getName() {
    return "Enriched Equipment Assets";
  }
}
