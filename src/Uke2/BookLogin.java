package Uke2;

import java.util.Scanner;

public class BookLogin {
    public static void main(String[] args) {

/* //CAN RUN PROGRAMS OUT OF A SWITCH STATEMENT BASED ON THE INPUT VALUE. Nest switch inside a while loop with a boolean. or use do{}while
      int i = 5;
      switch(i){
          case 0: test();
          break;
          case 1: test();
          break;
          case 2: test();
          break;
          case 3: test();
          break;
      }*/
test();
    }
        public static void test(){
        Scanner sr = new Scanner(System.in);
            String username = "k";
            String input;
            String password = "1";
            String inputPw;
            System.out.println("enter username");
            input=sr.nextLine();

            System.out.println("enter password");
            inputPw=sr.nextLine();

            if(input.equals(username) && (inputPw.equals(password))){
                System.out.println("--success--");
                Uke2.Book.main();
            }
            else if(!input.equals(username) && (!inputPw.equals(password))){
                System.out.println("--error--\n try again \n");
                test();

            }


    }
}
