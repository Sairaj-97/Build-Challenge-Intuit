package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class DestinationContainer {

    private final List<Integer> stored = new ArrayList<>();

    public synchronized void store(Integer item) {
        stored.add(item);
        System.out.println("Stored in destination: " + item);
    }

    public List<Integer> getAllItems() {
        return stored;
    }
}
