package Uke3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Composer {

    String name;
    int birthYear;

    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public Composer(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public static void main(String[] args) throws FileNotFoundException{
        //String filePath = "C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\composers.txt";

        ArrayList<Composer> composers = new ArrayList<>();

        try{
        File fileObject = new File("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\composers.txt");
        Scanner input = new Scanner(fileObject);

        while(input.hasNextLine()){ //hasNext & hasNextLine are booleans has = boolean
                String name = input.nextLine();
                int birthYear = input.nextInt();
            Composer composerList = new Composer(name, birthYear);

            composers.add(composerList);

            input.nextLine();
            input.nextLine();


                for(Composer comps : composers) {
                    if(!input.hasNextLine()) {
                        System.out.printf(" - %s (%d)%n", comps.getName(), comps.getBirthYear());
                    }

            }
        }
        input.close();  // used if refrencing external resourches

    }

     catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
