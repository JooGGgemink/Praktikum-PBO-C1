public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }
    @Override
    public String gerak() {
        return "Kucing " + getNama() + " melata";
    }
    @Override
    public String bersuara() {
        return getNama() + " meong";
    }
    @Override
    public void printInfo() {
        System.out.println("Kucing " + getNama());
        System.out.println(gerak());
        System.out.println(bersuara());
    }
} 
  