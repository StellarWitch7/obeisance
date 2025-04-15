package stellarwitch7.obeisance.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class PylonBlockEntity extends BlockEntity {
    public PylonBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.PYLON_ENTITY, pos, state);
    }
}
