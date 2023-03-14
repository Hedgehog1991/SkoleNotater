package Example;

public class Methods {
    public static void main(String[] args) { // better way of doing stuff still need to figure out whats suppose to go where.
        // create an external method with parameters down there. then call the function with added parameters


        welcome();
        multiply(5,10); // ARGUMENTS
        multiply(10,55);
        multiply(3,8);

        int sub = hello(12,44);
        String shouting = caps("hello");

        System.out.println("here"+sub*2 + " " + shouting);

    }
    public static void welcome(){
        System.out.println("hello");
    }


    public static void multiply(int a, int b){//PARAMETERS
        System.out.println(a * b);
    }
    public static int hello(int a, int b){

        return a + b;
    }
public static String caps(String s){
        return s.toUpperCase();
}



}
