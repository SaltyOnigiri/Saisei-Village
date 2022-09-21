package com.saltyonigiri.saisei_village;

import com.mojang.logging.LogUtils;
import com.saltyonigiri.saisei_village.block.ModBlocks;
import com.saltyonigiri.saisei_village.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SaiseiVillage.MOD_ID)
public class SaiseiVillage {
    public static final String MOD_ID = "saisei_village";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public SaiseiVillage() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Measuring our mod items deferred register
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}