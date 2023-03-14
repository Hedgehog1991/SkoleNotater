package Uke3;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractiveTerminal {
    public static void main(String[] args) {
        ArrayList<String>menyOpinions = new ArrayList<>();

        menyOpinions.add("stuff1");
        menyOpinions.add("stuff3");
        menyOpinions.add("stuff2");


        for (int i = 0; i < menyOpinions.size(); i++) {
            System.out.println((i+1)+" . "+menyOpinions.get(i));
        }
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

       if(answer.equals(menyOpinions.get(0))){
           System.out.println("picked: stuff1");
       }if(answer.equals(menyOpinions.get(1))){
            System.out.println("pickedstuff2");
        }if(answer.equals(menyOpinions.get(3))){
            System.out.println("pickedstuff3");
        }else{
            System.out.println("funker ikke");
        }
    }
}
