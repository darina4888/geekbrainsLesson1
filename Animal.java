package ru.lesson6;

public class Animal {
    /**
     * Кличка животного
     */
    protected String name;
    /**
     * Ограничение на бег
     */
    public int maxRun;
    /**
     * Общее количество созданных объектов класса Animal и его наследников
     */
    public static int count = 0;

    public Animal(String name, int maxRun) {
        this.name = name;
        this.maxRun = maxRun;
        count++;
    }

    /**
     * Бег
     * @param length
     */
    public void run(int length) {
        if(length <= maxRun)
            System.out.println(this.name + " пробежал " + length + " м");
        else
            System.out.println("Максимальное расстояние для бега " + maxRun);
    }

    /**
     * Плаванье
     * @param length
     */
    public void swim(int length) {
        System.out.println(this.name + " проплыл " + length + " м");
    };
}
