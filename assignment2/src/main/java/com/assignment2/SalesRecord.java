package com.assignment2;

public class SalesRecord {

    private int orderNumber;
    private int quantityOrdered;
    private double priceEach;
    private double sales;
    private String orderDate;
    private String status;
    private String productLine;
    private String country;
    private String dealSize;

    public SalesRecord(int orderNumber, int quantityOrdered, double priceEach, double sales,
                       String orderDate, String status, String productLine, String country, String dealSize) {
        this.orderNumber = orderNumber;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.sales = sales;
        this.orderDate = orderDate;
        this.status = status;
        this.productLine = productLine;
        this.country = country;
        this.dealSize = dealSize;
    }

    public int getOrderNumber() { return orderNumber; }
    public int getQuantityOrdered() { return quantityOrdered; }
    public double getPriceEach() { return priceEach; }
    public double getSales() { return sales; }
    public String getOrderDate() { return orderDate; }
    public String getStatus() { return status; }
    public String getProductLine() { return productLine; }
    public String getCountry() { return country; }
    public String getDealSize() { return dealSize; }
}
