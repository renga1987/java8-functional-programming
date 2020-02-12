package Advanced;


import java.util.stream.*;

public class ThreadSample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            IntStream.range(0, 100).forEach(num -> System.out.println(Thread.currentThread().getId() + " : " +num));
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

    }

}
