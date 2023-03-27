package org.darkxellmc.redrockfactory.mixin;

import org.darkxellmc.redrockfactory.RedRockFactoryMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class RedRockFactoryMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		RedRockFactoryMod.LOGGER.info("Red Rock Factory is working fine. TitleScreen reached.");
	}
}
