package com.flavio.ocp.chapter05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithDurations {

  public static void main(String[] args) {
    Duration daily = Duration.ofDays(1);
    Duration hourly = Duration.ofHours(1);
    Duration everyMinute = Duration.ofMinutes(1);
    Duration everyTenSeconds = Duration.ofSeconds(10);
    Duration everyMilli = Duration.ofMillis(1);
    Duration everyNano = Duration.ofNanos(1);

    System.out.println(daily);
    System.out.println(hourly);
    System.out.println(everyMinute);
    System.out.println(everyTenSeconds);
    System.out.println(everyMilli);
    System.out.println(everyNano);


    Duration daily1 = Duration.of(1, ChronoUnit.DAYS);
    Duration hourly1 = Duration.of(1, ChronoUnit.HOURS);
    Duration everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
    Duration everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
    Duration everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);
    Duration everyNano1 = Duration.of(1, ChronoUnit.NANOS);

    System.out.println(daily1);
    System.out.println(hourly1);
    System.out.println(everyMinute1);
    System.out.println(everyTenSeconds1);
    System.out.println(everyMilli1);
    System.out.println(everyNano1);


    LocalTime one = LocalTime.of(5, 15);
    LocalTime two = LocalTime.of(6, 30);
    LocalDate date = LocalDate.of(2016, 1, 20);
    System.out.println(ChronoUnit.HOURS.between(one, two)); //
    System.out.println(ChronoUnit.MINUTES.between(one, two)); //
    //System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException


    LocalDate date1 = LocalDate.of(2015, 1, 20);
    LocalTime time1 = LocalTime.of(6, 15);
    LocalDateTime dateTime = LocalDateTime.of(date1, time1);
    Duration duration = Duration.ofHours(23);
    System.out.println(dateTime.plus(duration)); // 2015–01–21T05:15
    System.out.println(time1.plus(duration)); // 05:15
    //System.out.println(date.plus(duration)); // UnsupportedTemporalException

  }

}
