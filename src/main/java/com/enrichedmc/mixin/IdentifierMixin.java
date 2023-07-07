package com.enrichedmc.mixin;

import com.enrichedmc.Enriched;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Identifier.class)
public class IdentifierMixin {
  @Mutable @Shadow @Final protected String namespace;

  @Inject(method = "<init>([Ljava/lang/String;)V", at = @At("RETURN"))
  private void init(String[] strings, CallbackInfo ci) {
    if (namespace.equals("vanillaenhanced")) namespace = Enriched.MOD_ID;
  }
}
