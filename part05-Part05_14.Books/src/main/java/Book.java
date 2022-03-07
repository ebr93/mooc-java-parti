
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // used to find if there is an equal value 
    //affects how (ArrayList) (.contains) works
    public boolean equals(Object compared) {
        //if same address returns true
        if (this == compared) {
            return true;
        }

        //if different class then returns false
        if (!(compared instanceof Book)) {
            return false;
        }

        //object made to apply to following 
        Book otherBook = (Book) compared;

        //returns a boolean value based on whether the objects in the class are equal or not
        return this.name.equals(otherBook.name)
        && this.publicationYear == otherBook.getPublicationYear();

        /*
        original code I typed, it is equivalent to the one on top

        if (!(this.name.equals(otherBook.name))) {
            return false;
        }

        if (this.publicationYear != otherBook.publicationYear) {
            return false;
        }
        return true;
        */
    }

}