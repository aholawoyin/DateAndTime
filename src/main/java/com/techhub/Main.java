package com.techhub;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        System.out.println("Day of the Month : "+d1.getDayOfMonth());
        System.out.println("Day of the Week : "+d1.getDayOfWeek());
        System.out.println("Month : "+d1.getMonth());
        System.out.println("Day of the Year : "+d1.getDayOfYear());
        System.out.println("Year: "+d1.getYear());

        String stringDate = "2025-04-10";

        LocalDate d2 = LocalDate.parse(stringDate);
        System.out.println("String Date is : "+ d2.toString());

        LocalDate d3 = d2.minusMonths(5);
        System.out.println("Five month ago is  : "+d3.toString());

        LocalDate d4 = d2.plusYears(6);
        System.out.println("Six years time: "+ d4.toString());

        LocalDate dob = LocalDate.of(1995,07,23);
        int age =  Period.between(dob,d1).getYears();

        System.out.println("Age = "+age);



        // Time
        LocalTime t1 = LocalTime.now();
        //String stringTime = String.format("%4.2f - %5.3f - %6.3f",7.7,8.9,10.0);
        System.out.println(String.format("%s:%s:%s",t1.getHour(),t1.getMinute(),t1.getSecond()));

        LocalDateTime dt1 = LocalDateTime.of(2025,5,15,
                9,25,41);
        System.out.println("Date and Time is :"+ dt1.toString());

        Long timeBetween = Duration.between(dt1.toLocalTime(),t1).getSeconds();
        System.out.println("Seconds : "+ (timeBetween/(60*60)) + " hrs");

        //Set<String> zones =  ZoneId.getAvailableZoneIds();
       // System.out.println(zones);

        ZoneId zone =ZoneId.of("Canada/Saskatchewan");

        LocalDateTime dt2 = LocalDateTime.now();

        ZonedDateTime zdt1 = ZonedDateTime.of(dt2, zone);

        System.out.println("Local Date and Time :" + dt2.toString());
        System.out.println("Canadian  Date and Time :" + zdt1.toString());

        System.out.println(String.format("Canadian  Time %s:%s:%s" , zdt1.getHour(),zdt1.getMinute(), zdt1.getSecond()));

    }
}