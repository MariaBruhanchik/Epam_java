package flowerTypes;

import flowerParameters.FlowerFreshness;
import flowerParameters.Flower;

public class GardenFlower extends Flower {
    private boolean hygrophilous;

    public GardenFlower(String name, String color, double length, double prise, FlowerFreshness freshness, boolean hygrophilous) {
        super(name, color, length, prise, freshness);
        this.hygrophilous = hygrophilous;
    }


}
