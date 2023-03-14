package Uke3;

import java.io.*;
import java.util.Scanner;

public class NumbersAddedTogether {
    //int sum = 0;

    public static void main(String[] args)throws Exception {
       File file = new File("C:\\Users\\hedge\\Desktop\\OOP-Offline\\Skoleoppgaver\\src\\Uke3\\tall.txt");

        Scanner sc = new Scanner(file);


        //PRINT CONTENT OF FILE
        //while (sc.hasNextLine()){
          //  System.out.println(sc.nextLine());}
        //SUM CONTENT TOGETHER


            //while (sc.hasNextLine())
            //  System.out.println(sc.nextLine());
            int sum = 0;

            while (sc.hasNextInt()) {
                sum += sc.nextInt();
            }

            System.out.println(sum);
        }
    }
