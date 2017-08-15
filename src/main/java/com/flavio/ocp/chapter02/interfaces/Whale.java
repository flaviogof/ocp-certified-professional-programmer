package com.flavio.ocp.chapter02.interfaces;

public class Whale implements LivesInOcean {

  @Override
  public void makeSound() {
    System.out.println("sing");
  }
}
