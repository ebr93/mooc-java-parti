
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    //modify the file to include the Pet's name and breed
    //(Pet) class is already included in the (Person) Class as an object
    //Implement methods from (Pet)
    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + "(" + this.pet.getBreed() + ")";
    }

}
