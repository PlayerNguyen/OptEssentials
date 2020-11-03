package com.github.playernguyen.optessentials;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class for OptEssentials. Represent the plugin class
 */
public final class OptEssentials extends JavaPlugin {

    private static OptEssentials instance;

    /**
     * Void on enable
     */
    @Override
    public void onEnable() {
        setupInstance(); // <- Imposter here
    }

    /**
     * Void to setup the instance
     */
    private void setupInstance() {
        instance = this;
    }

    /**
     * Get the instance of plugin
     * @return the current instance class which initiated
     */
    public static OptEssentials getInstance() {
        return instance;
    }
}
