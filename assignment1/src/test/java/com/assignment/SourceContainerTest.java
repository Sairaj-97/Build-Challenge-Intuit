package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SourceContainerTest {

    @Test
    void testSourceProvidesItems() {
        SourceContainer source = new SourceContainer();
        assertFalse(source.isEmpty());

        Integer first = source.getItem();
        assertEquals(1, first);
    }

    @Test
    void testSourceBecomesEmpty() {
        SourceContainer source = new SourceContainer();

        for (int i = 0; i < 10; i++) {
            source.getItem();
        }

        assertTrue(source.isEmpty());
        assertNull(source.getItem());
    }
}
