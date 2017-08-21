package com.flavio.ocp.chapter04.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class BasicCollectors {

  public static void main(String[] args) {
    Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
    String result1 = ohMy1.collect(Collectors.joining(", "));
    System.out.println(result1);

    Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
    Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
    System.out.println(result2);


    Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
    Map<String, Integer> map = ohMy3.collect(
    Collectors.toMap(s -> s, String::length));
    System.out.println(map);

    Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map1 = ohMy4.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
    System.out.println(map1); // {5=lions,bears, 6=tigers} System.out.println(map.getClass());

    Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map2 = ohMy5.collect(Collectors.groupingBy(String::length));
    System.out.println(map2); // {5=[lions, bears], 6=[tigers]}

    Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears", "bears");
    TreeMap<Integer, Set<String>> map3 = ohMy6.collect(
    Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
    System.out.println(map3);

    Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map4 = ohMy7.collect(
    Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map4);

    Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map5 = ohMy8.collect(Collectors.groupingBy(
        String::length, Collectors.counting()));
    System.out.println(map5);

//    Stream<String> ohMy9 = Stream.of("lions", "tigers", "bears");
//    Map<Integer, Optional<Character>> map6 = ohMy9.collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
//    System.out.println(map6); // {5=Optional[b], 6=Optional[t]}

  }
}
