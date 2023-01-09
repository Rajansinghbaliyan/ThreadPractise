import threads.ThreadPractise;
import threads.util.Block;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        ThreadPractise threadPractise = new ThreadPractise();

//        threadPractise.createThreads();

        threadPractise.createThreadThroughClasses();
        Block.block();
    }
}
