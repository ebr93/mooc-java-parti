import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcasesList;
    private int totalWeightHold;
    
    //one set parameter
    public Hold (int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcasesList = new ArrayList<>();
        this.totalWeightHold = 0;
    }

    //adds suitcase to (Hold) ArrayList
    //adds only if suitcases do not go over maximumWeight
    //adds suitcase weight to instance variable called (totalWeightHold)  
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeightHold <= this.maximumWeight) {
            this.suitcasesList.add(suitcase);
            this.totalWeightHold += suitcase.totalWeight();
        }
    }

    //it strings in specific format 
    //2 suitcases (7 kg)
    public String toString() {
        return this.suitcasesList.size() + " suitcases (" + totalWeightHold + " kg)";
    }

    //goes through ArrayList of Hold then pulls each suitcase through (sumList)
    //use method (printItems) to print each of the items
    public void printItems() {
        for (Suitcase sumList : suitcasesList) {
            sumList.printItems();

            /*
            for (ArrayList<Item> itemList : sumList) {
                toPrint += "\n" + itemList;
            }
            */
        }
    }
}
