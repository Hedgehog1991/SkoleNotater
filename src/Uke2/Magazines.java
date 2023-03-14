package Uke2;
import java.util.ArrayList;
import static Uke2.Book.mags;
public class Magazines {
    private String magazineTitle;
    private double magazineCost;

    private ArrayList<String> rack;

//Constructor
public Magazines(String title){
    this.magazineTitle = title;

    this.rack = new ArrayList<>();
}
// Methods
    public String getMagazine(){
    return this.magazineTitle;
    }
public ArrayList<String> getRack(){
    return this.rack;
}
public void addRack(String title, double cost){
    this.rack.add(title);
    this.rack.add(String.valueOf(cost));
}

public static void printMagazines() {
    for (Magazines m : mags) {
        System.out.println(m.getMagazine());
        for (String rack : m.getRack()) {
            System.out.println(rack);
        }
    }
}}