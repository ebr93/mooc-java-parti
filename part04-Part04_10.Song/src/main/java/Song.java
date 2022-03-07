public class Song {
    private String name;
    private int length;

    //Constructor with Instance variables
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    //Method that returns String name
    public String name() {
        return this.name;
    }

    //Method that returns int length
    public int length() {
        return this.length;
    }

}
