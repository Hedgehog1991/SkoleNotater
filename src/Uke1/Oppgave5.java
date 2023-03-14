package Uke1;

public class Oppgave5 {
    public String printNameAndReturnName(String name){ //Må bytte ut void med string = public string blablabla
        // public void means that NOTHING WILL BE RETURNED
        System.out.println("jeg heter: " + name); // String concatenation
// name in this case can be anything since its just a hotel key. its missleading because what we ACTUALLY return is just the string
        return name; // ikke name + name
    }

    public static void main(String[] args){
        Oppgave5 task = new Oppgave5();

        String yourName = "Kristian";

        if(task.printNameAndReturnName(yourName).equals(yourName)){ //.equals is connected by string but its only asking if yourName is equal to itself (WTF)
            System.out.println("funker det!");
        }else{
            System.out.println("funker ikke !");
        }
    } // If the main method calls the object it activates the hardcoded string and the value of YourName is equal itself it runs as true.
}
