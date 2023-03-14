package Uke4.Shapes;




public class OverLoadPlussPolymorphism{

           static class Poly{
                public void lol(){
                    System.out.println("lolol");
            }
        static class testPoly extends Poly{
                public void lol(){
                    System.out.println("trololol");
                }
        }


    //OVERLOAD
    public static void display(int a){
        System.out.println("int data: " + a);

    }
    public static void display(String a){
       System.out.println(" string data: " +a );
    }
    public static void display(String a, int b, double c ){

        System.out.println(" string data: " +a + (b*c) );
    }

static int multiply(int a, int b){
    return a * b;
}


    public static void main(String[] args) {
        display(12);
        display("wqedwe");
        display("131", 22, 2.2);
        display( "33", 59, 555);
        System.out.println(multiply(2,45));
        testPoly p = new testPoly();
        p.lol();


    }
}


}