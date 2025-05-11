public class Anjing extends Anabul{
    public Anjing(String nama) {
        super(nama);
    }
    @Override
    public String gerak() {
        return "Anjing " + getNama() + " melata";
    }
    @Override
    public String bersuara() {
        return getNama() + " guk-guk";
    }
    @Override
    public void printInfo() {
        System.out.println("Anjing " + getNama());
        System.out.println(gerak());
        System.out.println(bersuara());
    }
    
}