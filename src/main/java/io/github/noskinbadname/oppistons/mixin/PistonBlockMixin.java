package io.github.noskinbadname.oppistons.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PistonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PistonBlock.class)
public class PistonBlockMixin {
    /**
     * @author NoSkinBadName
     * @reason Made all Blocks Movable
     */
    @Overwrite
    public static boolean isMovable(BlockState state, World world, BlockPos pos, Direction direction, boolean canBreak, Direction pistonDir) {
        return state.getHardness(world, pos) != -1.0F || state.getBlock().equals(Blocks.BEDROCK);
    }
}
