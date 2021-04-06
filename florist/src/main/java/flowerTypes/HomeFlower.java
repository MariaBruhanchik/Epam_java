package flowerTypes;

import flowerParameters.FlowerFreshness;
import flowerParameters.Flower;

public class HomeFlower extends Flower {
    private boolean FlowerPot;

    public HomeFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean flowerPot) {
        super(name, color, length, prise, freshness);
        FlowerPot = flowerPot;
    }

}
