package com.flavio.ocp.chapter04.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

  public static void main(String[] args) {

    Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
    System.out.println(minEmpty.isPresent());

    Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
    System.out.println(s1.count());

    Stream<String> s2 = Stream.of("monkey", "ape", "bonobo");
    Optional<String> min = s2.min((o1, o2) -> o1.length() - o2.length());
    min.ifPresent(System.out::println);

    Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
    s4.findAny().ifPresent(System.out::println);

    Stream<String> infinite = Stream.generate(() -> "chimp");
    infinite.findAny().ifPresent(System.out::println);

    List<String> list = Arrays.asList("monkey", "2", "chimp");
    Stream<String> infinite2 = Stream.generate(() -> "chimp");
    Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

    System.out.println(list.stream().anyMatch(pred));
    System.out.println(list.stream().allMatch(pred));
    System.out.println(list.stream().noneMatch(pred));
    System.out.println(infinite2.anyMatch(pred));

    Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
    s5.forEach(System.out::println);


    Stream<String> s6 = Stream.of("w", "o", "l", "f");
    String word = s6.reduce("", String::concat);
    System.out.println(word);


    Stream<Integer> integerStream = Stream.of(3, 5, 6);
    System.out.println(integerStream.reduce(1, (a, b) -> a*b));


    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> empty = Stream.empty();
    Stream<Integer> oneElement = Stream.of(3);
    Stream<Integer> threeElements = Stream.of(3, 5, 6);

    empty.reduce(op).ifPresent(System.out::println);
    oneElement.reduce(op).ifPresent(System.out::println);
    threeElements.reduce(op).ifPresent(System.out::println);


    Stream<String> s7 = Stream.of("w", "o", "l", "f");
    StringBuilder word1 = s7.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    System.out.println(word1);

    Stream<String> s8 = Stream.of("w", "o", "l", "f");
    TreeSet<String> set = s8.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    System.out.println(set);

    Stream<String> s9 = Stream.of("w", "o", "l", "f");
    TreeSet<String> set1 = s9.collect(Collectors.toCollection(TreeSet::new));
    System.out.println(set1);

    Stream<String> s10 = Stream.of("w", "o", "l", "f");
    Set<String> set2 = s10.collect(Collectors.toSet());
    System.out.println(set2);

  }
}
