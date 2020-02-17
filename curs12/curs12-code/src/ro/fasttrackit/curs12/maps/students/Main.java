package ro.fasttrackit.curs12.maps.students;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        List<StudentGrade> students = reader.readFile("grades.txt");
        System.out.println(students);

        Classroom classroom = new Classroom(students);
        System.out.println(classroom.getGrades("Computer Science"));

        System.out.println(classroom.getStudentGrades());
        System.out.println(classroom.getStudentDisciplines());
        System.out.println("Au picat:");
        System.out.println(classroom.getBadStudents());
        System.out.println(classroom.getFailed());
        System.out.println(classroom.getFailedOptimized());
        System.out.println("Note:");
        System.out.println(classroom.getAllGrades());

    }


}
