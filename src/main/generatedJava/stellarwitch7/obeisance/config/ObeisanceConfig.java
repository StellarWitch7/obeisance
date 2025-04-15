package stellarwitch7.obeisance.config;

import blue.endless.jankson.Jankson;
import io.wispforest.owo.config.ConfigWrapper;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.util.Observable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ObeisanceConfig extends ConfigWrapper<stellarwitch7.obeisance.config.ObeisanceConfigModel> {

    public final Keys keys = new Keys();



    private ObeisanceConfig() {
        super(stellarwitch7.obeisance.config.ObeisanceConfigModel.class);
    }

    private ObeisanceConfig(Consumer<Jankson.Builder> janksonBuilder) {
        super(stellarwitch7.obeisance.config.ObeisanceConfigModel.class, janksonBuilder);
    }

    public static ObeisanceConfig createAndLoad() {
        var wrapper = new ObeisanceConfig();
        wrapper.load();
        return wrapper;
    }

    public static ObeisanceConfig createAndLoad(Consumer<Jankson.Builder> janksonBuilder) {
        var wrapper = new ObeisanceConfig(janksonBuilder);
        wrapper.load();
        return wrapper;
    }



    public static class Keys {

    }
}

