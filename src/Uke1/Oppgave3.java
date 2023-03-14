package Uke1;

public class Oppgave3 {


    public int addThreeNumbers(int i, int j, int k){ //These variables are available as parameters
        return i + j + k;
    }
    public static void main(String[] args){
        Oppgave3 task = new Oppgave3();

        if (task.addThreeNumbers(1,2,3) == 6){ //call method addthreenumbers, (arguments)
            System.out.println("det funker!");
        }else{
            System.out.println("funker ikke!");
        }
    }//FUCK YEAH!

}
