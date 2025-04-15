package stellarwitch7.obeisance.config;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "obeisance")
@Config(name = "obeisance-config", wrapperName = "ObeisanceConfig")
public class ObeisanceConfigModel {
    public static boolean requirePositive(int value) {
        return value >= 0;
    }

    public static boolean requirePositive(float value) {
        return value >= 0;
    }
}
