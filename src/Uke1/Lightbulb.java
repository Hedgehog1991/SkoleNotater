package Uke1;

/*class is the item, data fields to describe the status it is in,
and methods to interact with this/these statuses */
public class Lightbulb {

    // field where class is described
    private boolean on = false; //class is a description

    //Field
    boolean emitsLight(){ //data to describe what we are doing
        return this.on;
    }
    //Constructor
    //Uke1.Lightbulb(){  //not really necessary if the field is set to true.
    //    this.emitsLight = false;
    // }
    //Methods
    void turnOn(){
        this.on = true; //methods to interact with the data
    }
    void turnOff(){
        this.on = false;
    }

    public static void main(String[]args){
        Lightbulb lightbulb1 = new Lightbulb(); //represented object
        Lightbulb lightbulb2 = new Lightbulb();

        lightbulb1.turnOn();
        lightbulb2.turnOff();

        if(lightbulb1.emitsLight()) {
            System.out.println("the light is on");
        }if (!lightbulb2.emitsLight()){ //if is not true (!= true) since turnOff this.on = false;
            System.out.println("the light is off");
        }
    }
}
