package com.hamzahjamad.practice.chapter_23_concurrency;

public interface Buffer {
    void blockingPut(int value) throws InterruptedException;
    int blockingGet() throws InterruptedException;
}
