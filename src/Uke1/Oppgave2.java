package Uke1;

public class Oppgave2 {

    public boolean isInputLargerThan64(int number){
        if (number > 64){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Oppgave2 task = new Oppgave2();

        int value = 65;

        if(task.isInputLargerThan64(value)){
            System.out.println(value + " er større enn 64!");
        }else{
            System.out.println(value + "er ikke større enn 64!");
        }
    }





}
