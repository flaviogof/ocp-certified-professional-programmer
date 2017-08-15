package com.flavio.ocp.chapter01.virtualmethodinvocation;

public class Cow extends Animal {

  @Override
  public void feed() {
    addHay();
  }

  private void addHay() { System.out.println("Cow::addHay"); }
}
