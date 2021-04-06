package flowerTypes;

import flowerParameters.FlowerFreshness;
import flowerParameters.Flower;

public class MeadowFlower extends Flower {
    private boolean frostResistance;


    public MeadowFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean frostResistance) {
        super(name, color, length, prise, freshness);
        this.frostResistance = frostResistance;
    }
}
