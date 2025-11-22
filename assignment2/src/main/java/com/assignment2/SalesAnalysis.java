package com.assignment2;

import java.util.*;
import java.util.stream.Collectors;

public class SalesAnalysis {

    private final List<SalesRecord> records;

    public SalesAnalysis(List<SalesRecord> records) {
        this.records = records;
    }

    // Total revenue
    public double getTotalRevenue() {
        return records.stream()
                .mapToDouble(SalesRecord::getSales)
                .sum();
    }

    // Total quantity sold
    public int getTotalQuantity() {
        return records.stream()
                .mapToInt(SalesRecord::getQuantityOrdered)
                .sum();
    }

    // Revenue by product line
    public Map<String, Double> getRevenueByProductLine() {
        return records.stream()
                .collect(Collectors.groupingBy(
                        SalesRecord::getProductLine,
                        Collectors.summingDouble(SalesRecord::getSales)
                ));
    }

    // Top 5 countries by revenue
    public Map<String, Double> getTop5CountriesByRevenue() {
        return records.stream()
                .collect(Collectors.groupingBy(
                        SalesRecord::getCountry,
                        Collectors.summingDouble(SalesRecord::getSales)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    // Most sold product line
    public String getTopProductLine() {
        return records.stream()
                .collect(Collectors.groupingBy(
                        SalesRecord::getProductLine,
                        Collectors.summingInt(SalesRecord::getQuantityOrdered)
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
    }

    // Average price by product line
    public Map<String, Double> getAveragePriceByProductLine() {
        return records.stream()
                .collect(Collectors.groupingBy(
                        SalesRecord::getProductLine,
                        Collectors.averagingDouble(SalesRecord::getPriceEach)
                ));
    }

    // Filter records by status
    public List<SalesRecord> filterByStatus(String status) {
        return records.stream()
                .filter(r -> r.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
