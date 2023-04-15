package com.munteverde.concretes;

import com.munteverde.enums.WaterUsage;

public class River extends Line{
    private WaterUsage mainUsage;
    public River(int length, Location location, WaterUsage mainUsage) {
        super(length, location);
        this.mainUsage = mainUsage;
    }
}
