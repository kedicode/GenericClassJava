package com.munteverde.concretes;

import java.util.Date;

public class NationalPark extends Point {

    private String founded;
    public NationalPark(String name, double latitude, double longitude, int size, String founded) {
        super(name, latitude, longitude, size);
        this.founded = founded;
    }
}

