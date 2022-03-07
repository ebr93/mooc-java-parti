public class Toy {
    
    private String identifier;
    private String name;

    public Toy (String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    /*
    Should of added this method to print out, it affects 
    its behavior when its printed in main through sysout(toys)

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }


    */

    //returns a boolean value
    //affects how (contains) works
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        //if different class then returns false
        if (!(compared instanceof Toy)) {
            return false;
        }
        //convert the object into a (Toy) object
        Toy otherToy = (Toy) compared;

        return  this.identifier.equals(otherToy.identifier);

        /*this line is the same as the code below

        if (this.identifier.equals(otherToy.identifier)) {
            return true;
        }

        return false;

        */
    }
}
