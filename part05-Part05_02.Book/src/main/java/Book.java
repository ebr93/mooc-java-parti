public class Book {
    //instance variables
    private String author;
    private String name;
    private int pages;

    //constructor
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    //method
    public String getAuthor() {
        return this.author;
    }

    //method
    public String getName() {
        return this.name;
    }

    //method
    public int getPages() {
        return this.pages;
    }

    //method
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
