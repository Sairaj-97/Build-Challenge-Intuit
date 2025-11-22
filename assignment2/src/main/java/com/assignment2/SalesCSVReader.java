package com.assignment2;

import com.opencsv.CSVReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class SalesCSVReader {

    public List<SalesRecord> loadSalesData() {
        try {

            CSVReader reader = new CSVReader(
                    new InputStreamReader(
                            getClass().getClassLoader().getResourceAsStream("sales_data_sample.csv"),
                            "ISO-8859-1"
                    )
            );

            return reader.readAll().stream()
                    .skip(1) // skip header
                    .map(parts -> new SalesRecord(
                            Integer.parseInt(parts[0]),     // ORDERNUMBER
                            Integer.parseInt(parts[1]),     // QUANTITYORDERED
                            Double.parseDouble(parts[2]),   // PRICEEACH
                            Double.parseDouble(parts[4]),   // SALES
                            parts[5],                       // ORDERDATE
                            parts[6],                       // STATUS
                            parts[13],                      // PRODUCTLINE
                            parts[20],                      // COUNTRY
                            parts[24]                       // DEALSIZE
                    ))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException("Error reading CSV", e);
        }
    }
}
