package AprosjektOppgave.Oppgave1;

import java.util.HashMap;
import java.util.Scanner;

public class SelectionTerminal {

    public static void main(String[] args) {

        select();

    }
    public static int select() {
        String userInput;
        String userPin;

        Scanner scr = new Scanner(System.in);
        HashMap<String, String> userName = new HashMap<>();
        userName.put("Fish", "5555");
        userName.put("Cow", "1111");

        HashMap<String, Integer> accountBalance = new HashMap<>();
        accountBalance.put("5555", 3000);
        accountBalance.put("1111", 50);

        // userName.containsKey("Fish"); // boolean

        userInput = getUserInfo(scr, userName);
        userPin = userName.get(userInput);

        boolean validLogin = getUserPin(scr, userPin);


        int inputNum = 0;


        do {
            System.out.println("--Bank--\n Type 1: to show balance\n Type 2: To deposit\n Type 3: to withdraw\n Type 4: Transfer\n Type 5: Exit\n ");

            inputNum = scr.nextInt();
            switch (inputNum) {
                case 1 -> System.out.println(accountBalance.get(userPin));


                case 2 -> {
                    System.out.println("Add amount to deposit: ");
                    balanceValue = scr.nextInt();
                    accountBalance.computeIfPresent(userPin, (k, v) -> v + balanceValue);
                    System.out.println("new balance after deposit: " + accountBalance.get(userPin));
                }
                case 3 -> {
                    System.out.println("how much would you like to withdraw?");
                    balanceValue = scr.nextInt();
                    accountBalance.computeIfPresent(userPin, (k, v) -> v - balanceValue);
                    System.out.println("new balance after withdrawal: " + accountBalance.get(userPin));
                }
                case 4 -> {
                    System.out.println("How much would you like to transfer");
                    balanceValue = scr.nextInt();

                }

                   case 5 -> {
                       System.out.println("logged out\n------------");
                       userInput = getUserInfo(scr, userName);
                       userPin = userName.get(userInput);
                       validLogin = getUserPin(scr, userPin);
                    }
            }

        } while (validLogin);
            return select();
    }
    static int balanceValue;


    private static String getUserInfo(Scanner scr, HashMap<String, String> userName) {
        System.out.println("Enter Username");
        String userInput;
        do{
           userInput =  scr.nextLine();
        } while(!userName.containsKey(userInput));
        return userInput;
    }

    private static boolean getUserPin(Scanner scr, String pinCode) {
        String userInput;
        int numberOfTries = 0;

        while(numberOfTries < 3){
            System.out.println("enter pincode");
            userInput = scr.nextLine();
            if (userInput.equals(pinCode)){
                return true;
            }
            //numberOfTries++;
        }
        return  false;
    }
}
