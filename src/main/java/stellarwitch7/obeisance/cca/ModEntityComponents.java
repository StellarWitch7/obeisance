package stellarwitch7.obeisance.cca;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

import stellarwitch7.obeisance.Obeisance;
import stellarwitch7.obeisance.cca.entity.FocusComponent;

public class ModEntityComponents implements EntityComponentInitializer {
    public static final ComponentKey<FocusComponent> FOCUS = ComponentRegistry.getOrCreate(Obeisance.id("focus"),
            FocusComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(FOCUS, FocusComponent::new, RespawnCopyStrategy.NEVER_COPY);
    }
}
