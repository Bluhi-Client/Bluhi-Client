package com.bluhi;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.client.MinecraftClient;

public class Bluhi implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Bluhi-Client");
	public static MinecraftClient client;

	@Override
	public void onInitializeClient() {
		LOGGER.info("Initializing Bluhi...");

		client = MinecraftClient.getInstance();
	}
}
