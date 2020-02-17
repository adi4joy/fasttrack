package ro.fasttrackit.curs8.TryStatic;

public class TryStatic {
    public static void main(String[] args) {
        Ceas aLuiPaul = new Ceas("negru");
        Ceas aLuiMircea = new Ceas("verde");

        System.out.println(aLuiPaul);
        System.out.println(aLuiMircea);
        System.out.println(Ceas.COUNT);
        System.out.println(aLuiMircea.n);
    }
}
