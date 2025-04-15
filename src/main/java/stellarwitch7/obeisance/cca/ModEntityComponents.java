package stellarwitch7.obeisance.cca;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

import net.minecraft.entity.mob.MobEntity;
import stellarwitch7.obeisance.Obeisance;

public class ModEntityComponents implements EntityComponentInitializer {
    public static final ComponentKey<FocusComponent> FOCUS = ComponentRegistry.getOrCreate(Obeisance.id("focus"), FocusComponent.class);
    public static final ComponentKey<IdentityComponent> IDENTITY = ComponentRegistry.getOrCreate(Obeisance.id("identity"), IdentityComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(FOCUS, FocusComponent::new, RespawnCopyStrategy.NEVER_COPY);
        registry.registerFor(MobEntity.class, IDENTITY, IdentityComponent::new);
    }
}
