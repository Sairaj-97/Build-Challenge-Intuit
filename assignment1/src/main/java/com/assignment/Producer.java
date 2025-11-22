package com.assignment;

public class Producer implements Runnable {

    private final SharedBuffer buffer;
    private final SourceContainer source;

    public Producer(SharedBuffer buffer, SourceContainer source) {
        this.buffer = buffer;
        this.source = source;
    }

    @Override
    public void run() {
        try {
            while (!source.isEmpty()) {
                Integer item = source.getItem();
                if (item != null) {
                    System.out.println("Producer produced: " + item);
                    buffer.put(item);
                }
                Thread.sleep(100); // Doing some mock work
            }

            // Mark end of production using -1 
            buffer.put(-1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
