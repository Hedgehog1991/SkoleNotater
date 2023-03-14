package Example.ArrayListScanner;

public class ZombieKiller {
    public static void main(String[] args) {
        System.out.println("Zombie killer program");

        String[] backpack = {"Shotgun", "Assult rifle", "Sniper"};
        String[] zombies = {"Close range zombie", "Spitter zombie", "thrower zombie"};

        System.out.println("--stuff in backpack--");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("--zombies--");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

        int[] numberZombiesHate = {4,90,70,123,12,4,561,1};

        System.out.println(numberZombiesHate[6]);
    }
}
