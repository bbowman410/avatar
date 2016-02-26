package com.example.ben.avatar_004;

import android.location.Location;

/**
 * Created by John on 2/25/2016.
 */
public class Avatar {
    private long id;
    private String name;
    private Location location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
