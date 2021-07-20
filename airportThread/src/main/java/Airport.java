import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;

public class Airport {
    public static void main(String[] args) {


        Semaphore semaphore=new Semaphore(5);
        for (int i = 0; i < 10; i++) {

            new Plane(semaphore,i).start();

        }
    }
}
