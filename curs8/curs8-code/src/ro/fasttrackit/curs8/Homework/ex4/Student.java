package ro.fasttrackit.curs8.Homework.ex4;

public class Student {
    private String name;
    private int grade;
    public static int COUNT = 0;
    public static int SUM = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        COUNT++;
        SUM += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getGradesSum() {
        return SUM;
    }

    public int getStudentsNumber() {
        return COUNT;
    }

    public static int averageGrade() {
        return SUM / COUNT;
    }
}
