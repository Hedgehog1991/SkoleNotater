package AprosjektOppgave.Oppgave2;

import Uke4.Shapes.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;


public abstract class Collective{


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

        Person pr1 = new Person("Kris", 31, "krivdd91@hotmail.com");
        Person pr2 = new Person("Lana", 35, "nnlanan@hotmail.ca");
        Person pr3 = new Person("Bob", 25, "bobob@outlook.com");
        Person pr4 = new Person("Riza", 30, "rzaa@outlook.com");
        Person pr5 = new Person("Nils", 42, "Nillls@icloud.de");
        Person pr6 = new Person("Henry", 18, "h3zry@gmail.com");
        Person pr7 = new Person("Claudia", 20, "aidaulc@yahoo.no");


       RentalAgreement ra1 = new RentalAgreement("Kris", 2,8,2030, 20,5,2018);
       RentalAgreement ra2 = new RentalAgreement("Lana", 15,5,2010, 3,9,2017);
       RentalAgreement ra3 = new RentalAgreement("Bob", 31,8,2011, 10,2,2023);
       RentalAgreement ra4 = new RentalAgreement("Riza", 31,8,2011, 10,2,2023);
       RentalAgreement ra5 = new RentalAgreement("Nils", 12,8,2013, 10,6,2026);
       RentalAgreement ra6 = new RentalAgreement("Henry", 12,8,2013, 9,7,2013);
       RentalAgreement ra7 = new RentalAgreement("Claudia", 12,8,2013, 10,2,2027);


        HashMap<Room, Person> inhabitantMap = new HashMap<>();
        inhabitantMap.put(rm1, pr1);
        inhabitantMap.put(rm2, pr2);
        inhabitantMap.put(rm3, null);
        inhabitantMap.put(rm4, pr3);
        inhabitantMap.put(rm5, pr4);
        inhabitantMap.put(rm6, pr5);
        inhabitantMap.put(rm7, null);
        inhabitantMap.put(rm8, pr6);
        inhabitantMap.put(rm9, pr7);

        HashMap<Person, RentalAgreement> contractMap = new HashMap<>();
        contractMap.put(pr1, ra1);
        contractMap.put(pr2, ra2);
        contractMap.put(pr3, ra3);
        contractMap.put(pr4, ra4);
        contractMap.put(pr5, ra5);
        contractMap.put(pr6, ra6);
        contractMap.put(pr7, ra7);




        for (Map.Entry<Room, Person> entry : inhabitantMap.entrySet()) {
            Room roomNr = entry.getKey();
            Person personInfo = entry.getValue();
               if(personInfo == null){System.out.println(roomNr + "\u001B[31m Empty");}
            //Person defaultValue = new Person("empty");
            //inhabitantMap = (HashMap<Room, Person>) replaceNullValues(inhabitantMap, defaultValue);
            for (Map.Entry<Person, RentalAgreement> entry2 : contractMap.entrySet()) {
                Person personValue = entry2.getKey();
                assert personInfo != null;
                if(personValue == personInfo) {
                    RentalAgreement rentalAgreement = entry2.getValue();
                    System.out.println("\n"+ roomNr +" \n"+ personValue +" "+ rentalAgreement);

                }


            }
        }

    }
}











