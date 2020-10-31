package ru.geekbrains;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        int[] arr1 = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString( swapArrEls(arr1)));

        System.out.println(Arrays.toString( fillArr()));

        int[] arr2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(updateArrItems(arr2)));

        twoDimensionalArr();

        getExtremeVal();

        int[] arr3 = {5,6,2,7,4,1,9,3,4,5,4};
        System.out.println(checkBalance(arr3));

        int[] arr4 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(shiftArr(arr4,-3)));
    }

    /*
    * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    *       С помощью цикла и условия заменить 0 на 1, 1 на 0;
    * */
    public static int[] swapArrEls(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        return arr;
    }

    /*
    *  Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    * */
    public static int[] fillArr() {
        int[] arr = new int[8];
        int y = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = y;
            y+=3;
        }
        return arr;
    }

    /*
    * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * */
    public static int[] updateArrItems(int[] arr) {
        for(int i = 0; i < arr.length; i++)
           if(arr[i] < 6) arr[i] *= 2;

        return arr;
    }

    /*
    *  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    *        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    * */
    public static void twoDimensionalArr() {
        int[][]arr = {
                {4,7,90,56},
                {5,7,8,76},
                {56,32,17,34},
                {56,32,17,89}
        };
        //диагональ слева направо
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                if(i == j) arr[i][j] = 1;

        int len = arr.length-1;
        //диагональ справа налево
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                if(j == len-i) arr[i][j] = 1;

        for(int el[] : arr) System.out.println(Arrays.toString(el));
    }

    /*
    * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    * */
    public static void getExtremeVal()
    {
        int[] arr = {5,8,34,0,87,-10};

        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println(min+" "+max);
    }

    /*
    * Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    *       если в массиве есть место, в котором сумма левой и правой части массива равны.
    *       Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    *           граница показана символами ||, эти символы в массив не входят.
    * */

    public static boolean checkBalance(int[] arr) {
        int sumR = 0;
        int sumL = 0;
        int sumTotal = 0;

        for (int i = 0; i < arr.length; i++)
            sumTotal += arr[i];

        for (int i = 1; i < arr.length-1; i++){
            sumL += arr[i-1];
            sumR = sumTotal - sumL;

            if (sumR == sumL)
                return true;
        }
        return false;
    }

    /*
    * Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    *   при этом метод должен сместить все элементы массива на n позиций.
    *   Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    * */
    public static int[] shiftArr(int[] arr, int n) {
        int len = arr.length;

        if(n < 0)  n = len + n;
        else  n = len - n;

        int limit = getLimit(len, n);

        for(int i = 0; i < limit; i++) {
            int temp = arr[i];
            for(int j = i - n + len; j != i; j = (j - n + len) % len)
                arr[(j + n) % len] = arr[j];
            arr[i + n] = temp;
        }
        return arr;
    }

    public static int getLimit(int x, int y) {
        while(y != 0) {
            int z = x;
            x = y;
            y = z % x;
        }
        return x;
    }


}
