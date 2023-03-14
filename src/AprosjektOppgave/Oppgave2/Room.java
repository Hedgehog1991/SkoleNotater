package AprosjektOppgave.Oppgave2;

import java.util.ArrayList;

public class Room extends Collective{

public static int rooms = 0;
public final int roomNr;

//static Room rms;
public  Room(){
    //super();
    Room.rooms +=1;
     roomNr = Room.rooms;


}
    public int getRoomNr() {
        return roomNr;

    }
    @Override
    public String toString() {
        return "" +
                "\u001B[33mRoom Number: " + roomNr +
                "\u001B[33m";
    }
}