//this will contain a gameloop for the game


import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Gameloop {


    void gameLoop() {

        System.out.println("Welcome to Hangman");
        System.out.println("Please enter your name");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();



        //add words to wordlist
        WorldList worldList = new WorldList();


        //game starts
        System.out.println("The game starts now");
        System.out.println("You have 10 guesses");
        System.out.println("You have to guess the word");
        System.out.println("You can guess one letter at a time");


        //random word
        String randomWord = worldList.getRandomWord();
        System.out.println(randomWord);
        //create a new word
        Words word = new Words(randomWord);


        word.replaceWord();
        //print the word
        System.out.println(word.getWord());
        //guesses left
        int guessesLeft = 10;
        //list with guessed letters
        ArrayList<String> guessedLetters = new ArrayList<>();



    for (int i = 0; true; i++) {

        System.out.println("Guess a letter");
        String letter = input.nextLine();
        guessedLetters.add(letter);
        System.out.println(guessedLetters.get(i)); //print the guessed letters list


        System.out.println(guessedLetters);    //print the guessed letters list




        if (randomWord.contains(letter)) { //// if the player find a letter in the word
            System.out.println("You found a letter");
            word.replaceLetter(letter); //replace the letter in the word
            System.out.println(word.getWord()); //print the word

          if(WorldList.words.contains(letter)) { //if the player guess a letter that is in the wordlist
                System.out.println("You have already guessed this letter"); //print that the player has already guessed the letter
                break;
            }


            if (!word.getWord().contains("_")) { //if the player has found the word
                System.out.println("You have found the word");
                System.out.println("You won");
                break;
            }
        } else {
            System.out.println("You did not find a letter");
            guessesLeft--;
            System.out.println("You have " + guessesLeft + " guesses left");
            if (guessesLeft == 0) {
                System.out.println("You lost");
                break;
            }
        }
    }
}
}

