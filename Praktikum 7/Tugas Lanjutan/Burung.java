public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Cuit ");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " terbang ");
    }
}
