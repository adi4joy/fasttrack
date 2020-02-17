package ro.fasttrackit.curs8.Homework.ex4;

public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Marius", 10);
        Student student2 = new Student("Oana", 8);
        Student student3 = new Student("Catalin", 9);
        Student student4 = new Student("Andreea", 6);

        System.out.println("Suma notelor este: " + Student.SUM);
        System.out.println("Numarul de studenti este: " + Student.COUNT);
        System.out.println("Media notelor este: " + Student.averageGrade());
    }
}
