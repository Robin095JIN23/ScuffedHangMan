//Egenskaper: Ett ord
//Hanterar ordet vi gissar på
//Metoder:
//getOrd(): returnerar ordet
//matchaBokstav(): kollar om en given bokstav matchar någon i ordet
//ersättBokstav(): ersätter en bokstav i ordet med en annan


public class Words {
    //Egenskaper: Ett ord
    private String word;

    public Words(String randomWord) {
        this.word = randomWord;
    }


    public String getWord() {
        return word;
    }

    public void replaceWord() {
        word = word.replaceAll("[a-zA-Z]", "_");
    }


    public void replaceLetter(String letter) {
        word = word.replaceFirst("_", String.valueOf(letter));
    }
}






