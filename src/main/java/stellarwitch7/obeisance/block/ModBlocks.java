package stellarwitch7.obeisance.block;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import stellarwitch7.obeisance.Obeisance;

public class ModBlocks {
    public static final PylonBlock PYLON = register("pylon", new PylonBlock());
    public static final BlockEntityType<PylonBlockEntity> PYLON_ENTITY =
            BlockEntityType.Builder.create(PylonBlockEntity::new, PYLON).build(null);

    private static <T extends Block> T register(String id, T block) {
        return Registry.register(Registries.BLOCK, Obeisance.id(id), block);
    }

    public static void register() {
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Obeisance.id("pylon"), PYLON_ENTITY);
    }
}
