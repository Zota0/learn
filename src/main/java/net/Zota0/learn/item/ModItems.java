package net.Zota0.learn.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.Zota0.learn.learn;
import net.minecraftforge.registries.RegistryObject;


import javax.swing.*;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, learn.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARN_TAB) ) );

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARN_TAB) ) );




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
