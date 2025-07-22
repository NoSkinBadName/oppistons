package io.github.noskinbadname.oppistons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPPistons implements ModInitializer {
	public static final String MOD_ID = "oppistons";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello world");
	}
}