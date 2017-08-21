package com.flavio.ocp.chapter04;

import java.util.Optional;

public class ReturningOptional {

  public static Optional<Double> average(int... scores) {
    if(scores.length == 0) return Optional.empty();
    int sum = 0;
    for(int score: scores) sum += score;
    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {
    System.out.println(average(90, 100));
    System.out.println(average());

    Optional<Double> opt1 = average(90, 100);
    if (opt1.isPresent())
      System.out.println(opt1.get()); // 95.0

//    Optional<Double> opt2 = average();
//    System.out.println(opt2.get());

    Optional<Double> opt3 = average(80, 100);
    opt3.ifPresent(System.out::println);

    Optional<Double> opt4 = average();
    System.out.println(opt4.orElse(Double.NaN));
    System.out.println(opt4.orElseGet(() -> Math.random()));
    System.out.println(opt4.orElseThrow(() -> new IllegalStateException()));

  }
}
