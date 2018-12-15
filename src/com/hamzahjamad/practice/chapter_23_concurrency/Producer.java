package com.hamzahjamad.practice.chapter_23_concurrency;

import java.security.SecureRandom;

public class Producer implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;

    public Producer(Buffer sharedLocation)
    {
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run()
    {
        int sum = 0;

        for (int count = 1; count <= 10; count++)
        {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(count);
                sum += count;
                System.out.printf("\t%2d%n", sum);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("Producer done producing%nTerminating Producer");
    }
}
