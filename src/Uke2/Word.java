package Uke2;
import java.util.ArrayList;
public class Word {
    //Fields
    private String spise;
    private ArrayList<String> synonyms;

    //Constructor
    public  Word(String value) {
        this.spise = value;  //Only connects to the String title value of new list category.
        this.synonyms = new ArrayList<>();
    }
    //Methods
    public String getSpise() {
        return this.spise;
    }
    public ArrayList<String> getSynonyms(){
        return this.synonyms;
    }
   public void addSynonyms(String word){
       this.synonyms.add(word);
   }
  }



