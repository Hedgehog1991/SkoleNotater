package mikeDaneTutorial;

public class StaticClassAtt {
    public static void main(String[] args) {
        Song holiday = new Song("Holiday", "Green Day", 200); //songcount 1
        Song americanIdiot = new Song("American Idiot", "Green Day", 180);//songcount 2

        System.out.println(holiday.getSongsCount()); //printing number of songs 2
        System.out.println(americanIdiot.getSongsCount()); //printing number of songs 2

        //The value types are the same for each object but each object should be regarded
        //As separate entities. Shared attributes but different objects. Like 2 basketballs.

    Song africa = new Song("africa","toto", 250); //songcount is 3

        System.out.println(holiday.getSongsCount()); //printing number of songs 3
        System.out.println(americanIdiot.getSongsCount()); //printing number of songs 3
        System.out.println(africa.getSongsCount());//printing number of songs 3
    }
}
/*
We can define a static attribute or a static variable inside of our class
and then all of the objects in that class will be able to access and have that
same value. different object instances but share the attribute songcount

 */