import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class S60 {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable printTimeTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Current time: " + java.time.LocalTime.now());
            }
        };
        Runnable shutdownTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Shutting down scheduler.");
                scheduler.shutdown();
            }
        };
        scheduler.scheduleAtFixedRate(printTimeTask, 0, 2, TimeUnit.SECONDS);
        scheduler.schedule(shutdownTask, 10, TimeUnit.SECONDS);
    }
}
