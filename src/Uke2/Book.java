package Uke2;

import java.util.ArrayList;
import java.util.Scanner;


public class Book {
    //Fields
    private String title;
    private String author;
    private int numberOfPages;
    private BookGenre genre;
    public static int bookCount = 0;

    //Constructor
    private Book(String title, String author, int numberOfPages, BookGenre genre){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        bookCount ++;


    }

    //Getter Setter
        public String getTitle() { return title;}
    public void setTitle(String title) {
        this.title = title;
    }
        public String getAuthor() {
            return author;
        }
    public void setAuthor(String author) {
        this.author = author;
    }
        public int getnumberOfPages() {
            return numberOfPages;
        }
    public void setnumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public BookGenre getGenre() {
        return genre;
    }
        public void setGenre(BookGenre genre) {
            this.genre = genre;
        }

public void printBook(){
    System.out.println(this.title + ", " + this.author + ", " + this.numberOfPages + ", " + this.genre);
}
    static ArrayList<Magazines> mags = new ArrayList<>();
    //Main Method
public static void main() {

    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter title: ");
    String customTitle = userInput.nextLine();
    System.out.println("Enter author: ");
    String customAuthor = userInput.nextLine();
    System.out.println("Enter number of pages: ");
    int customPages = Integer.parseInt(userInput.nextLine());


    BookShelf shelf1 = new BookShelf("BOOKS");
    BookShelf shelf2 = new BookShelf("NESTED ARRAY");

    Book book3 = new Book("Peak Preformance", "Charles Garfield", 300, BookGenre.CLASSIC);
    Book book1 = new Book("The Game", "Niel Strauss", 259, BookGenre.OTHER);
    Book book5 = new Book("hello", "hellollo", 499, BookGenre.CLASSIC);
    Book book6 = new Book("hello", "hellollo", 499, BookGenre.CLASSIC);
    Book book7 = new Book("hello", "hellollo", 499, BookGenre.CLASSIC);
    Book book8 = new Book("hello", "hellollo", 499, BookGenre.CLASSIC);
    Book book4 = new Book("hello", "hellollo", 499, BookGenre.CLASSIC);
    Book book2 = new Book(customTitle, customAuthor, customPages, BookGenre.ACTION);
    System.out.println(book3.getTitle());


    shelf1.addBook(book3);
    shelf1.addBook(book2);
    shelf1.addBook(book1);
    shelf1.addBook(book4);


    ArrayList<Book> shelf2Books = new ArrayList<>();
    shelf2Books.add(book1);
    shelf2Books.add(book2);
    shelf2Books.add(book3);
    shelf2Books.add(book2);

    shelf2.addBooks(shelf2Books);


    Magazines foodMags = new Magazines("Nutrition");
    foodMags.addRack("Loose Weigh fast", 34.9);
    foodMags.addRack("make a Perfect Cake",32.9);
    mags.add(foodMags);

    Magazines natureMags = new Magazines("Nature");
    natureMags.addRack("Nordic Birds", 55.5);
    natureMags.addRack("Monkey Business", 25.9);
    mags.add(natureMags);


    Magazines.printMagazines();
    shelf1.printShelf();
    shelf2.printShelf();
    /* ArrayList<Book> bk = shelf1.getShelf();
    for (Book b : bk) {
        b.printBook();
    }*/

    System.out.println("book objects " + bookCount);
    }
}
