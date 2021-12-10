package chapter12.Thread09.exam01_excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 10; i++) {
            Runnable runnalble = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
                    int poolSize= threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드이름: " + threadName);
                    int value = Integer.parseInt("삼");
                }
            };
            //executorService.execute(runnalble);
            executorService.submit(runnalble);
            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}
