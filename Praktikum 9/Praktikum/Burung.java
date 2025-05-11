public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }
    @Override
    public String gerak() {
        return "Burung " + getNama() + " terbang";
    }
    @Override
    public String bersuara() {
        return getNama() + " cuit";
    }
    @Override
    public void printInfo() {
        System.out.println("Burung " + getNama());
        System.out.println(gerak());
        System.out.println(bersuara());
    }
    
}