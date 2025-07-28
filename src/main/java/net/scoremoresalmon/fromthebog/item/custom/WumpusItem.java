package net.scoremoresalmon.fromthebog.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class WumpusItem extends Item {
    public WumpusItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {

        }

        return InteractionResult.SUCCESS;
    }
}
