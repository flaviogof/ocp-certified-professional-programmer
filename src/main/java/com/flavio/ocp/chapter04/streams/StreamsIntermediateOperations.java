package com.flavio.ocp.chapter04.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsIntermediateOperations {

  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
    s1.filter(x -> x.startsWith("m")).forEach(System.out::println);

    Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
    s2.distinct().forEach(System.out::println);

    Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
    s3.skip(5).limit(2).forEach(System.out::println);

    Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
    s4.map(String::length).forEach(System.out::println);


    List<String> zero = Arrays.asList();
    List<String> one = Arrays.asList("Bonobo");
    List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
    Stream<List<String>> animals = Stream.of(zero, one, two);
    animals.flatMap(l -> l.stream()).forEach(System.out::println);

    Stream<String> s5 = Stream.of("brown-", "bear-");
    s5.sorted().forEach(System.out::println);

    Stream<String> s6 = Stream.of("brown-", "bear-");
    s6.sorted(Comparator.reverseOrder()).forEach(System.out::println);

    Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
    long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count(); // grizzly System.out.println(count);
    System.out.println(count);

    List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
    list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
  }

}
