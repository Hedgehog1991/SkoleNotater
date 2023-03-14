/*package Uke3;

import java.io.File;
import java.io.IOException;

public class MakeNewTxtF {


    public static void main(String[] args) {
        try {
            File fileObject = new File("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\newFile.txt"); //      ../ move one folder up
            if (fileObject.createNewFile()) {
                System.out.println("success");
                //makefile
            }else{
                    //allready exists
                System.out.println("fileExists");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /*

    try{
    for(int i = 1; i < 5; i ++){
    File fileObject = new File("fil_" + i + ".txt)} make 5 files
    }



 }
*/








