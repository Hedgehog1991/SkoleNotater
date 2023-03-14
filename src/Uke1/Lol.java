package Uke1;

public class Lol {


    public int coins;

    Lol(int initialCoins){
        this.coins = initialCoins;
    }

    void printCoins(){
        System.out.println("you got" + this.coins + " coins.");
    }

    public static void main(String[] args){
        Lol lol = new Lol(100);

        lol.printCoins();

    }

}
