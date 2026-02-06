import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " 执行任务 " + i);
            }
        };

        pool.submit(task);
        pool.submit(task);
        pool.shutdown();

        if (!pool.awaitTermination(3, TimeUnit.SECONDS)) {
            System.out.println("仍有任务未完成，尝试强制停止");
            pool.shutdownNow();
        } else {
            System.out.println("所有任务完成");
        }
    }
}
