package com.github.playernguyen.optessentials.strings;

import com.github.playernguyen.optessentials.OptEssentials;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * PlaceholderString is an adapter object to hold the String which immutable.
 * This class will parse the holder and return the String object whenever call get
 */
public class PlaceholderString {

    private final String holder;

    public PlaceholderString(String holder) {
        this.holder = holder;
    }

    /**
     * Parse the holder and return
     * @param player A player to execute
     * @return the parser string whether PlaceholderAPI found or raw string unless found
     */
    public String get(Player player) {
        if (!OptEssentials.inst().isPlaceholderAPIActive()) {
            return holder;
        }
        return PlaceholderAPI.setPlaceholders(player, this.holder);
    }

    /**
     * Parse the holder and return
     * @param sender A command sender
     * @return the parser string whether PlaceholderAPI found or holder string unless found
     */
    public String get(CommandSender sender) {
        if (!OptEssentials.inst().isPlaceholderAPIActive()) {
            return holder;
        }
        if (!(sender instanceof Player)) {
            return holder;
        }
        return PlaceholderAPI.setPlaceholders((Player) sender, this.holder);
    }


}
