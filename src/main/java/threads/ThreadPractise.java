package threads;

import threads.runnable.NewThread;

import java.time.Duration;
import java.util.Date;

public class ThreadPractise {
    public void createThreads() {

        Runnable runnable = () -> {
            Date date = new Date();
            while (true) {
                System.out.println("The thread is running: " + Thread.currentThread().getName());

                if ((date.getTime() + Duration.ofSeconds(10).toMillis()) < new Date().getTime())
                    throw new RuntimeException("This thread is running for way to long");

                try {
                    Thread.sleep(Duration.ofSeconds(1).toMillis());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.setName("The_Victim");

        thread.setUncaughtExceptionHandler((t, e) -> {
            String msg = String.format("The exception %s occures in the thread: %s",
                    t.getName(),
                    e.getMessage()
            );
            System.out.println(msg);
        });

        thread.start();
    }

    public void createThreadThroughClasses(){
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
