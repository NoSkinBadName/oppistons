package io.github.noskinbadname.oppistons.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PistonHandler.class)
public class PistonHandlerMixin {

    @ModifyConstant(method = "tryMove", constant = @Constant(intValue  = 12))
    private int removePistonLimit(int original) {
        return Integer.MAX_VALUE;
    }


    /**
     * @author NoSkinBadName
     * @reason All Blocks are sticky = More fun!
     */
    @Overwrite
    private static boolean isBlockSticky(BlockState state) {
        return true;
    }
}
