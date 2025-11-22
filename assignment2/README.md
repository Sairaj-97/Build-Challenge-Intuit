# Assignment 2 – Sales Data Analysis Using Java Streams, Functional Programming & OpenCSV

This project analyzes a real-world sales dataset using **Java Streams**, **functional programming**, and **OpenCSV** for accurate CSV parsing.  
The goal is to implement aggregation, grouping, filtering, and sorting operations using the Streams API while working with a non-trivial dataset.

## Overview

The application performs the following operations:

- Reads and loads a CSV dataset (`sales_data_sample.csv`)
- Parses rows into Java objects (`SalesRecord`)
- Performs various analytics using Java Streams:
  - Total revenue
  - Total quantity sold
  - **Top 5 countries by revenue**
  - Revenue by product line
  - Average price by product line
  - Count of shipped orders
  - Top-selling product line
- Prints all results in a clear, formatted console output

## Dataset Information

**File:** `sales_data_sample.csv`  
**Rows:** ~2823 records  
**Columns Used in This Assignment:**

- ORDERNUMBER  
- QUANTITYORDERED  
- PRICEEACH  
- SALES  
- ORDERDATE  
- STATUS  
- PRODUCTLINE  
- COUNTRY  
- DEALSIZE  

The CSV is placed under:
```
src/main/resources/sales_data_sample.csv
```

## Technologies Used

- Java 17
- Maven
- OpenCSV 5.7.1
- Java Streams API
- Functional Programming Concepts (map/filter/reduce/grouping)
- exec-maven-plugin
- JUnit 5 for testing

## How to Run the Project

### Build the project
```bash
mvn clean package
```

### Run the program
```bash
mvn exec:java
```

The program will automatically run `com.assignment2.Main`.

## Unit Testing (JUnit 5)

This project includes comprehensive unit tests to validate:

- Successful CSV loading  
- Preprocessing correctness  
- Revenue calculations  
- Revenue by product line  
- Top 5 countries by revenue  
- Average price calculations  
- Filtering logic (e.g., shipped orders)

### Test Files:
```
src/test/java/com/assignment2/SalesCSVReaderTest.java
src/test/java/com/assignment2/SalesAnalysisTest.java
```

### Run all tests:
```bash
mvn test
```

## Functional Requirements Implemented

### Data Loading & Parsing  
- CSV loaded using OpenCSV  
- Handles quoted fields and commas inside values  
- Maps rows to `SalesRecord` POJOs  

### Stream-Based Operations  
- `map`, `filter`, `sorted`, `limit`, `collect`, `groupingBy`, `mapToDouble`, `mapToInt`  
- Method references (`Class::method`)  
- Chained Stream pipelines  

### Analytics  
- Total revenue  
- Total quantity sold  
- Revenue grouped by product line  
- **Top 5 countries by revenue (sorted descending)**  
- Average price by product line  
- Count of shipped records  
- Best-performing product line  

## Maven Dependencies (Already Configured in pom.xml)

- `opencsv` — CSV parsing  
- `maven-surefire-plugin` — JUnit 5 support  
- `exec-maven-plugin` — run Main  
- `junit-jupiter` — tests  

## Conclusion

This assignment demonstrates:

- Clean and modular Java programming  
- Correct handling of real-world CSV data  
- Functional programming with Streams  
- Grouping, aggregation, filtering, and sorting  
- Practical use of OpenCSV  
- Clear, formatted analytical output
