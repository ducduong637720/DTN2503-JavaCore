package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Dog("Buddy"));
        zoo.addAnimal(new Cat("Whiskers"));
        zoo.addAnimal(new Bird("Tweety"));
        zoo.addAnimal(new Dog("Rex"));

        zoo.showAllAnimals();
        zoo.showAnimalStatistics();
        ;
    }
}