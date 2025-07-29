package net.scoremoresalmon.fromthebog.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scoremoresalmon.fromthebog.FromTheBog;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FromTheBog.MOD_ID);

    public static final RegistryObject<SoundEvent> CORRUPTION_BLOCK_PLACE = registerSoundEvents("corruption_block_place");

    public static final RegistryObject<SoundEvent> CHIPI_CHAPA = registerSoundEvents("chipi_chapa");
    public static final RegistryObject<SoundEvent> ETHAN_CHIPI_CHAPA = registerSoundEvents("ethan_chipi_chapa");

    public static final ForgeSoundType CORRUPTION_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.CORRUPTION_BLOCK_PLACE,  //Break
            ModSounds.CORRUPTION_BLOCK_PLACE,  //Step
            ModSounds.CORRUPTION_BLOCK_PLACE,  //Place
            ModSounds.CORRUPTION_BLOCK_PLACE,  //Hit
            ModSounds.CORRUPTION_BLOCK_PLACE); //Fall

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FromTheBog.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
