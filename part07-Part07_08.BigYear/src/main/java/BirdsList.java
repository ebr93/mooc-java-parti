import java.util.ArrayList;

import javax.lang.model.type.NullType;

public class BirdsList {
    private static final Birds NullPointerException = null;
    private ArrayList<Birds> list;

    public BirdsList() {
        this.list = new ArrayList<>();
    }

    public void setListBirds(Birds bird) {
        this.list.add(bird);
    }

    public String getListBirds() {
        return this.list.toString();
    }

    //format to print list
    public String toString() {
        String birdlist = "";

        for (Birds birds: this.list) {
            birdlist += birds.toString() + "\n";
        }
        return birdlist;
    }

    //returns specific bird from list
    public Birds findBird(String birdToFind) {
        for (Birds birds: this.list) {
            if (birds.getName().equals(birdToFind)) {
              return birds;
            }
        }
        return NullPointerException;
    }

    //checks if bird is on list
    public String checkList(String bird) {
        for (Birds birds: this.list) {
            if (birds.getName().equals(bird)) {
              return "Yes";
            }
        }
        return "No";
    }

}
