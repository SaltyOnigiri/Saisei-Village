package com.saltyonigiri.saisei_village.item;

import com.saltyonigiri.saisei_village.SaiseiVillage;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    //Confused? Read me! In the simplest terms you can think of this as a list of items with our mod ID
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SaiseiVillage.MOD_ID);

    //Item1 Placeholder
    public static final RegistryObject<Item> PILL = ITEMS.register("pill",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    //Item2 Placeholder
    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }



}
