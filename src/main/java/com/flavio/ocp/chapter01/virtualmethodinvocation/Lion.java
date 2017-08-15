package com.flavio.ocp.chapter01.virtualmethodinvocation;

public class Lion extends Animal {

  String name = "Leo";

  @Override
  public void feed() {
    addMeat();
  }

  private void addMeat() { System.out.println("Lion::addMeat"); }

  public void play() { System.out.println("toss in meat"); }
}
