package io.quarkus.vertx.runtime;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

import java.util.Optional;

@ConfigGroup
public class PfxConfiguration {

    /**
     * Path to the key file (PFX format)
     */
    @ConfigItem
    public Optional<String> path;

    /**
     * Password of the key.
     */
    @ConfigItem
    public Optional<String> password;
}
