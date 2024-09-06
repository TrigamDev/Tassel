package dev.trigam.tassel.screen;

import dev.trigam.tassel.Tassel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class TasselHandledScreens {

	public static void register() {
		Tassel.LOGGER.debug("Registering screens for {}...", Tassel.MOD_ID);

		HandledScreens.register(TasselScreenHandlers.MOD_ENCHANTMENT_SCREEN_HANDLER, TasselEnchantmentScreen::new);
	}

}
