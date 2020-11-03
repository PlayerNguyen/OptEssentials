package com.github.playernguyen.optessentials.warp;

import org.bukkit.Location;

/**
 * Warp is a object which store location data.
 * Warp is a map object as name -> location.
 * All fields in warp is immutable
 */
public class WarpObject{

    private final String name;
    private final Location location;

    public WarpObject(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Get name of the warp
     * @return the warp
     */
    public String getName() {
        return name;
    }

    /**
     * Get location of the warp
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

}
