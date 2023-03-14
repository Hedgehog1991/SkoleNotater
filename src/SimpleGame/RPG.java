package SimpleGame;

public class RPG {

/*P1 and P2 commonalities == name weapon health(Integer)
   P2 can choose to wear armor if armor is true G1 = -20 G2 = -40
   Gun1 -> - 30 hp
   Gun2 -> - 50 hp
   h == 0 dead
   healing option press will hadd 100*/
public static void main(String[] args) {
    Player1 player = new Player1("Abnhay","sword",100 );
    //System.out.println(player.getName());
    //System.out.println(player.getWeapon());
   // System.out.println(player.getHealth());

    player.damageByGun1();
    player.damageByGun1();
   // player.damageByGun2();
        player.heal();

    //Player2 betterPlayer = new Player2("Sam","machinegun",80, true);
    //betterPlayer.damageByGun1();





}
}
