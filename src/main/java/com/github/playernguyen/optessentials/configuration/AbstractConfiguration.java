package com.github.playernguyen.optessentials.configuration;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

/**
 * The abstract configuration class.
 * Unset the configuration
 */
public abstract class AbstractConfiguration<T extends IConfigurationTemplate> {

    private File file;
    private FileConfiguration fileConfiguration;

    public AbstractConfiguration(String name, T[] definitions, String parent) {
        
    }

}
