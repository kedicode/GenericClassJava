package com.munteverde.concretes;

import com.munteverde.interfaces.Mappable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line implements Mappable {

    private int length;
    private Location location;
    private List<Location> locations;

    public Line(int length, Location location) {
        this.length = length;
        this.location = location;
        this.locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        if (!locations.contains(location)) {
            locations.add(location);
        }
    }

    @Override
    public String render() {
        var locationsString = new StringBuilder();
        for (Location location : locations) {
            locationsString.append("[%6.4f, %6.4f], ".formatted(location.getLatitude(), location.getLongitude()));
        }
        var finalString = locationsString.substring(0, locationsString.length()-2);
        return TEMPLATE.formatted(location.getName(), "LINE", finalString);
    }
}

