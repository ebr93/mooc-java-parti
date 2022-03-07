public class Film {
    //Instance Variables
    private String name;
    private int ageRating;

    //Constructor
    public Film(String filmName, int filmAgeRating) {
        this.name =filmName;
        this.ageRating = filmAgeRating;
    }

    //Method returns this.name
    public String name() {
        return this.name;
    }

    //Method returns this.ageRating
    public int ageRating() {
        return this.ageRating;
    }
}
