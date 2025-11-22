package com.assignment;

public class Consumer implements Runnable {

    private final SharedBuffer buffer;
    private final DestinationContainer destination;

    public Consumer(SharedBuffer buffer, DestinationContainer destination) {
        this.buffer = buffer;
        this.destination = destination;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = buffer.take();

                // -1 = end signal
                if (item == -1) {
                    break;
                }

                System.out.println("Consumer consumed: " + item);
                destination.store(item);
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
