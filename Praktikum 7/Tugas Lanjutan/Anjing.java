public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Guk-gu");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melata ");
    }
}
