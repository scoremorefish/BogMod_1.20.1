package net.scoremoresalmon.fromthebog.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scoremoresalmon.fromthebog.FromTheBog;
import net.scoremoresalmon.fromthebog.item.custom.MetalWumpusItem;
import net.scoremoresalmon.fromthebog.item.custom.ModArmorItem;
import net.scoremoresalmon.fromthebog.item.custom.WumpusItem;
import net.scoremoresalmon.fromthebog.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, FromTheBog.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //Toadd: BoglingFlesh, Finger Spawn Egg,

    public static final RegistryObject<Item> EVILMATTER = ITEMS.register("evilmatter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPTION = ITEMS.register("corruption",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVIL_TEMPLATE = ITEMS.register("evil_template",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BOGLING_FLESH = ITEMS.register("bogling_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.BOG_FLESH)));


    public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHIPI_CHAPA_DISC = ITEMS.register("chipi_chapa_disc",
            () -> new RecordItem(6, ModSounds.CHIPI_CHAPA, new Item.Properties().stacksTo(1), 4960));

    public static final RegistryObject<Item> ETHAN_CHIPI_CHAPA_DISC = ITEMS.register("ethan_chipi_chapa_disc",
            () -> new RecordItem(6, ModSounds.ETHAN_CHIPI_CHAPA, new Item.Properties().stacksTo(1), 9080));


    public static final RegistryObject<Item> WUMPUS = ITEMS.register("wumpus",
            () -> new WumpusItem(new Item.Properties()));
    public static final RegistryObject<Item> METAL_WUMPUS = ITEMS.register("metal_wumpus",
            () -> new MetalWumpusItem(new Item.Properties()));


    public static final RegistryObject<Item> EVIL_HELMET = ITEMS.register("evil_helmet",
            () -> new ModArmorItem(ModArmorMaterials.EVILMATTER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EVIL_CHESTPLATE = ITEMS.register("evil_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.EVILMATTER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EVIL_LEGGINGS = ITEMS.register("evil_leggings",
            () -> new ModArmorItem(ModArmorMaterials.EVILMATTER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EVIL_BOOTS = ITEMS.register("evil_boots",
            () -> new ModArmorItem(ModArmorMaterials.EVILMATTER, ArmorItem.Type.BOOTS, new Item.Properties()));
}
