package ro.fasttrackit.curs8.TryStatic;

public class Student {
    public static int SUM = 0;

    private String nume;
    private double nota;

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
        SUM += nota;
    }

    public String getNume() {
        return nume;
    }

    public double getNota() {
        return nota;
    }

    public String tString() {
        return "Student " + nume + " de nota " + nota;
    }
}
