package org.example;

abstract class Animal {
    private String name; // đóng gói

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { // đóng gói: chỉ truy cập qua getter
        return name;
    }

    public abstract void makeSound(); // trừu tượng

    public abstract void move();      // trừu tượng
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on four legs.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " gracefully walks.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies in the sky.");
    }
}
