package Example.ArrayListScanner;
import java.util.ArrayList;

public class Terminal {

    //Felter
    private ArrayList<String> options = new ArrayList<>();

    //Method
    public void addOption(String value){
        this.options.add(value);

    }

    public void displayMainMenu(){
        for(int i = 0; i < this.options.size(); i ++){
            System.out.println((i + 1) + ". " + this.options.get(i));
        }
    }
    public void info(String tag, String line){

        System.out.println(("[" + tag + "]:" + line ));
    }

    public static void main(String[] args){
        Terminal terminal = new Terminal();
    terminal.info("Terminal,", "Vi ippretter 2 valg");
        terminal.addOption("Skriv ut navn");
        terminal.addOption("Skriv ut alder");
    terminal.info("Terminal", "Vi viser meny valgene i terminal");

        terminal.displayMainMenu();
    }

   // ((psvm))
}
