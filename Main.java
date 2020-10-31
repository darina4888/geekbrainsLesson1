package ru.lesson6;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobik");
        dog.run(400);
        dog.swim(15);

        Cat cat = new Cat("Myrzik");
        cat.run(150);
        cat.swim(13);

        Animal animal = new Animal("Тотошка",20);
        animal.run(15);
        animal.swim(15);

        System.out.println("Количество созданных котов, собак и ЖИВОТНЫХ " + Animal.count);
    }
}


