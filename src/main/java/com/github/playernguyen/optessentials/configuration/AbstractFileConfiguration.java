package com.github.playernguyen.optessentials.configuration;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

/**
 * The abstract configuration class.
 * Unset the configuration
 */
public abstract class AbstractFileConfiguration<T extends IConfigurationTemplate> {

    private final File file;
    private final FileConfiguration fileConfiguration;

    public AbstractFileConfiguration(Plugin plugin, String name, T[] definitions, String parent) {
        // Data folder setup
        if (!plugin.getDataFolder().exists() && !plugin.getDataFolder().mkdir()) {
            throw new NullPointerException("Data folder not found and created");
        }
        // Parent folder setup
        File parentFolder = (parent == null || parent.equalsIgnoreCase(""))
                    ? plugin.getDataFolder() : new File(plugin.getDataFolder(), parent);
        if (!parentFolder.exists() && !parentFolder.mkdir()) {
            throw new NullPointerException("Parent folder not found and created");
        }
        // File load
        this.file = new File(parentFolder, name);
        this.fileConfiguration = YamlConfiguration.loadConfiguration(this.file);
        // Set can be copy
        this.fileConfiguration.options().copyDefaults(true);
        for (T definition : definitions) {
            this.fileConfiguration.addDefault(definition.getPath(), definition.getDefine());
        }
        this.onInit();
        try {
            this.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onInit() {

    }

    public FileConfiguration getFileConfiguration() {
        return fileConfiguration;
    }

    public File getFile() {
        return file;
    }

    public void save () throws IOException {
        this.fileConfiguration.save(this.file);
    }
}
