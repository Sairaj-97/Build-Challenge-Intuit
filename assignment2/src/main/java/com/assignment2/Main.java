package com.assignment2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SalesCSVReader csvReader = new SalesCSVReader();
        List<SalesRecord> records = csvReader.loadSalesData();

        SalesAnalysis analysis = new SalesAnalysis(records);

        System.out.printf("Total Revenue: $%,.2f%n", analysis.getTotalRevenue());
        System.out.println("Total Quantity Sold: " + analysis.getTotalQuantity());

        System.out.println("\nRevenue by Product Line:");
        analysis.getRevenueByProductLine().forEach((k, v) ->
                System.out.printf("%s: $%,.2f%n", k, v)
        );

        System.out.println("\nTop 5 Countries by Revenue:");
        analysis.getTop5CountriesByRevenue().forEach((k, v) ->
                System.out.printf("%s: $%,.2f%n", k, v)
        );

        System.out.println("\nTop Product Line: " + analysis.getTopProductLine());

        System.out.println("\nAverage Price by Product Line:");
        analysis.getAveragePriceByProductLine().forEach((k, v) ->
                System.out.printf("%s: %.2f%n", k, v)
        );

        System.out.println("\nShipped Orders Count: " + analysis.filterByStatus("Shipped").size());
    }
}
