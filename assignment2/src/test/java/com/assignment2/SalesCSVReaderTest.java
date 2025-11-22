package com.assignment2;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SalesCSVReaderTest {

    @Test
    void testCSVLoadsSuccessfully() {
        SalesCSVReader reader = new SalesCSVReader();
        List<SalesRecord> records = reader.loadSalesData();

        assertNotNull(records, "CSV should load and return a list");
        assertFalse(records.isEmpty(), "CSV should contain records");
        assertTrue(records.size() > 1000, "Dataset should have more than 1000 records after preprocessing");
    }

    @Test
    void testNoBlankCountriesAfterPreprocessing() {
        SalesCSVReader reader = new SalesCSVReader();
        List<SalesRecord> records = reader.loadSalesData();

        assertTrue(records.stream().allMatch(r -> r.getCountry() != null && !r.getCountry().isBlank()),
                "All records should have a valid COUNTRY value");
    }
}
