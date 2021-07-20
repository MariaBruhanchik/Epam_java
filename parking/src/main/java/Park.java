public class Park {
    boolean[] park = new boolean[10];
    private int state = 5;

    public synchronized void CarIn(int i) {
        try {
            while (state == 0) {
                wait();
                System.out.println("Parking places : " + state + "  car  " + i + " has arrived to other parking");

            }
            System.out.println(i + "  Car on parking");
            state = state - 1;
            System.out.println("Parking places : " + state);

            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public synchronized void CarOut(int i) {
        try {
            while (state == 5) {
                wait();
            }
            System.out.println(i + "  car left");
            state = state + 1;
            System.out.println("Parking places : " + state);

            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}

