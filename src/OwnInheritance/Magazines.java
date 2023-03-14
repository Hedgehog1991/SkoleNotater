
package OwnInheritance;
/*
import com.sun.jdi.Value;

import java.util.*;

class Magazines{



     public enum Genre {
        MYSTERY(0),
        WELLNESS(1),
        GEOGRAPHY(2),
        HISTORY(3);

         final Object magaType;

         Genre(Object magaType) {
             this.magaType = magaType;
         }
     }

     int numberOfpages;
     String publisher;
     int yearPublished = 0;
    String author = "";
    boolean color = false;
    String title = "";
    Release release;
    //declaring a null of a class
    //static Magazines magazines;
    static EnumMap<Genre, Magazines> cat;
    //static EnumMap<Genre, Magazines> cat;
    //static ArrayList<Magazines> magList;


    public Magazines(int numberOfpages, String publisher, String title, Release release) {
        this.numberOfpages = numberOfpages;
        this.publisher = publisher;
        this.title = title;
        this.release = release;

    }


    public static void main(String[] args) throws Exception {
        cat = new EnumMap<>(Genre.class);
        //magList = new ArrayList<>();
        //ArrayList<Magazines> magList1 = new ArrayList<>();





        Magazines vogue = new Magazines(50,"Vogue", "Styles For All -", Release.WEEKLY);
        Magazines codenast = new Magazines(65, "Condé Nast", "GQ - Mens Culture & Wellness", Release.MONTHLY);
        Magazines prh = new Magazines( 80, "Penguin Random House", "National Geographic", Release.BIQUARTERLY);
        Magazines fc = new Magazines(55, "Fast Company", "Entrepeneur", Release.WEEKLY);
        Magazines mantra = new Magazines(62, "Mantra Magazines", "Mantra Wellness", Release.QUARTERLY);

/*
        Magazines.magList.add(vogue);
        magList.add(codenast);
        magList.add(prh);
        magList.add(fc);
        magList1.add(mantra);
*/
/*
        cat.put(Genre.WELLNESS, vogue);

        cat.put(Genre.HISTORY, codenast);
        cat.forEach((genre, magazines) ->  {
            System.out.println(getCat().values());
        });




        System.out.println("" + getCat().values());
         Set<Map.Entry<Magazines.Genre, Magazines>> set_view = cat.entrySet();
        System.out.println(set_view.size());


        /*for(ArrayList<Magazines> m: cat.values()){
            for(Magazines mag:m){
                System.out.println(mag.numberOfpages + " " + mag.publisher +" " + mag.title + " " + mag.release);
            }
        }*/
/*

    }

    public static EnumMap<Genre, Magazines> getCat() {
        return cat;
    }

    public static void setCat(EnumMap<Genre, Magazines> cat) {
        Magazines.cat = cat;
    }

    /*
   @Override
    public String toString(){
       return "Magazines{" +
               "numberOfpages=" + numberOfpages +
               ", publisher='" + publisher + '\'' +
               ", yearPublished=" + yearPublished +
               ", author='" + author + '\'' +
               ", color=" + color +
               ", title='" + title + '\'' +
               ", release=" + release +
               '}';
   }*/
//}



//super refers to the value of what is stored in the class being extended to so it overwrite a previous value stored in the subclass.
// same applies to methods. Method in subclass will be prioritized and run over the same method in the parent class.
// if a lot of methods are stored in the parent class it is a lot easier to just use one of them with super instead of copy paste.
//super refers to the parent class but this. refers to the class it is in. (dosnt overwrite??)
