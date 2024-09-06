package dev.trigam.tassel;

import dev.trigam.tassel.screen.TasselHandledScreens;
import net.fabricmc.api.ClientModInitializer;

public class TasselClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		TasselHandledScreens.register();
	}
}