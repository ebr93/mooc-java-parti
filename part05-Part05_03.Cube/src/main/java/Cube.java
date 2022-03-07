public class Cube {
    //instance variable
    private int edgeLength;

    //constructor = defines length of cube
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }

    //method = finds volume of cube
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    //method = prints out sentence with length and volume
    public String toString() {
        return "The length of this edge is " + this.edgeLength + " and the volume " + volume();
    }
}
