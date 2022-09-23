package com.saltyonigiri.saisei_village.block;

import com.saltyonigiri.saisei_village.SaiseiVillage;
import com.saltyonigiri.saisei_village.item.ModCreativeModeTab;
import com.saltyonigiri.saisei_village.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SaiseiVillage.MOD_ID);

    //Creates Old Wood Plank Block
    public static final RegistryObject<Block> OLD_WOOD_PLANK = registerBlock("old_wood_plank",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2f)), ModCreativeModeTab.SAISEI_TAB);

    //Creates Speckled Brick Block
    public static final RegistryObject<Block> SPECKLED_BRICK = registerBlock("speckled_brick",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f)), ModCreativeModeTab.SAISEI_TAB);


    /**
     * The registerBlock method registers block and returns it
     * @param name The value to store in name
     * @param block The value to store in block
     * @param tab The value to store in tab
     * @return toReturn returns a registered blocks name and block
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    /**
     *  The registerBlockItem method registers item associated with block
     * @param name The value to store in name
     * @param block The value to store in block
     * @param tab The value to store in tab
     */
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    /**
     * @param eventBus is a design pattern that can be used to simplify communications between different components.
     */
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
