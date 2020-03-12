package Hangman;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"Bruh", "Guacamole", "Jouch", "Fortnite", "Beans", "Smoothbrain", "Chair"};
        Scanner input = new Scanner(System.in);
        int randomInt;
        randomInt = ((int)(Math.random() * words.length));
        String randomWord = words[randomInt];
        Path WhoWon = Paths.get("C:\\Users\\og153182\\Desktop\\Java\\Hangman\\src\\Hangman\\WhoWon.txt");

        for(int i = 0; i < randomWord.length(); ++i) {
            System.out.println("");
            System.out.print("_ ");
        }
    }
}
