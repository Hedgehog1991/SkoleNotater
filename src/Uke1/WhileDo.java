package Uke1;
import java.util.ArrayList;
import java.util.Scanner;

//https://www.youtube.com/watch?v=SGJ9DpxGCkY&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=13

public class WhileDo {
    public static void main(String[] args) {

        String sentence = "flapjacks are great!";
        Scanner scan = new Scanner(sentence);

        ArrayList<String> words = new ArrayList<>();

        while(scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);
    }}

/*Use a while loop in a scanner to look through the string sentence and run until all the words are counted
* then save it into the datastructure of the array in the new arraylist called words*/








        /*
        int a = 0;
        do {
            System.out.println("1" + 1);
        }while(true);
    }

// do while is a while loop that first run something, then check if its true. it will run as long as
// the while is true or correspond info is true. similar to return. */



     /*   for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);}

        int a = 0;
        while(a < 10){
            System.out.println("hello" + a);
            a++;}
    }*/


    //while(true){} will not stop





