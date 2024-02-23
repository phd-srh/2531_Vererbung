public class AbgeleiteteKlasse extends Basisklasse {
    private int c;

    public AbgeleiteteKlasse(int a, int b, int c) {
        super(a, b);
        this.c = c;
        // super(); <- Aufruf des CTOR der direkten Oberklasse
        System.out.println("Standard CTOR von AbgeleiteteKlasse");
    }
}
