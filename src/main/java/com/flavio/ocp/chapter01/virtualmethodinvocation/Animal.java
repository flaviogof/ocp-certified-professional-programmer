package com.flavio.ocp.chapter01.virtualmethodinvocation;

abstract class Animal {
  String name = "???";

  public abstract void feed();

  public void printName() {
    System.out.println(name);
  }

  public void careFor() {
    play();
  }

  public void play() {
    System.out.println("pet animal");
  }
}
