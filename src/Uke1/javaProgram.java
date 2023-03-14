package Uke1;

import Example.MyWallet;
//If the methods(costructors, fields etc. outside the packet is set to private it will block
//All access from outside that specific class.
//

public class javaProgram {
    public static void main(String[] args){
        MyWallet wallet1 = new MyWallet(100);
        MyWallet wallet2 = new MyWallet();



        wallet1.printCoins();
        wallet2.printCoins();
    }
}

