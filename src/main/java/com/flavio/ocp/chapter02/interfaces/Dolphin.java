package com.flavio.ocp.chapter02.interfaces;

public class Dolphin implements LivesInOcean {

  @Override
  public void makeSound() {
    System.out.println("whistle");
  }
}
