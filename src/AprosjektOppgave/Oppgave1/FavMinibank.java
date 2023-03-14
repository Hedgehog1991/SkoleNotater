package AprosjektOppgave.Oppgave1;

import java.util.HashMap;
import java.util.Scanner;


public class FavMinibank extends Terminal {

    private static String userInput;
    private static String userSearch;
    private static boolean exit = true;
    private static int dataInput;
    private static int balanceValue;

    public void miniBank() {
    Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> bankUser = new HashMap<>();
        bankUser.put("dolphin", 111);
        bankUser.put("whale", 222);
        bankUser.put("chicken", 333);
        bankUser.put("cow", 444);
        bankUser.put("lizard", 555);

        userInput = getUserInfo(sc, bankUser);
    do {
    System.out.println("\u001B[33m-------YfavMiniBank--------\n  Type 1: to show balance \n Type 2: To deposit\n Type 3: to withdraw\n Type 4: Transfer\n Type 5: Exit\n");
    dataInput = sc.nextInt();

    switch (dataInput) {

        case 1 -> System.out.println("---" + userInput + "---" + " Current balance is " + bankUser.get(userInput));
        case 2 -> {

            System.out.println("Deposit: ");
            balanceValue = sc.nextInt();
            bankUser.computeIfPresent(userInput, (k, v) -> v + balanceValue);
            System.out.println("New Balance " + bankUser.get(userInput));
        }
        case 3 -> {
            System.out.println("Current balance " + bankUser.get(userInput) + "\n Withdraw");
            balanceValue = sc.nextInt();

            if (bankUser.get(userInput) <= balanceValue) {
                System.out.println("   ---" + userInput + "---" + "\nBalance to low");
            }else{
                bankUser.computeIfPresent(userInput, (k, v) -> v - balanceValue);
                System.out.println(userInput + "---New Balance " + bankUser.get(userInput));
            }

        }
//IF statement
        case 4 -> {
            System.out.println("search for other user");

            userSearch = sc.next();
            if (!bankUser.containsKey(userSearch)) {
                System.out.println("Error no user found!");
            }else{
                System.out.println("user  " + "---" + userSearch + "---" + " Found!\nChoose amount to transfer ");
                balanceValue = sc.nextInt();

                if (bankUser.get(userInput) <= balanceValue) {
                    System.out.println("Balance to low");
                }else{
                    bankUser.computeIfPresent(userSearch, (k, v) -> v + balanceValue);
                    System.out.println("---" + userInput + "---" + " Transferred " + balanceValue + " from " + " to " + userSearch);

                    bankUser.computeIfPresent(userInput, (k, v) -> v - balanceValue);
                    System.out.println("---" + userInput + "---" + "Balance after transfer: " + bankUser.get(userInput) + "\n");
                }
            }
        }
        case 5 -> {
            System.out.println("Logged out\n\n----------");
            userInput = getUserInfo(sc, bankUser);
        }
    }
    } while (exit);
}



    private static String getUserInfo(Scanner sc, HashMap<String, Integer> bankUser){

        System.out.println("Enter Password");

        String userInput;
        do{
            userInput = sc.nextLine();
        }while (!bankUser.containsKey(userInput));
        return userInput;
    }

}
