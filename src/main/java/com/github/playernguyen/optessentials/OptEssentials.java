package com.github.playernguyen.optessentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class for OptEssentials. Represent the plugin class
 */
public final class OptEssentials extends JavaPlugin {

    private static final String PLACEHOLDER_API_NAME = "PlaceholderAPI";

    private static OptEssentials instance;

    private boolean placeholderAPIActive = false;

    /**
     * Void on enable
     */
    @Override
    public void onEnable() {
        setupInstance(); // <- Imposter here

        setupDependencies();
    }

    /**
     * Setup dependencies
     */
    private void setupDependencies() {
        // PlaceholderAPI detection
        if (Bukkit.getPluginManager().getPlugin(PLACEHOLDER_API_NAME) != null) {
            this.placeholderAPIActive = true;
        }
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

    /**
     *
     * @return the existed of PlaceholderAPI
     */
    public boolean isPlaceholderAPIActive() {
        return placeholderAPIActive;
    }

    /**
     * A shortcut for {@link #getInstance()}
     * @return the current instance class which initiated
     */
    public static OptEssentials inst() {
        return getInstance();
    }
}
