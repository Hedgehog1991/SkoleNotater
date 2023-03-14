package mikeDaneTutorial;

import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String q1 ="What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
        String q2 ="What color are bananas?\n" + "(a)red/green\n(b)Yellow\n(c)Blue\n";

        Question [] questions = { //Array of questions, with the q1 and q2 prompt
                new Question(q1, "a"), new Question(q2, "b" )
        };
        takeTest(questions);
    }
    //A method that takes in the parameter array of the above array.
    public static void takeTest(Question [] questions){
    int score = 0;
    Scanner keyboardInput = new Scanner(System.in);

    for(int i = 0; i < questions.length; i++){
        System.out.println(questions[i].prompt);
        String answer = keyboardInput.nextLine(); //Store the user answer in this variable;
        if(answer.equals(questions[i].answer)){ //See if the string userinput is the same
                 score++;                               //as the answer stored in the question array.
        }if(!answer.equals(questions[i].answer)) {
            takeTest(questions);
            return;
        }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }


}
