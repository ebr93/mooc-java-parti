
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    //adds number as points and grades to the ArrayList
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    //checks how many grades of the same value are and returns that number
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    //gives averages for Grades
    //based on the size of ArrayList first
    //run a (for) loop to go through the list and add the numbers using a double variable
    //return the sum of those numbers and divide it by the size of list
    public double averageOfGrades() {
        if (this.grades.size() == 0) {
            return -1;
        }

        double average = 0;
        for (Integer grade : this.grades) {
            average += grade;
        }

        return average / this.grades.size();
    }

    //had to create an object variable at the top by making a new ArrayList for points
    //gives averages for Points
    //based on the size of ArrayList first
    //run a (for) loop to go through the list and add the numbers using a double variable
    //return the sum of those numbers and divide it by the size of list
    public double averageOfPoints() {
        if (this.points.size() == 0) {
            return -1;
        }

        double average = 0;
        for (int sum : this.points) {
            average += sum;
        }

        return average / this.points.size();
    }
}
