package Example;
//It is only this class (MyWallet) and the instances of this class (= new MyWallet()) that has access to a private field.
public class MyWallet {

//Fields
private int coins = 0;

//Constructor
public MyWallet(){
    this.coins = 50;
}
public MyWallet(int initialCoins){
    this.coins = initialCoins;
}

//Get Set
public int getCoins(){
    return this.coins;
}
private void setCoins(int value){
    this.coins = value;
}

// Methods
public void printCoins(){
    System.out.println("You have " + this.coins + " coins.");
}


}
