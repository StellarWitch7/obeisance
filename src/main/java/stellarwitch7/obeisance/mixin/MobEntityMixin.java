package stellarwitch7.obeisance.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import stellarwitch7.obeisance.identity.Identity;
import stellarwitch7.obeisance.pond.ControllableMobDuck;

public abstract class MobEntityMixin extends LivingEntity implements ControllableMobDuck {
    private MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void obeisance$overrideAi(Identity newAi) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obeisance$overrideAi'");
    }

    @Override
    public void obeisance$clearAiOverride() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obeisance$clearAiOverride'");
    }
}
