package net.Zota0.learn.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab LEARN_TAB = new CreativeModeTab("learn_tab") {
        @Override
        public boolean hasSearchBar() {
            return true;
        }
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };

}
