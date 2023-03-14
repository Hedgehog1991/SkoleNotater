package Uke3;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AskQuestionsAndSaveAnswers {


    public static void main(String[] args) {
      ArrayList<String> questions= new ArrayList<>();

      questions.add("\nWhat color is the ocean?");
      questions.add("\nHow many legs does a dog have?");
      questions.add("\nWhat is 5 + 9 ?");
      questions.add("\nIs java hard ?");

     ArrayList<String> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("spørsmål og svar");

        for(String question : questions){
            System.out.println("--Question" + question);
            System.out.println("Answer");
            answers.add(input.nextLine());

            System.out.println("\n");
        }

        try{
            FileWriter file = new FileWriter("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\answer.txt");
            for(int i = 0; i < questions.size(); i ++){
                file.write("Title of the file" +questions.get(i) + "\n");
                file.write("Asnwer: " + answers.get(i) + "\n");
                file.write("---\n");
            }
            file.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }



}
