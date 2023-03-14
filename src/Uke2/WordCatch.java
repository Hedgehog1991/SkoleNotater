package Uke2;

import java.util.ArrayList;

public class WordCatch {
    //public void runWordCatch(){System.out.println();}

public static void main(String[] args) {
    //WordCatch wordcatch = new WordCatch();
    //wordcatch.runWordCatch();

    //Produce a overall list for the items sets are to reside.
    ArrayList<Word> words = new ArrayList<>();

    Word matpakke = new Word("mat"); //List title,
    matpakke.addSynonyms("ost");
    matpakke.addSynonyms("skinke");
    matpakke.addSynonyms("banan");
    matpakke.addSynonyms("eple");
    words.add(matpakke); //Adding the list matpakke to words

    Word dogtype = new Word("dogs");
    dogtype.addSynonyms("New Foundland");
    dogtype.addSynonyms("Corgie");
    dogtype.addSynonyms("German Shephard");
    dogtype.addSynonyms("Poodle");
    words.add(dogtype);


    /*Main gets an arraylist from the Class Word*/
    //Loops through the overarching list looking for added categories
    for(Word word : words){
        System.out.println(word.getSpise());
        //Loops through the datatype values stored inside each category
        for(String synonyms : word.getSynonyms()){
            System.out.println( " " + synonyms);
        }
    }

}}


