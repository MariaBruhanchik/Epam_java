package main.java.flowerParameters;

import java.util.Objects;

public class Flower {
    private String name;
    private String color;
    private double length;
    private double prise;
    private FlowerFreshness freshness;

    public Flower(String name, String color, double length, double prise, FlowerFreshness freshness) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.prise = prise;
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPrise() {
        return prise;
    }

    public FlowerFreshness getFreshness() {
        return freshness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.length, length) == 0 &&
                Double.compare(flower.prise, prise) == 0 &&
                Objects.equals(name, flower.name) &&
                Objects.equals(color, flower.color) &&
                freshness == flower.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, length, prise, freshness);
    }
}
