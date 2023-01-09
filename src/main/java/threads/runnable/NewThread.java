package threads.runnable;

import java.time.Duration;

public class NewThread extends Thread {

    @Override
    public void run() {
        System.out.println("The thread name is: " + this.getName()) ;
        try {
            Thread.sleep(Duration.ofSeconds(10).toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is closed: "+ this.getName());
    }
}
