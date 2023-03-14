package Uke1;

public class Oppgave4 {
    public boolean isColorInNorwegianFlag(String color){ //parameter string color
        switch(color){ //parameter name can be whatever! but should be related, acts like a hotel room key.
            case "red":
                return true;

            case "blue":
                return true;

            case "white":
                return true;
        }//You dont need break if using return cause that finishes the case regardless
        return false;
    }

    //BETTER VERSION
     /* return switch (color) {
        case "red" -> true;
        case "blue" -> true;
        case "white" -> true;
        default ->
                false; */

    public static void main(String[] args){
        Oppgave4 task = new Oppgave4();

        if(task.isColorInNorwegianFlag("red") &&
                task.isColorInNorwegianFlag("blue") &&
                    task.isColorInNorwegianFlag("white")){
            System.out.println("red white and blue in the flag yes");
        }else{
            System.out.println("ikke riktig");
        }
    }

}
