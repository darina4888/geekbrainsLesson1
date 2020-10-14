package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        variables();

        System.out.println(sum(2.6F,5F,6,3));

        System.out.println(bool(6,7));

        isPositiveNum(-5);

        isNegativeNum(-8);

        printGreeting("Андрей");

        isLeapYear(1900);
    }

    /*
    * переменные всех пройденных типов данных, и инициализировать их значения
    * */
    public static void variables() {
        byte byte_ = 5;
        short short_ = 12422;
        int b = 1000000;
        long long_ = 2000000L;
        float float_ = 12.3F;
        double double_= 123.123;
        char char_ = '$';
        boolean boolean_ = short_ > byte_;
    }

    /*
    * Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    *                   где a, b, c, d – входные параметры этого метода
    * */
    public static float sum(float a,float b,int c,int d) {
        return  a * (b + (c / d));
    }

    /*
    * Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    *   если да – вернуть true, в противном случае – false
    * */
    public static boolean bool(int a,int b) {
        int result = a + b;

        if(result >= 10 && result <= 20) return true;
        return false;
    }

    /*
    * Написать метод, которому в качестве параметра передается целое число,
    *       метод должен напечатать в консоль положительное ли число передали,
    *           или отрицательное; Замечание: ноль считаем положительным числом.
    * */
    public static void isPositiveNum(int num) {
        String msg = "";
        if(num >= 0)  msg = num + " является положительным числом";
        else msg = num + " является отрицательным числом";

        System.out.println(msg);
    }

    /*
    * Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    * */
    public static boolean isNegativeNum(int num) {
        if(num < 0)  return true;
        return false;
    }

    /*
    * Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    * */
    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    *  Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    *       Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    * */
    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))  System.out.println(year + " високосный год");
        else System.out.println(year + " не високосный год");
    }
}
