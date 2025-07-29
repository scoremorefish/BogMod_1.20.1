package net.scoremoresalmon.fromthebog.item.custom;

import com.google.common.collect.ArrayListMultimap;;
import com.google.common.collect.Multimap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.scoremoresalmon.fromthebog.item.ModArmorMaterials;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Multimap<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP;
    static {
        Multimap<ArmorMaterial, MobEffectInstance>map = ArrayListMultimap.create();
        map.put(ModArmorMaterials.EVILMATTER, new MobEffectInstance(MobEffects.NIGHT_VISION, 0, 1,
                false, false, false));
        map.put(ModArmorMaterials.EVILMATTER, new MobEffectInstance(MobEffects.DIG_SPEED, 0, 2,
                false, false, false));
        map.put(ModArmorMaterials.EVILMATTER, new MobEffectInstance(MobEffects.JUMP, 0, 2,
                false, false, false));
        map.put(ModArmorMaterials.EVILMATTER, new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 0, 2,
                false, false, false));
        MATERIAL_TO_EFFECT_MAP=map;
    }



    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if(!level.isClientSide()) {
            if(hasFullSetOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entries()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSetOfArmorOn(Player player) {
        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());
        ArmorItem chestplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());

        return helmet.getMaterial() == material && chestplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
