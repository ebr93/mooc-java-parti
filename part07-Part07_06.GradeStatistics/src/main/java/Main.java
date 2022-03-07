
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradesStatistics list = new GradesStatistics();
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                list.averagePoints();
                list.passingAveragePoints();
                list.passingStudentsPercentage();
                list.printGradeDistribution();
                break;
            }
            
            list.setGradesStatistics(new Grades(points));
        }
    }
}
    /*
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }

    public static double averageOfList(ArrayList<Integer> list) {
        int sum = 0;
        for (int numberFromList : list) {
            sum += numberFromList;
        }
        return 1.0 * sum/list.size();
    }

    //average of passing list 
    public static double averageOfPassingList(ArrayList<Integer> list) {
        int sum = 0;
        int listSize = 0;
        for (int numberFromList : list) {
            if (numberFromList >= 50) {
                sum += numberFromList;
                listSize++;
                
            }
        }
        return 1 * sum/listSize;
    }

    //gives percentage of students who passed
    public static double passingPercentage(ArrayList<Integer> list) {
        int studentsPass = 0;
        double totalStudents = list.size();

        for (int numberFromList : list) {
            if (numberFromList >= 50) {
                studentsPass++;
            }
        }
        return studentsPass/totalStudents * 100;
    } 

    //prints grade distribution with stars
    //a bit too elaborate, but it works. In order to print desired, I had separate prints by grade.
    //with a condition to print stars as long as it met the desired grade for that level
    //at the end of for loop (grade) would be subtracted by one, thus, only working with that if condition and printing in order.
    public static void printGradeDistribution(ArrayList<Integer> list) {
        Collections.sort(list);
        int grade = 5;

        while (grade >= 0) {
            System.out.print(grade + ":");
            for (int numberGrade : list) {
                if (grade == 5) {
                    if (numberGrade >= 90 && numberGrade <= 100) {
                        System.out.print("*");
                    }
                }
                if (grade == 4) {
                    if (numberGrade >= 80 && numberGrade < 90) {
                        System.out.print("*");
                    }
                }
                if (grade == 3) {
                    if (numberGrade >= 70 && numberGrade < 80) {
                        System.out.print("*");
                    }
                }
                if (grade == 2) {
                    if (numberGrade >= 60 && numberGrade < 70) {
                        System.out.print("*");
                    }
                }
                if (grade == 1) {
                    if (numberGrade >= 50 && numberGrade < 60) {
                        System.out.print("*");
                    }
                }
                if (grade == 0) {
                    if (numberGrade < 50) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
            grade--;
        }
    }
}

*/