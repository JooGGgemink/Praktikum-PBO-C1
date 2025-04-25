public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong ");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melata ");
    }
}

