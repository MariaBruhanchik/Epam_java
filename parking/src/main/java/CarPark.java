public class CarPark {
    public static void main(String[] args) {
        Park park = new Park();

        new CarIn( park).start();
        new CarOut(park).start();
    }

}
