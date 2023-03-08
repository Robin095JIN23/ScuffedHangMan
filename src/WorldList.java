//Ordlista-klassen:
//Egenskaper: En lista med ord
//Metoder:
//slumpOrd(): väljer ett slumpmässigt ord från listan
//läggTillOrd(): lägger till ett ord till listan
//taBortOrd(): tar bort ett ord från listan

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class WorldList {
    static ArrayList<String> words;

    public static boolean contains(String letter) {
        return false;

    }


    public String getRandomWord() {
          Random random = new Random();
            int randomIndex = random.nextInt(words.size());
            return words.get(randomIndex);


    }





    //Konstruktor
    public WorldList() {
        words = new ArrayList<>();
        //add words to the list
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("programmering");
        words.add("spel");
        words.add("dator");
        words.add("skola");
        words.add("bok");
        words.add("bord");
        words.add("stol");
        words.add("skrivbord");
        words.add("skrivare");
        words.add("datorspel");
        words.add("bokstäver");
        words.add("bokstav");




    }
}

