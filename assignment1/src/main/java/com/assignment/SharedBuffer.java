package com.assignment;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedBuffer {

    private final BlockingQueue<Integer> queue;

    public SharedBuffer(int capacity) {
        this.queue = new ArrayBlockingQueue<>(capacity);
    }

    public void put(Integer item) throws InterruptedException {
        queue.put(item); // Blocks when full
    }

    public Integer take() throws InterruptedException {
        return queue.take(); // Blocks when empty
    }
}
