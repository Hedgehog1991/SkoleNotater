package Uke3;
import java.io.*;
import java.util.Scanner;

public class ReadtxtFile {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File fileObject = new File("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\name");
            Scanner input = new Scanner(fileObject);


            int x = 0;
            while(input.hasNextLine()){

                System.out.println(input.nextLine() + "   "+ x);
                x += 1;
            }
            input.close();  // used if refrencing external resourches
        }
        catch (FileNotFoundException e){
           e.printStackTrace();
        }
    }

/*String line = input.nextLine();
   if(line.contains("eeffee")){
   sout("det er på denne linjen")}

public class Terminal {
public static void Clear(){
sout('\u000c'); }
Terminal.clear(); // from a different class to clear


import java.time.localDate;
LocalDate date = LocalDate.now();
sout(date);

import java.time.LocalTime;
LocalTime time = LocalTime.now();
sout(time);

                            */


}
