package com.assignment;

import java.util.LinkedList;
import java.util.List;

public class SourceContainer {
    private final List<Integer> items;

    public SourceContainer() {
        items = new LinkedList<>();
        // Pretend data source — you can change values if needed
        for (int i = 1; i <= 10; i++) {
            items.add(i);
        }
    }

    public synchronized Integer getItem() {
        if (items.isEmpty()) return null;
        return items.remove(0);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
