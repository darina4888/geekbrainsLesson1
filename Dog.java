package ru.lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name,500);
    }

    @Override
    public void swim(int length) {
        if(length <= 10)
            System.out.println(this.name + " проплыл " + length + " м");
        else
            System.out.println("Максимальное расстояние для плаванья у собак 10");
    }
}
