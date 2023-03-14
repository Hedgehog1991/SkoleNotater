package Uke1;

public class Oppgave1 {

     String returnNameOfCourse(){ // non-primitive datatype string value
        return "OOP";
    }
    public static void main(String[] args){
        Oppgave1 task = new Oppgave1(); //creates new instance of class inside method

        if (task.returnNameOfCourse().equals("OOP")){ //if object value is = to if statement -> println.
            System.out.println("It does what its suppose to!");
        }else{
            System.out.println("Doesn't work");
        }
    }
}
