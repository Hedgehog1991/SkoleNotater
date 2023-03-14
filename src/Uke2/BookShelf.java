package Uke2;
import java.util.ArrayList;

public class BookShelf {
    private String desc;
    private ArrayList<Book> shelf;

    //Constructor
    public BookShelf(String description) {
        this.desc = description;
        this.shelf = new ArrayList<>();
    }
    public void addBook(Book book){ //Singular
        shelf.add(book);
    }

    public void addBooks(ArrayList<Book> bookList){ //collection
        shelf.addAll(bookList);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public  void printShelf(){

        ArrayList<Book> bk = this.shelf;
        System.out.println("This shelf " + bk.size() + " contains Books ");
        for (Book b : bk) {
            b.printBook();
        }
        System.out.println(this.desc);
    }



}




