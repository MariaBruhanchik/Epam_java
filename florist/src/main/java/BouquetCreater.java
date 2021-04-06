import bouquetParameters.Bouquet;
import bouquetParameters.BouquetAccessories;
import flowerParameters.FlowerFreshness;
import flowerTypes.GardenFlower;
import flowerTypes.HomeFlower;
import flowerTypes.MeadowFlower;
import flowerParameters.FinderFlowerLength;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BouquetCreater {
    public static void main(String[] args) {
        GardenFlower rose = new GardenFlower("Rose", "white", 35, 7.20, FlowerFreshness.FRESH, true);
        GardenFlower pion = new GardenFlower("Pion", "red", 40, 8.50, FlowerFreshness.NOT_FRESH, true);
        MeadowFlower camomile = new MeadowFlower("Camomile", "white", 38, 5.50, FlowerFreshness.FRESH, true);
        MeadowFlower cornflower = new MeadowFlower("Cornflower", "blue", 30, 5.00, FlowerFreshness.FRESH, true);
        HomeFlower mint = new HomeFlower("Mint", "green", 25, 10.00, FlowerFreshness.FRESH, false);
        HomeFlower orchid = new HomeFlower("Orchid", "white", 50, 12.50, FlowerFreshness.NOT_FRESH, true);

        Bouquet bouquet = new Bouquet();
        bouquet.createBouquet(pion, 3).createBouquet(rose, 3).createBouquet(mint, 2);

        double fullCoastOfTheBouquet = bouquet.getBouquetPrise() + BouquetAccessories.WRAPPING.getPrice() + BouquetAccessories.TAPE.getPrice();
        System.out.println("Full Coast of the Bouquet: " + fullCoastOfTheBouquet + " rubles");

        List<String> freshnessFlowers = new ArrayList<>();
        FinderFlowerLength finderFlowerLength = new FinderFlowerLength(35, 40);
        freshnessFlowers.add(pion.getFreshness() + " " + pion.getName());
        freshnessFlowers.add(rose.getFreshness() + " " + rose.getName());
        freshnessFlowers.add(mint.getFreshness() + " " + mint.getName());

        finderFlowerLength.findLength(pion);
        finderFlowerLength.findLength(rose);
        finderFlowerLength.findLength(mint);


        Collections.sort(freshnessFlowers);
        System.out.println(freshnessFlowers);

    }
}
