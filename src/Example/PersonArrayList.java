package Example;
import java.util.ArrayList;

public class PersonArrayList {



    public static void main(String[] args){

    String student = "Riza";

    ArrayList<String> courses = new ArrayList<>();

    courses.add("OOP"); //.add() is a method to add stuff to list
    courses.add("Informationsecurity");
    courses.add("Visual Analytics");

       // System.out.println(courses.get(0)); //get needs an int

    for (int i = 0; i < courses.size(); i ++){ //.size returns the number of objects.
        System.out.println(courses.get(i)); //only courses prints a string with comma .toString() .get(i) makes a drop list.
    }
    //This is the way
    for (String course : courses){
        System.out.println(course);
    }
    /*
    int x = 0;
    while (x < courses.size()){
    sout(courses.get(i));
    x++
    }
    int y  = 3;
    while(true){
    if (y > 100){
        break;
        }
    }
    */
    }
}
