package com.whistler.dangerousgunpowder.mixin;

import com.whistler.dangerousgunpowder.DangerousGunpowder;
import com.whistler.dangerousgunpowder.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractFurnaceBlockEntity.class)
public class FurnaceBlockEntityMixin {
    @Inject(method = "tick", at = @At(value = "RETURN"))
    private static void explodeFurnace(World world, BlockPos pos, BlockState state, AbstractFurnaceBlockEntity blockEntity, CallbackInfo ci){
        if ( ((FurnaceBlockEntityAccessor)blockEntity).getInventory().get(2).isOf(ModItems.EXPLOSION_ITEM)) {
            float power = ((FurnaceBlockEntityAccessor)blockEntity).getInventory().get(0).getCount()/2.0f;
            ((FurnaceBlockEntityAccessor)blockEntity).getInventory().clear();
            if (!world.isClient){
                world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), power, Explosion.DestructionType.DESTROY);
            }
        }
    }
}
