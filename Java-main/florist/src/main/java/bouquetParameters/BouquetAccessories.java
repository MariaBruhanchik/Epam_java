package bouquetParameters;

public enum BouquetAccessories {
    BOW(4.00), WRAPPING(8.00), TAPE(3.00);
    private double price;

    BouquetAccessories(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

