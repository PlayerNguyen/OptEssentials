package com.github.playernguyen.optessentials.warp;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Warp manager store all warp object inside.
 * The collection inside is immutable {@link List}
 */
public class WarpManager implements Iterable<WarpObject> {

    private final List<WarpObject> warpList = new ArrayList<>();

    /**
     * Warp list object collection
     * @return the collection
     */
    public List<WarpObject> getWarpList() {
        return warpList;
    }

    @Override
    @NotNull
    public Iterator<WarpObject> iterator() {
        return warpList.iterator();
    }
}
