package com.flavio.ocp.chapter01.virtualmethodinvocation;

public class Bird extends Animal {

  @Override
  public void feed() {
    addSeed();
  }

  private void addSeed() { System.out.println("Bird::addSeed"); }

}
