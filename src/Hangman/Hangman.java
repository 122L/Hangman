package Hangman;

import java.nio.file.Path;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"Bruh", "Guacamole", "Jouch", "Fortnite", "Beans", ""};
        Scanner input = new Scanner(System.in);
        int randomInt;
        randomInt = ((int)(Math.random() * 100) % 7);
        String randomWord = words[randomInt];
        System.out.println(randomWord);
        Path WhoWon = 

    }
}
