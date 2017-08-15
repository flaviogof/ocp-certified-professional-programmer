package com.flavio.ocp.chapter01.virtualmethodinvocation;

public class PlayWithAnimal {

  public static void main(String... args) {

    PlayWithAnimal playWithAnimal = new PlayWithAnimal();

    playWithAnimal.feedAnimal(new Lion());
    playWithAnimal.feedAnimal(new Bird());
    playWithAnimal.feedAnimal(new Cow());

    Animal animal = new Lion();
    animal.printName();
    animal.careFor();
  }

  public void feedAnimal(Animal animal) {
    animal.feed();
  }

}
