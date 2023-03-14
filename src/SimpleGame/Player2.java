package SimpleGame;

public class Player2 extends Player1 {

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);// super means that this method is not from this class.
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (armour){
            this.health -= 20;
            if (this.health <= 0) this.health = 0;
            System.out.println("armour is on. got hit by gun 1. health reduced by 20" + "new health is" + this.health);
        }
        if (!armour) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;
            System.out.println("armour is off. got hit by gun 1. health reduced by 40" + "new health is" + this.health);
        }
        if (this.health == 0) {
            System.out.println( getName() + " is dead");
        }
    }
    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <=0) this.health = 0;
            System.out.println("armour is on. got hit by gun 1. health reduced by 40" + "new health is" + this.health);
        }if(!armour){
            this.health -= 50;
            if(this.health <=0) this.health = 0;
            System.out.println("armour is off. got hit by gun 1. health reduced by 50" + "new health is" + this.health);
        }
        if (this.health == 0) {
            System.out.println( getName() + " is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
