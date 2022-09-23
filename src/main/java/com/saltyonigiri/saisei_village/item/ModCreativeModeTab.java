package com.saltyonigiri.saisei_village.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SAISEI_TAB = new CreativeModeTab("saisei_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PILL.get());
        }
    };
}
