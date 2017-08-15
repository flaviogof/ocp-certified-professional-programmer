package com.flavio.ocp.chapter01.usinginstanceof;

public class TestInstanceOf {

  public static void main(String[] args) {
    HeavyAnimal hippo = new Hippo();
    boolean b1 = hippo instanceof Hippo;
    System.out.println("hippo instanceof Hippo: " + b1);
    boolean b2 = hippo instanceof HeavyAnimal;
    System.out.println("hippo instanceof HeavyAnimal: " + b2);
    boolean b3 = hippo instanceof Elephant;
    System.out.println("hippo instanceof Elephant: " + b3);
    boolean b4 = hippo instanceof Object;
    System.out.println("hippo instanceof Object: " + b4);

    Hippo nullHippo = null;
    boolean b5 = nullHippo instanceof Object;
    System.out.println("nullHippo instanceof Object: " + b5);

    Hippo anotherHippo = new Hippo();
    //boolean b6 = anotherHippo instanceof Elephant; // DOES NOT COMPILE


    boolean b7 = hippo instanceof Mother; // COMPILE FOR INTERFACES
    System.out.println("hippo instanceof Mother: " + b7);
  }
}
