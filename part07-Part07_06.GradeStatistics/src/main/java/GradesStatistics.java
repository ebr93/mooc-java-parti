import java.util.ArrayList;

public class GradesStatistics {
    private ArrayList<Grades> studentList;
    
    public GradesStatistics() {
        this.studentList = new ArrayList<>();
    }

    public void setGradesStatistics(Grades grade) {
        if (grade.getPoints() >= 0 && grade.getPoints() <= 100) {
            this.studentList.add(grade);
        }
    }

    public ArrayList<Grades> getList() {
        return this.studentList;
    }

    public ArrayList<Double> getPointsList() {
        ArrayList <Double> pointsList = new ArrayList<>();

        for (Grades grade : this.studentList) {
            pointsList.add(grade.getPoints() * 1.0);
        }
        return pointsList;
    }

    public ArrayList<Integer> getGradesList() {
        ArrayList <Integer> gradeList = new ArrayList<>();

        for (Grades grade : this.studentList) {
            gradeList.add(grade.getGrade());
        }
        return gradeList;
    }

    public void averagePoints() {
        Double averagePoints = 0.0;

        for (Double sum : getPointsList()) {
            averagePoints += sum;
        }
        averagePoints = averagePoints / getPointsList().size();
        System.out.println("Point average (all): " + averagePoints);
    }

    public void passingAveragePoints() {
        Double averagePoints = 0.0;
        int index = 0;
        int passingStudents = 0;

        for (Double sum : getPointsList()) {
            if (this.studentList.get(index).getGrade() >= 1) {
                averagePoints += sum;
                passingStudents++;
            }
            index++;
        }
        averagePoints = averagePoints / passingStudents;
        System.out.println("Point average (passing): " + averagePoints);
    }

    public void passingStudentsPercentage() {
        int index = 0;
        double passingStudents = 0;

        for (Double sum : getPointsList()) {
            if (this.studentList.get(index).getGrade() >= 1) {
                passingStudents++;
            }
            index++;
        }
        passingStudents = 100.0 * passingStudents / this.studentList.size();
        System.out.println("Pass percentage: " + passingStudents);
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        System.out.println(printStars(5));
        System.out.println(printStars(4));
        System.out.println(printStars(3));
        System.out.println(printStars(2));
        System.out.println(printStars(1));
        System.out.println(printStars(0));
    }

    public String printStars(int gradeNumber) {
        String stars = "";

        for (int grade : getGradesList()) {
            if (grade == gradeNumber) {
                stars = stars + "*";
            }
        }
        return (gradeNumber + ":" + stars);
    }
}
