package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static final Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
       String[] words = {"apple", "orange", "lemon", "banana",
                            "apricot", "avocado", "broccoli",
                            "carrot", "cherry", "garlic", "grape",
                            "melon", "leak", "kiwi", "mango",
                            "mushroom", "nut", "olive", "pea",
                            "peanut", "pear", "pepper",
                            "pineapple", "pumpkin", "potato"};

        Random random = new Random();

        int pos = random.nextInt(words.length);
        String word = words[pos];
       
        char char_ = '#';
        char uChar = '#';

        while(true) {
            System.out.println("Введите слово : ");
            String userWord = scanner.nextLine().toLowerCase();

            if(userWord.equals(word)) {
                System.out.println("You win");
                break;
            } else {

               for(int i = 0; i < 15; i++) {

                    if(i < word.length())
                        char_ = word.charAt(i);
                    if(i < userWord.length())
                        uChar = userWord.charAt(i);

                    char_ = (char_ == uChar) ? char_ : '#';
                    System.out.print(char_);
                    char_ = '#';
                }
            }
            System.out.println();
        }
    }
}
