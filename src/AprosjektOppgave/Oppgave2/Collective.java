package AprosjektOppgave.Oppgave2;

import Uke4.Shapes.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;



public abstract class Collective implements mainMenu{



    public static <Person, Room> Map<Room, Person>
    replaceNullValues(Map<Room,Person> inhabitantMap, Person defaultValue){

        inhabitantMap = inhabitantMap.entrySet()
                .stream()
                .peek(entry -> {
                    if(entry.getValue() == null)
                        entry.setValue(defaultValue);
                })
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
        return inhabitantMap;
    }

    public static void main(String[] args) {

        Room rm1 = new Room();
        Room rm2 = new Room();
        Room rm3 = new Room();
        Room rm4 = new Room();
        Room rm5 = new Room();
        Room rm6 = new Room();
        Room rm7 = new Room();
        Room rm8 = new Room();
        Room rm9 = new Room();
        Person pr1 = new Person("Kris", 31, "kriv91@hotmail.com");
        Person pr2 = new Person("Lana", 35, "nnnann@hotmail.ca");
        Person pr3 = new Person("Bob", 25, "bobob@outlook.com");
        Person pr4 = new Person("Riza", 30, "rzaa@outlook.com");
        Person pr5 = new Person("Nils", 42, "Niiilsb@outlook.com");

       RentalAgreement ra1 = new RentalAgreement("kris", 4501020, 19/10/10);

        System.out.println(ra1);
        HashMap<Room, Person> inhabitantMap = new HashMap<>();
        inhabitantMap.put(rm1, pr1);
        inhabitantMap.put(rm2, pr5);
        inhabitantMap.put(rm3, null);
        inhabitantMap.put(rm4, pr3);
        inhabitantMap.put(rm5, null);
        inhabitantMap.put(rm6, pr4);
        inhabitantMap.put(rm7, null);
        inhabitantMap.put(rm8, pr2);
        inhabitantMap.put(rm9, null);

        //HashMap<Person, RentalAgreement> contractMap = new HashMap<>();



        for (Map.Entry<Room, Person> entry : inhabitantMap.entrySet()) {
            Room roomNr = entry.getKey();
            Person personInfo = entry.getValue();

            //if (shape.getArea() < threshold) {
            System.out.println(roomNr + " " + personInfo );
           // for(Map.Entry<RentalAgreement, Room>)
            Person defaultValue = new Person("\u001B[31m[___]", 0 , "\u001B[31m[___]");

            inhabitantMap = (HashMap<Room, Person>) replaceNullValues(inhabitantMap, defaultValue);
            // }
        }

    }
    }











