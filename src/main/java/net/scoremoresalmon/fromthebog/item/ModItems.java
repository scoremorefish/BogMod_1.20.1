package net.scoremoresalmon.fromthebog.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scoremoresalmon.fromthebog.FromTheBog;
import net.scoremoresalmon.fromthebog.item.custom.WumpusItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, FromTheBog.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> EVILMATTER = ITEMS.register("evilmatter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPTION = ITEMS.register("corruption",
            () -> new WumpusItem(new Item.Properties()));

    public static final RegistryObject<Item> WUMPUS = ITEMS.register("wumpus",
            () -> new WumpusItem(new Item.Properties()));

    //public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc",
    //        () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CHIPI_CHAPA_DISC = ITEMS.register("chipi_chapa_disc",
    //        () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> ETHAN_CHIPI_CHAPA_DISC = ITEMS.register("ethan_chipi_chapa_disc",
    //        () -> new Item(new Item.Properties()));

    //public static final RegistryObject<Item> WUMPUS = ITEMS.register("WUMPUS",
    //        () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> METAL_WUMPUS = ITEMS.register("metal_wumpus",
    //        () -> new Item(new Item.Properties()));
}
