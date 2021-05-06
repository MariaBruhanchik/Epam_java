import bouquetParameters.Bouquet;
import bouquetParameters.BouquetAccessories;
import flowerParameters.FinderFlowerLength;
import flowerParameters.FlowerFreshness;
import flowerParameters.FlowerTypes;
import flowers.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BouquetCreater {
    public static void main(String[] args) {
        Rose rose = new Rose("Rose", "white", 35, 7.20, FlowerFreshness.FRESH);
        Pion pion = new Pion("Pion", "red", 40, 8.50, FlowerFreshness.NOT_FRESH);
        Camomile camomile = new Camomile("Camomile", "white", 38, 5.50, FlowerFreshness.FRESH);
        Cornflower cornflower = new Cornflower("Cornflower", "blue", 30, 5.00, FlowerFreshness.FRESH);
        Mint mint = new Mint("Mint", "green", 25, 10.00, FlowerFreshness.FRESH);
        Orchid orchid = new Orchid("Orchid", "white", 50, 12.50, FlowerFreshness.NOT_FRESH);

        Bouquet bouquet = new Bouquet();
        bouquet.createBouquet(rose, 3).createBouquet(pion, 3).createBouquet(mint, 2);

        double fullCoastOfTheBouquet = bouquet.getBouquetPrise() + BouquetAccessories.WRAPPING.getPrice() + BouquetAccessories.TAPE.getPrice();
        System.out.println("Full Coast of the Bouquet: " + fullCoastOfTheBouquet + " rubles");

        List<String> freshnessFlowers = new ArrayList<>();
        FinderFlowerLength finderFlowerLength = new FinderFlowerLength(35, 40);
        freshnessFlowers.add(rose.getFreshness() + " " + rose.getName());
        freshnessFlowers.add(pion.getFreshness() + " " + pion.getName());
        freshnessFlowers.add(mint.getFreshness() + " " + mint.getName());

        finderFlowerLength.findLength(rose);
        finderFlowerLength.findLength(pion);
        finderFlowerLength.findLength(mint);


        Collections.sort(freshnessFlowers);
        System.out.println(freshnessFlowers);

    }
}
