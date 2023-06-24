package com.enrichedmc.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class ArmorBase extends ArmorItem {
  public ArmorBase(ArmorMaterial material, Type type) {
    super(material, type, new Settings());
  }
}
