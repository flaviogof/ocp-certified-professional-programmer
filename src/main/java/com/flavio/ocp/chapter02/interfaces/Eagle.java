package com.flavio.ocp.chapter02.interfaces;

public class Eagle implements Fly {

  @Override
  public int getWingSpan() {
    return 15;
  }

  @Override
  public void land() {
    System.out.println("Eagle is diving fast");
  }
}
