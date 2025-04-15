package stellarwitch7.obeisance.cca;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.world.WorldComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.world.WorldComponentInitializer;

import stellarwitch7.obeisance.Obeisance;
import stellarwitch7.obeisance.cca.world.PylonsComponent;

public class ModWorldComponents implements WorldComponentInitializer {
    public static final ComponentKey<PylonsComponent> PYLONS = ComponentRegistry.getOrCreate(Obeisance.id("pylons"), PylonsComponent.class);

    @Override
    public void registerWorldComponentFactories(WorldComponentFactoryRegistry registry) {
        registry.register(PYLONS, PylonsComponent::new);
    }
}
