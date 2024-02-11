package me.gonkas;

import me.gonkas.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeviathanAxe implements ModInitializer {

	public static final String MODID = "leviathanaxe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ItemRegistry.registerModItems();
	}
}