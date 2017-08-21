package com.flavio.ocp.chapter05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriods {

  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
    LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
    Period period = Period.ofMonths(1);
    performAnimalEnrichment(start, end, period);

    System.out.println(Period.of(1,2,3));
    System.out.println(Period.ofMonths(3));
    System.out.println(Period.of(0, 20, 47));
    System.out.println(Period.ofWeeks(3));

    LocalDate date = LocalDate.of(2015, 1, 20);
    LocalTime time = LocalTime.of(6, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    Period per = Period.ofMonths(1);
    System.out.println(date.plus(per)); // 2015–02–20
    System.out.println(dateTime.plus(per)); // 2015–02–20T06:15
    //System.out.println(time.plus(per)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
  }

  private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
    LocalDate upTo = start;
    while (upTo.isBefore(end)) { // check if still before end
      System.out.println("give new toy: " + upTo);
      upTo = upTo.plus(period); // add a month
    }
  }
}
