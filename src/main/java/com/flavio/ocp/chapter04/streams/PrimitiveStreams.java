package com.flavio.ocp.chapter04.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams  {

  public static void main(String[] args) {
    DoubleStream oneValue = DoubleStream.of(3.14);
    DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
    oneValue.forEach(System.out::println);
    System.out.println();
    varargs.forEach(System.out::println);

    System.out.println();
    DoubleStream random = DoubleStream.generate(Math::random);
    DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
    random.limit(3).forEach(System.out::println);
    System.out.println();
    fractions.limit(3).forEach(System.out::println);

    System.out.println();
    IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
    count.forEach(System.out::println);

    System.out.println();
    IntStream range = IntStream.range(1, 6);
    range.forEach(System.out::println);

    System.out.println();
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println);

    System.out.println();
    Stream<String> objStream = Stream.of("penguin", "fish");
    IntStream intStream = objStream.mapToInt(s -> s.length());

    System.out.println();
    IntStream stream = IntStream.rangeClosed(1,10);
    OptionalDouble optional = stream.average();
    optional.ifPresent(System.out::println);
    System.out.println(optional.getAsDouble());
    System.out.println(optional.orElseGet(() -> Double.NaN));


    IntStream intStream1 = IntStream.rangeClosed(1,10);
    System.out.println(range(intStream1));
  }

  private static int range(IntStream ints) {
    IntSummaryStatistics stats = ints.summaryStatistics();
    if (stats.getCount() == 0) throw new RuntimeException();
    return stats.getMax()-stats.getMin();
  }

}
