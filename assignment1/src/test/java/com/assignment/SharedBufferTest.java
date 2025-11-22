package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SharedBufferTest {

    @Test
    void testPutAndTake() throws Exception {
        SharedBuffer buffer = new SharedBuffer(2);

        buffer.put(100);
        buffer.put(200);

        assertEquals(100, buffer.take());
        assertEquals(200, buffer.take());
    }
}
