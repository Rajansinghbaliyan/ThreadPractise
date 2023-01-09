package threads.util;

import java.time.Duration;

public class Block {
    public static void block(){
        while (true){
            try {
                Thread.sleep(Duration.ofSeconds(2).toMillis());
                System.out.println("Main thread is blocked");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
