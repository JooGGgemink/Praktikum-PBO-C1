public class MainAnabul {
    public static void main(String[] args) {
        Anabul a1 = new Kucing("Empus");
        Anabul a2 = new Anjing("Golden");
        Anabul a3 = new Burung("Icibos");

        a1.bersuara();
        a1.bergerak();
        System.out.println();

        a2.bersuara();
        a2.bergerak();
        System.out.println();

        a3.bersuara();
        a3.bergerak();
    }
}
