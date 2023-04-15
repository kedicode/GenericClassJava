package com.munteverde.concretes;

import com.munteverde.interfaces.Mappable;

public class Point implements Mappable {
    private int sqrMiles;
    private Location location;
    public Point(String name, double latitude, double longitude, int size) {
        this.location = new Location(name, latitude, longitude);
        this.sqrMiles = size;
    }

    @Override
    public String render() {
        return TEMPLATE
                .formatted(location.getName(),
                        "POINT",
                        "%6.4f, %6.4f".formatted(
                                location.getLatitude(),
                                location.getLongitude()));
    }
}

