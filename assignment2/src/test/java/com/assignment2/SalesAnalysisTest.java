package com.assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SalesAnalysisTest {

    private List<SalesRecord> records;
    private SalesAnalysis analysis;

    @BeforeEach
    void setup() {
        SalesCSVReader reader = new SalesCSVReader();
        records = reader.loadSalesData();
        analysis = new SalesAnalysis(records);
    }

    @Test
    void testTotalRevenueIsPositive() {
        double revenue = analysis.getTotalRevenue();
        assertTrue(revenue > 0, "Total revenue should be positive");
    }

    @Test
    void testTotalQuantityIsPositive() {
        int qty = analysis.getTotalQuantity();
        assertTrue(qty > 0, "Total quantity should be greater than zero");
    }

    @Test
    void testRevenueByProductLineNotEmpty() {
        Map<String, Double> map = analysis.getRevenueByProductLine();
        assertFalse(map.isEmpty(), "Revenue by product line should not be empty");
    }

    @Test
    void testTop5CountriesByRevenue() {
        Map<String, Double> map = analysis.getTop5CountriesByRevenue();
        assertEquals(5, map.size(), "Top 5 countries map should contain exactly 5 entries");
    }

    @Test
    void testAveragePriceByProductLine() {
        Map<String, Double> prices = analysis.getAveragePriceByProductLine();
        assertFalse(prices.isEmpty(), "Average price map should not be empty");
    }

    @Test
    void testShippedOrdersCount() {
        List<SalesRecord> shipped = analysis.filterByStatus("Shipped");
        assertTrue(shipped.size() > 0, "There should be shipped orders in dataset");
    }
}
