package dev.trigam.tassel.screen;

import dev.trigam.tassel.Tassel;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;

public class TasselScreenHandlers {

	public static ScreenHandlerType<TasselEnchantmentScreenHandler> MOD_ENCHANTMENT_SCREEN_HANDLER;

	public static void register() {
		Tassel.LOGGER.debug("Registering screen handler types for {}...", Tassel.MOD_ID);

		// Enchantment Screen
		MOD_ENCHANTMENT_SCREEN_HANDLER = Registry.register(
			Registries.SCREEN_HANDLER,
			Tassel.id("enchanting"),
			new ScreenHandlerType<>(
				TasselEnchantmentScreenHandler::new,
				FeatureFlags.VANILLA_FEATURES
			)
		);
	}
}
