public class Grades {
    private int points;
    private int grade;

    public Grades(int points) {
        this.points = points;
        this.grade = setGrade(points);
    }

    public int setGrade(int points) {
        if (points >= 90 && points <= 100) {
            return 5;
        }
        if (points >= 80 && points < 90) {
            return 4;
        }
        if (points >= 70 && points < 80) {
            return 3;
        }
        if (points >= 60 && points < 70) {
            return 2;
        }
        if (points >= 50 && points < 60) {
            return 1;
        }
        if (points >= 0 && points < 50) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getPoints() {
        return this.points;
    }

    public int getGrade() {
        return this.grade;
    }
}
