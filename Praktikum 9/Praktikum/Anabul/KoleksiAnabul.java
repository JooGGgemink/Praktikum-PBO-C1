public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul(int size) {
        koleksi = new Koleksi<>(size);
    }
    

    public void add(Anabul anabul) {
        koleksi.add(anabul);
    }
    

    public void showAll() {
        System.out.println("========== KOLEKSI ANABUL ==========");
        System.out.println("Total hewan: " + koleksi.getSize()); // Changed to getSize()
        System.out.println("===================================");
        
        for (int i = 0; i < koleksi.getSize(); i++) { // Changed to getSize()
            Anabul animal = koleksi.getIsi(i); // Changed to getIsi()
            System.out.println("Anabul #" + (i+1) + ":");
            animal.printInfo();
            System.out.println("-----------------------------------");
        }
    }
}