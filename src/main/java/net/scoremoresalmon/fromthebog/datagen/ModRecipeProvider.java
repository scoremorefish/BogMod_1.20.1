package net.scoremoresalmon.fromthebog.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.scoremoresalmon.fromthebog.block.ModBlocks;
import net.scoremoresalmon.fromthebog.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLANK_DISC.get())
                .pattern("III")
                .pattern("I I")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHIPI_CHAPA_DISC.get())
                .pattern("III")
                .pattern("IDI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('D', ModItems.BLANK_DISC.get())
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(ModItems.BLANK_DISC.get()), has(ModItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ETHAN_CHIPI_CHAPA_DISC.get())
                .pattern("DDD")
                .pattern("DCD")
                .pattern("DDD")
                .define('C', ModItems.CHIPI_CHAPA_DISC.get())
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.CHIPI_CHAPA_DISC.get()), has(ModItems.CHIPI_CHAPA_DISC.get()))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WUMPUS.get())
                .pattern("LLL")
                .pattern("LIL")
                .pattern("LLL")
                .define('L', Items.LAPIS_LAZULI)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_WUMPUS.get())
                .pattern("III")
                .pattern("IBI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.IRON_BLOCK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.IRON_BLOCK), has(Items.IRON_BLOCK))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EVIL_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .define('E', ModItems.EVILMATTER.get())
                .unlockedBy(getHasName(ModItems.EVILMATTER.get()), has(ModItems.EVILMATTER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EVIL_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.EVILMATTER.get())
                .unlockedBy(getHasName(ModItems.EVILMATTER.get()), has(ModItems.EVILMATTER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EVIL_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', ModItems.EVILMATTER.get())
                .unlockedBy(getHasName(ModItems.EVILMATTER.get()), has(ModItems.EVILMATTER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EVIL_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .define('E', ModItems.EVILMATTER.get())
                .unlockedBy(getHasName(ModItems.EVILMATTER.get()), has(ModItems.EVILMATTER.get()))
                .save(pWriter);
    }
}
