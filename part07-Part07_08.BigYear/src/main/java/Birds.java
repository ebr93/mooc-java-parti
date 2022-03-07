import java.util.ArrayList;

public class Birds {
    private String name;
    private String nameLatin;
    private int observation;

    public Birds(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String bird = this.name +  " (" + this.nameLatin + "): " + this.observation + " observations";
        return bird;
    }

    public void addObservation() {
        this.observation++;
    }



}
