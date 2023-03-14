package Example.GenericEx;


public class Printer <T>{

    T thingToPrint;

    public Printer(T thingsToprint){

        this.thingToPrint = thingsToprint;
    }

    public void print(){

        System.out.println(thingToPrint);
    }

}


