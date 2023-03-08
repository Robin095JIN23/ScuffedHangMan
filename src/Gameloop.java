//this will contain a gameloop for the game


import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Gameloop {


    void gameLoop() {

        System.out.println("Welcome to Hangman");
        System.out.println("Please enter your name");

        Scanner input = new Scanner(System.in); //create a new scanner
        String name = input.nextLine(); //get the name from the user


        WorldList worldList = new WorldList(); //create a new instance of the worldlist class


        //game starts
        System.out.println("The game starts now");
        System.out.println("You have 10 guesses");
        System.out.println("You have to guess the word");
        System.out.println("You can guess one letter at a time");


        String randomWord = worldList.getRandomWord(); //get a random word from the list

        Words word = new Words(randomWord);//create a new instance of the word class


        word.replaceWord();//print the word

        System.out.println(word.getWord()); //print the word
        int guessesLeft = 7; //guesses allowed




        ArrayList<String> guessedLetters = new ArrayList<>();    //list with guessed letters



    for(int i = 0; i < 7; i++) {      //loop for the game
        System.out.println("Guess a letter");
        String letter = input.nextLine();

        if (randomWord.contains(letter)) {  //check if the letter is in the word

            word.replaceLetter(letter, randomWord);  //replace the letter in the word

            System.out.println(word.getWord()); //get the word and print it

            guessedLetters.add(letter); //add the letter to the list

            sort(guessedLetters);//sort the list

            System.out.println(guessedLetters); //print the list

            //else guess is already in the list
            if (guessedLetters.contains(letter)) {
                System.out.println("You already guessed that letter");
            }

            if (word.getWord().equals(randomWord)) { //check if the word is guessed
                System.out.println("You guessed the word");
                System.out.println("You won");
                System.out.println("You had " + guessesLeft + " guesses left");
                System.out.println(name+" you guessed the following letters: " + guessedLetters);
                break;
            }
        } else {

            System.out.println("The letter is not in the word");//if the letter is not in the word

            guessedLetters.add(letter);//add the letter to the list

            sort(guessedLetters); //sort the list
            //print the list
            System.out.println(guessedLetters); //print the list
            guessesLeft--;  //subtract one guess
            System.out.println("You have " + guessesLeft + " guesses left");  //print the guesses left

            if (guessesLeft == 0) {  //check if the guesses are 0
                System.out.println("You lost");
                System.out.println("You guessed the following letters: " + guessedLetters);
                break;
            }
        }
    }
    }
}
