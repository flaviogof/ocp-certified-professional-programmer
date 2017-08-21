package com.flavio.ocp.chapter05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreatingDateTimes {

  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());


    LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
    LocalDate date2 = LocalDate.of(2015, 1, 20);
    System.out.println(date1);
    System.out.println(date2);

    LocalTime time1 = LocalTime.of(6, 15); // hour and minute
    LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
    LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);

    LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
    LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    System.out.println(dateTime1);
    System.out.println(dateTime2);

    ZoneId zone = ZoneId.of("US/Eastern");
    ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20,
        6, 15, 30, 200, zone);
    ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
    ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
    System.out.println(zone);
    System.out.println(zoned1);
    System.out.println(zoned2);
    System.out.println(zoned3);

    ZoneId.getAvailableZoneIds().stream()
        .filter(z -> z.contains("US") || z.contains("America")) .sorted().forEach(System.out::println);

    //LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
  }
}
