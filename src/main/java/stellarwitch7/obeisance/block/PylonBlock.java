package stellarwitch7.obeisance.block;

import net.minecraft.block.Block;

public class PylonBlock extends Block {
    public PylonBlock() {
        super(Settings.create()
            .noCollision()
            .hardness(5)
            .resistance(3600000));
    }
}
