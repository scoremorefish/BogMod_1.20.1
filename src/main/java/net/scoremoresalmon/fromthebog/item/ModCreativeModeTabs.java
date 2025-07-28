package net.scoremoresalmon.fromthebog.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scoremoresalmon.fromthebog.FromTheBog;
import net.scoremoresalmon.fromthebog.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FromTheBog.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BOG_TAB = CREATIVE_MODE_TABS.register("bog_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EVILMATTER.get())) //Change this to change the icon for the creative tab
                    .title(Component.translatable("creativetab.bog_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //Put Items that go in the creative tab here
                        pOutput.accept(ModItems.EVILMATTER.get());
                        pOutput.accept(ModItems.CORRUPTION.get());
                        pOutput.accept(ModItems.EVIL_TEMPLATE.get());

                        pOutput.accept(ModItems.BOGLING_FLESH.get());

                        pOutput.accept(ModItems.BLANK_DISC.get());
                        pOutput.accept(ModItems.CHIPI_CHAPA_DISC.get());
                        pOutput.accept(ModItems.ETHAN_CHIPI_CHAPA_DISC.get());

                        pOutput.accept(ModItems.WUMPUS.get());
                        pOutput.accept(ModItems.METAL_WUMPUS.get());

                        pOutput.accept(ModBlocks.CORRUPTION_BLOCK.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
