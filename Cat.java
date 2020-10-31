package ru.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name,200);
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
