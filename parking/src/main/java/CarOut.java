public class CarOut extends Thread {
    Park park=new Park();
    public CarOut(Park park) {
        this.park=park;
    }

    public void run() {
        super.run();
        for(int i=1;i<10;i++){
            park.CarOut(i);
        }
    }
}



