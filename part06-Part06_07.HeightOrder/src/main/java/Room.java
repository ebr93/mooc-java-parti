import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    //adds (person) to Arraylist
    //that includes name and height
    public void add(Person person) {
        this.people.add(person);
    }

    //returns whether its true or sale if ArrayList is empty
    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    //returns ArrayList
    public ArrayList<Person> getPersons() {
        return this.people;
    }

    //finds shortest individual in the list
    //if ArrayList is empty then returns null
    //(for) loop compares the height, which is called with (getHeight())
    public Person shortest() {
        if (this.people.size() == 0) {
            return null;
        }

        Person returnPerson = this.people.get(0);

        for (Person list : this.people) {
            if (list.getHeight() < returnPerson.getHeight()) {
                returnPerson = list;
            }
        }

        return returnPerson;
    }

    //Create new person variable and use method to call shortest
    //removes the shortest person from (this.people) ArrayList
    //returns the shortest person (returnTake)
    public Person take() {
        Person returnTake = shortest();
        this.people.remove(returnTake);
        return returnTake;
    }
}
