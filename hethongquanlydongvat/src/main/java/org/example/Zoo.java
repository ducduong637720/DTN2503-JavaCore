package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    public void showAllAnimals() {
        System.out.println("\n--- Animal Sounds and Movements ---");
        for (Animal animal : animals) {
            animal.makeSound(); // đa hình
            animal.move();      // đa hình
            System.out.println();
        }
    }

    public void showAnimalStatistics() {
        HashMap<String, Integer> stats = new HashMap<>();

        for (Animal animal : animals) {
            String type = animal.getClass().getSimpleName();
            stats.put(type, stats.getOrDefault(type, 0) + 1);
        }

        System.out.println("\n--- Animal Statistics ---");
        for (String type : stats.keySet()) {
            System.out.println(type + ": " + stats.get(type));
        }
    }
}
