//Egenskaper: Ett ord
//Hanterar ordet vi gissar på
//Metoder:
//getOrd(): returnerar ordet
//matchaBokstav(): kollar om en given bokstav matchar någon i ordet
//ersättBokstav(): ersätter en bokstav i ordet med en annan



public class Words {

    private String word; // The word that is being guessed. (The word that is being replaced with underscores.)

    public Words(String randomWord) {
        this.word = randomWord;
    }


    public String getWord() {
        return word;
    }

    public void replaceWord() {
        word = word.replaceAll("[a-zA-Z]", "_");
    }

    public void replaceLetter(String letter, String randomWord) {
        int index = randomWord.indexOf(letter); // Find letter in index.
        while (index >= 0) { // While there is a letter in the word.
            word = word.substring(0, index) + letter + word.substring(index + 1); // Replace the letter in the word.
            index = randomWord.indexOf(letter, index + 1); // Find the next letter in the word.
        }
    }
}












