package Uke2;
import java.util.ArrayList;
public class Terminal {

    ArrayList<String> options = new ArrayList<>();

    void addOptions(String value){
        this.options.add(value);
    }

    void clearOptions(){
        this.options.clear();
    }

    void displayMenu() {
        for (int i = 0; i < this.options.size(); i++){
            System.out.println((i + 1) + ". " + this.options.get(i));
        }
    }
    public void info(String tag, String line){

        System.out.println(("[" + tag + "]:" + line ));
    }

    public static void main(String[] args) {
        Terminal list = new Terminal();

        list.info("Info", "add name and age");

        list.addOptions("Write out name");
        list.addOptions("Write out age");

        list.displayMenu();
        list.clearOptions();
    }

}
