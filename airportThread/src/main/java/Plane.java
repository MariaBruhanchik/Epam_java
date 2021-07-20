import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;


public class Plane extends Thread {
    Semaphore semaphore;
    private int id;
    private int numberOfRunway = 0;
    SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss.S");

    public Plane(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {

            while (numberOfRunway < 1) {
                semaphore.tryAcquire(3,TimeUnit.SECONDS);
                printMessage("the strip take the plane  " + id);
                 printMessage("The plane  " + id + " began to enter the strip  ");

                Thread.sleep(1500);
                numberOfRunway++;

                printMessage("The plane  " + id + "  in air ");

               printMessage("The strip is free  ");
                Thread.sleep(500);
                semaphore.release();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void printMessage(String message){
        String text=time.format(new Date())+" :  "+message;
        System.out.println(text);
    }
}
