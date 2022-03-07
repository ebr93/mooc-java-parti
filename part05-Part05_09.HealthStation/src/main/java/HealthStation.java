
public class HealthStation {
    private int count;

    public HealthStation() {
        this.count = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight();

    }

    public void feed(Person person) {
        //changes the (.setWeight) method by calling (.getWeight) and adding +1
        person.setWeight(person.getWeight() + 1);

        //int initialWeight = person.getWeight();
        //person.setWeight(initialWeight + 1);
    }

    public int weighings() {
        return this.count;
    }

}
