package flowers;

import flowerParameters.FlowerFreshness;
import flowerParameters.FlowerTypes;

import java.util.Objects;

public class Camomile extends Flower {
    private final FlowerTypes flowerTypes=FlowerTypes.MEADOW;

    public Camomile(String name, String color, double length, double prise, FlowerFreshness freshness) {
        super(name, color, length, prise, freshness);
    }

    public FlowerTypes getFlowerTypes() {
        return flowerTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camomile camomile = (Camomile) o;
        return flowerTypes == camomile.flowerTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flowerTypes);
    }

    @Override
    public String toString() {
        return "Camomile{" +
                "flowerTypes=" + flowerTypes +
                '}';
    }
}
