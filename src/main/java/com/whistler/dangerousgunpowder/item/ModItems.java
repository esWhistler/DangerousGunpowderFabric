package com.whistler.dangerousgunpowder.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item EXPLOSION_ITEM = new Item(new FabricItemSettings().group(null).maxCount(1).rarity(Rarity.EPIC));
}
