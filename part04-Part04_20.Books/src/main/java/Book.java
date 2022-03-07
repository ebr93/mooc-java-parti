
public class Book {
    //Instance variables
    private String name;
    private int pages;
    private int publication;

    //Constructor for Book class
    public Book(String name, int pages, int publication) {
        this.name = name;
        this.pages = pages;
        this.publication = publication;
    }

    //module to return name
    public String getName() {
        return name;
    }

    //module to return name, pages, and publication
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publication;
    }
    
}
