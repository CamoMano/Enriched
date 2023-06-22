package com.enrichedmc.builder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

public class ShapedRecipeBuilder {
  private final String[] pattern = new String[3];
  private final Map<Character, Pair<String, String>> key = new HashMap<>();
  private Pair<String, Integer> result;

  private ShapedRecipeBuilder(String top, String mid, String low) {
    pattern[0] = top;
    pattern[1] = mid;
    pattern[2] = low;
  }

  public static ShapedRecipeBuilder ofPattern(String r1, String r2, String r3) {
    return new ShapedRecipeBuilder(r1, r2, r3);
  }

  public ShapedRecipeBuilder item(char character, String id) {
    key.put(character, new Pair<>("item", id));
    return this;
  }

  public ShapedRecipeBuilder tag(char character, String id) {
    key.put(character, new Pair<>("tag", id));
    return this;
  }

  public ShapedRecipeBuilder result(String id, int count) {
    result = new Pair<>(id, count);
    return this;
  }

  public ShapedRecipeBuilder result(String id) {
    return result(id, 1);
  }

  public Pair<Identifier, JsonObject> build(Identifier identifier) {
    final JsonObject json = new JsonObject();
    json.addProperty("type", "minecraft:crafting_shaped");

    final JsonArray pattern = new JsonArray();
    Arrays.asList(this.pattern).forEach(pattern::add);
    json.add("pattern", pattern);

    final JsonObject key = new JsonObject();
    this.key.forEach(
        (k, v) -> {
          final JsonObject definition = new JsonObject();
          definition.addProperty(v.getLeft(), v.getRight());
          key.add(k.toString(), definition);
        });
    json.add("key", key);

    final JsonObject result = new JsonObject();
    result.addProperty("item", this.result.getLeft());
    result.addProperty("count", this.result.getRight());
    json.add("result", result);

    return new Pair<>(identifier, json);
  }
}
