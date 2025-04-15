package stellarwitch7.obeisance;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import nl.enjarai.cicada.api.conversation.ConversationManager;
import nl.enjarai.cicada.api.util.CicadaEntrypoint;
import nl.enjarai.cicada.api.util.JsonSource;
import nl.enjarai.cicada.api.util.ProperLogger;
import stellarwitch7.obeisance.block.ModBlocks;
import stellarwitch7.obeisance.config.ObeisanceConfig;
import stellarwitch7.obeisance.item.ModItems;

import org.slf4j.Logger;

public class Obeisance implements ModInitializer, CicadaEntrypoint {
    public static final String MOD_ID = "obeisance";
    public static final Logger LOGGER = ProperLogger.getLogger(MOD_ID);
    public static final ObeisanceConfig CONFIG = ObeisanceConfig.createAndLoad();

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
    }

    @Override
    public void registerConversations(ConversationManager conversationManager) {
        conversationManager.registerSource(
                JsonSource.fromUrl(
                        "https://raw.githubusercontent.com/StellarWitch7/obeisance/main/src/main/resources/cicada/obeisance/conversations.json")
                        .or(JsonSource.fromResource("cicada/obeisance/conversations.json")),
                LOGGER::info);
    }

    public static Identifier id(String... path) {
        return Identifier.of(MOD_ID, String.join("/", path));
    }
}
