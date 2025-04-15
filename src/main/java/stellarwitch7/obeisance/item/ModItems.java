package stellarwitch7.obeisance.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import stellarwitch7.obeisance.Obeisance;
import stellarwitch7.obeisance.block.ModBlocks;

public class ModItems {
    public static final BlockItem PYLON_ITEM = register("pylon", new BlockItem(ModBlocks.PYLON, new Item.Settings()));

    private static <T extends Item> T register(String id, T block) {
        return Registry.register(Registries.ITEM, Obeisance.id(id), block);
    }

    public static void register() {
    }
}
