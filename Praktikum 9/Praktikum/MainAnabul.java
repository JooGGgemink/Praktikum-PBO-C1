public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul k = new KoleksiAnabul(10);
        k.add(new Anjing("Brandon"));
        k.add(new Kucing("Empus"));
        k.add(new Burung("Jack"));
        k.add(new Anabul("Anabul"));
        k.add(new Anabul("Anabul2"));
        k.add(new Anabul("Anabul3"));
        k.add(new Kucing("Meong"));
        k.add(new Burung("Cuit"));
        k.add(new Anjing("GukGuk"));
        k.add(new Anabul("Anabulll"));

        k.showAll();
    }
}