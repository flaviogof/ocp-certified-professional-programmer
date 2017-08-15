package com.flavio.ocp.chapter01.enums;

public enum Season {
  WINTER("Low") {
    public void printHours() { System.out.println("short hours"); }
  }, SPRING("Medium"), SUMMER("High") {
    public void printHours() { System.out.println("long hours"); }
  }, FALL("Medium");

  private String expectedVisitors;

  private Season(String expectedVisitors) {
    this.expectedVisitors = expectedVisitors;
  }

  public void printExpectedVisitors() {
    System.out.println(expectedVisitors);
  }

  public void printHours() {
    System.out.println("default hours");
  }

}
