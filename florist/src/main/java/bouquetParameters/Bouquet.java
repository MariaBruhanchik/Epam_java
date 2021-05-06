package bouquetParameters;

import flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Object> bouquet = new ArrayList<>();
    private double bouquetPrise;


    public Bouquet() {
    }

    public Bouquet createBouquet(Flower flower, double numberOfFlowers) {
        bouquet.add(flower);
        bouquetPrise += flower.getPrise() * numberOfFlowers;
        return this;
    }

    public double getBouquetPrise() {
        return bouquetPrise;
    }
}
