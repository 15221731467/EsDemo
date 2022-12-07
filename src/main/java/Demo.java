import java.util.concurrent.*;

public class Demo {


    public static void main(String[] args) {
        FTask f1 = new FTask("董");
        FTask f2 = new FTask("胡");

        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<?> s1 = es.submit(f1);
        Future<?> s2 = es.submit(f2);

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        es.shutdown();
    }
}
