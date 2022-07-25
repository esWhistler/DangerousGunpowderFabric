package com.whistler.dangerousgunpowder;

import com.whistler.dangerousgunpowder.item.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DangerousGunpowder implements ModInitializer {

	public static final String MOD_ID = "dangerousgunpowder";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final MinecraftClient MINECRAFT = MinecraftClient.getInstance();

	@Override
	public void onInitialize() {
		new RegisterItems();
	}
}
