package mikeDaneTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {

        int myNum = cube(4);
        System.out.println(myNum);

        sayHi("Kristian ", 31);


        String [] friends = new String[3];
        Scanner userInput = new Scanner(System.in);

        System.out.println("Write name of a friend");
        friends[0] = userInput.nextLine();
        System.out.println("First friend: "+ friends[0]);

        System.out.println("Write name of another friend");
        friends[1] = userInput.nextLine();
        System.out.println("Second friend: "+ friends[1]);

        System.out.println("Write name of a last friend");
        friends[2] = userInput.nextLine();
        System.out.println("Third friend: "+ friends[2]);



        System.out.println("Your friends are :"+Arrays.toString(Arrays.stream(friends).toArray()));

        //HOW TO ADD USER INPUT TO AN ARRAY :D

    }
    public static void sayHi(String name, int age) {
        System.out.println("hello " + name + "is " + age);
    }
    public static int cube(int numberToCube){
        return (numberToCube * numberToCube * numberToCube);
    }

}
