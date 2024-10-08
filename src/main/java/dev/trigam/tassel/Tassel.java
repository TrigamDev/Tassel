package dev.trigam.tassel;

import dev.trigam.tassel.screen.TasselScreenHandlers;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tassel implements ModInitializer {
	public static final String MOD_ID = "tassel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id (String path) { return Identifier.of(MOD_ID, path); }

	@Override
	public void onInitialize() {
		TasselScreenHandlers.register();
	}
}