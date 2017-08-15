package com.flavio.ocp.chapter01.enums;

public class PlayWithSeason {

  public static void main(String[] args) {
    Season s = Season.SUMMER;

    System.out.println(Season.SUMMER);
    System.out.println(s == Season.SUMMER);

    for(Season season: Season.values()) {
      System.out.println(season.name() + " " + season.ordinal());
    }

    Season.FALL.printExpectedVisitors();

    Season.WINTER.printHours();

  }
}
