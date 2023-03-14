package Uke1;

public class Wallet {

//Fields
private int coins;
//All classes is a default constructor and the only thing it does is generating an object and send it forward, can contain parameters
//Constructor // Setting the default value of all the object we generate
Wallet(int initialCoins){
   this.coins = initialCoins;
}
//Method
void printCoins(){

    System.out.println("You have " + this.coins + " coins.");
}
void printCoins(int extra){ // based on the parameter where extra value is declared when instance is called

    System.out.println("you have " + (this.coins+ extra) + " extra");
}

//Static class owned method, stores the value in itself and not in the generated instance of the class.
//WHEN YOU DECLARE SOMETHING STATIC IT BELONGS/OWNED BY THE CLASS NOT THE GENERATED INSTANCE

    //Getter Setter
    public int getCoins(){
    return this.coins;
    }
    private void setCoins(int value){
    this.coins = value;

    }

public static boolean isDigitalYet(){
    return true;
}

//main-Method
public static void main(String[] args){
    Wallet wallet1 = new Wallet(10); // INSTANCING
    Wallet wallet2 = new Wallet(2);

    wallet1.printCoins(10); //This is refering to the object instance of the class // if value is added it calls extra
    wallet2.printCoins();
    //Static methods are available without instancing it because its stored value is "static"
    System.out.println(!Wallet.isDigitalYet()); // Uke1.Wallet in this case is referencing the static method belonging to the class.
    System.out.println(wallet1.getCoins());

    String text = new String("hello"); //lol
    System.out.println(text);
}

}
