package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    /**
     * Инициализация игрового поля
     */ 
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = EMPTY;
    }

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            //ход игрока
            playerTurn();
            printMap();
            if(isWin(CROSS)) {
                System.out.println("Выиграл игрок");
                break;
            } else if(!hasEmptyCells()) {
                System.out.println("Ничья");
                break;
            }

            //ход компа
            compTurn();
            printMap();
            if(isWin(ZERO)) {
                System.out.println("Выиграл компьютер");
                break;
            } else if(!hasEmptyCells()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    /**
     * Валидация ячеек
     * @param x
     * @param y
     * @return
     */
    public static boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            System.out.println("Координаты за пределами поля");
            return false;
        }

        if(map[x][y] != EMPTY) {
            System.out.println("Нельзя туда бить, там символ " + map[x][y]);
            return false;
        }
        return true;
    }

    /**
     * Ход игрока
     */
    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введи координаты через пробел. Например 1 2");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            x = Integer.parseInt((parts[0])) -1;
            y = Integer.parseInt((parts[1])) -1;
        } while(!isCellValid(x,y));

        map[x][y] = CROSS;
    }

    /**
     * Ход компа
     */
    public static void compTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            System.out.println("Координаты хода компьютера " + (x + 1) + " " + (y + 1));
        } while(!isCellValid(x,y));

        map[x][y] = ZERO;
    }

    /**
     * Проврка на пустые поля
     * @return
     */
    public static boolean hasEmptyCells() {
        System.out.println();
        for(int i = 0; i < SIZE; i++)
            for(int j = 0; j < SIZE; j++)
                if(map[i][j] == EMPTY)
                    return true;
        return false;
    }

    /**
     * Проверка победы
     * @param player
     * @return
     */
    public static boolean isWin(char player) {

        //строки
        int dots = 0;
        for(int x = 0; x < SIZE; x++) {
            dots = 0;
            for(int y = 0; y < SIZE; y++) {
                if(map[x][y] == player) dots++;
                if(dots == DOTS_TO_WIN) return true;
            }
        }

        //столбцы
        for(int y = 0; y < SIZE; y++) {
            dots = 0;
            for(int x = 0; x < SIZE; x++) {
                if(map[x][y] == player) dots++;
                if(dots == DOTS_TO_WIN) return true;
            }
        }


        //диагонали
        dots = 0;
        for(int x = 0; x < DOTS_TO_WIN; x++) {
            if(map[x][x] == player) dots++;
            if(dots == DOTS_TO_WIN) return true;
        }

        dots = 0;
        for(int x = 0; x < SIZE; x++) {
            if(map[x][SIZE - x - 1] == player) dots++;
            if(dots == DOTS_TO_WIN) return true;
        }
        return false;
    }

    /**
     * Вывод игрового поля в консоль
     */
    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j]);

            System.out.println();
        }
    }
}
