package Uke3;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {

    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\newFile.txt"); //folder ending in file name
            file.write("this is the shits"); //if only given name it will produce another copy in the above folder  // check file.append
            file.close(); //close down here
            System.out.println("success");
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }




}
