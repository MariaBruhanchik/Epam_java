package main.java.flowerTypes;

import main.java.flowerParameters.Flower;
import main.java.flowerParameters.FlowerFreshness;

public class HomeFlower extends Flower {
    private boolean FlowerPot;

    public HomeFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean flowerPot) {
        super(name, color, length, prise, freshness);
        FlowerPot = flowerPot;
    }

}
