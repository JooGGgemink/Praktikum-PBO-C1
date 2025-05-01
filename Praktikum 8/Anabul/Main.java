public class Main {
    public static void main(String[] args) {
        Datum<Kucing> kucing = new Datum<>(new Kucing());
        Datum<Anjing> anjing = new Datum<>(new Anjing());
        Datum<Burung> burung = new Datum<>(new Burung());

        System.out.println("Kucing:");
        ContohMetodeGenerik.tampilkanPerilaku(kucing);
        
        System.out.println("\nAnjing:");
        ContohMetodeGenerik.tampilkanPerilaku(anjing);
        
        System.out.println("\nBurung:");
        ContohMetodeGenerik.tampilkanPerilaku(burung);
    }
}
