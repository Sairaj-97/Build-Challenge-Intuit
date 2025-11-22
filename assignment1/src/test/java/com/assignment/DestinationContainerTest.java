package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationContainerTest {

    @Test
    void testStoreAddsItems() {
        DestinationContainer dest = new DestinationContainer();
        dest.store(5);
        dest.store(10);

        assertEquals(2, dest.getAllItems().size());
        assertEquals(5, dest.getAllItems().get(0));
    }
}
