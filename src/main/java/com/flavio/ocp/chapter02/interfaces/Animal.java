package com.flavio.ocp.chapter02.interfaces;

public class Animal {

  private String species;
  private boolean canHop;
  private boolean canSwin;

  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwin = swimmer;
  }

  public boolean canHop() { return canHop; }
  public boolean canSwin() { return canSwin; }

  @Override
  public String toString() {
    return species;
  }
}
