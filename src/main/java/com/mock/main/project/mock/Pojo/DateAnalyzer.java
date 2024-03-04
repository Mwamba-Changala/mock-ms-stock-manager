package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Entites.Installations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateAnalyzer {

    public Map<String, Integer> theDate(List<Installations> installations) throws ParseException {
        // Assuming you have a list of date strings coming from the database
        List<String> dateStringsFromDB = Arrays.asList("2023-01-15", "2023-02-20", "2023-01-25", "2023-02-10", "2023-03-05");

        for(Installations maDate:installations){

            System.out.println(installations.get(0).getCreatedAt());
        }

        // Format for the input date strings
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format for extracting the month name
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);

        // Map to store the count of dates for each month
        Map<String, Integer> monthCountMap = new HashMap<>();

        // Count the dates for each month
//        for (String dateString : dateStringsFromDB) {
//
//            Date date = inputFormat.parse(dateString);
//            String monthName = monthFormat.format(date);
//
//            // Update the count in the map
//            monthCountMap.put(monthName, monthCountMap.getOrDefault(monthName, 0) + 1);
//
//        }

        for (Installations maDate : installations) {

//            Date date = inputFormat.parse(maDate.getCreatedAt());
            String monthName = monthFormat.format(maDate.getCreatedAt());

            // Update the count in the map
            monthCountMap.put(monthName, monthCountMap.getOrDefault(monthName, 0) + 1);

        }

        // Display the results
//        for (Map.Entry<String, Integer> entry : monthCountMap.entrySet()) {
//            System.out.println("Month: " + entry.getKey() + ", Count: " + entry.getValue());
//        }

    return monthCountMap;
    }


}

