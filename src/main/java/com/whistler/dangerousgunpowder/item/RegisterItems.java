package com.whistler.dangerousgunpowder.item;

import com.whistler.dangerousgunpowder.DangerousGunpowder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(DangerousGunpowder.MOD_ID, "explosion_item"), ModItems.EXPLOSION_ITEM);
    }
}
