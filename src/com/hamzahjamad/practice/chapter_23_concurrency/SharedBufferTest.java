package com.hamzahjamad.practice.chapter_23_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Buffer sharedLocation = new UnsynchronizedBuffer();

        System.out.println("Action         \t\tValue\tSum of Produced\tSum of Consumed");
        System.out.printf("---------------\t\t-----\t---------------\t---------------%n%n");

        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
