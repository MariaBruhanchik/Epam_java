package flowers;

import flowerParameters.FlowerFreshness;
import flowerParameters.FlowerTypes;

import java.util.Objects;

public class Cornflower extends Flower {
    private final FlowerTypes flowerTypes=FlowerTypes.MEADOW;

    public Cornflower(String name, String color, double length, double prise, FlowerFreshness freshness) {
        super(name, color, length, prise, freshness);
    }

    public FlowerTypes getFlowerTypes() {
        return flowerTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cornflower that = (Cornflower) o;
        return flowerTypes == that.flowerTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerTypes);
    }

    @Override
    public String toString() {
        return "Cornflower{" +
                "flowerTypes=" + flowerTypes +
                '}';
    }
}
