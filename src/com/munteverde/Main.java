package com.munteverde;

import com.munteverde.concretes.*;
import com.munteverde.enums.WaterUsage;
import com.munteverde.interfaces.Mappable;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

    Layer<Mappable> layer1 = new Layer<>();
    NationalPark grandCanyonNationalPark = new NationalPark("Grand Canyon National Park", 47.216d, -95.2348d, 1400, "1936");
    River mississippi = new River(2300, new Location("Mississippi River", 0, 0), WaterUsage.TRANSPORTATION);
    mississippi.addLocation(new Location("Start", 47.216d, -95.2348d));
    mississippi.addLocation(new Location("End", 35.1556d, -90.0659d));
    layer1.addElement(grandCanyonNationalPark);
    layer1.addElement(mississippi);
    layer1.renderLayer();
    }
}

