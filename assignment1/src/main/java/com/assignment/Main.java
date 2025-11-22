package com.assignment;

public class Main {
    public static void main(String[] args) throws Exception {

        SourceContainer source = new SourceContainer();
        DestinationContainer destination = new DestinationContainer();
        SharedBuffer buffer = new SharedBuffer(5);

        Thread producer = new Thread(new Producer(buffer, source));
        Thread consumer = new Thread(new Consumer(buffer, destination));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Final destination items: " + destination.getAllItems());
    }
}
