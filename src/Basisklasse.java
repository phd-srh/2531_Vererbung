public class Basisklasse {
    private int a;
    private int b;

    // wenn kein Konstruktor angegeben wurde, existiert ein
    //  parameterloser Default-Konstruktor
//    public Basisklasse() {
//        super(); // <- IMMER erster Befehl im Konstruktor
//        System.out.println("Aufruf des parameterlosen CTOR in Basisklasse");
//    }

    // Sobald irgend ein Konstruktor in der Klasse bereitgestellt wird,
    // VERSCHWINDET der parameterloser Default-Konstruktor
    public Basisklasse(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Aufruf des Standard CTOR in Basisklasse");
    }
}
