package Example.ArrayListScanner;
import java.util.Scanner;

public class TerminalPassword {
    public static void main(String[] args){

        String correctPassword = "abs123";

        //Scanner lets you input stuff
        Scanner input = new Scanner(System.in);

        System.out.println("Input your password: ");

        String password = input.nextLine();

    if(password.equals(correctPassword)) {
        System.out.println("ok");
    }else{
        System.out.println("Password is not correct");
    }


    }
}
