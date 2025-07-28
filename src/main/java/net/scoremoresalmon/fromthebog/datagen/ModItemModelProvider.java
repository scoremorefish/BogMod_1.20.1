package net.scoremoresalmon.fromthebog.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.scoremoresalmon.fromthebog.FromTheBog;
import net.scoremoresalmon.fromthebog.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, FromTheBog.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.EVILMATTER);
        simpleItem(ModItems.CORRUPTION);
        simpleItem(ModItems.EVIL_TEMPLATE);

        simpleItem(ModItems.BOGLING_FLESH);

        simpleItem(ModItems.BLANK_DISC);
        simpleItem(ModItems.CHIPI_CHAPA_DISC);
        simpleItem(ModItems.ETHAN_CHIPI_CHAPA_DISC);

        simpleItem(ModItems.WUMPUS);
        simpleItem(ModItems.METAL_WUMPUS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FromTheBog.MOD_ID, "item/" + item.getId().getPath()));
    }
}
