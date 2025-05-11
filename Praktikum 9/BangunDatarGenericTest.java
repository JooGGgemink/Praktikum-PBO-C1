public class BangunDatarGenericTest {
    public static void main(String[] args) {
        System.err.println("================lingkaran==================");
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran);
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
        //uji persegi
        System.err.println("================persegi==================");
        Persegi persegi = new Persegi(5);
        BangunDatarGeneric<Persegi> psg = new BangunDatarGeneric<Persegi>();
        psg.set(persegi);
        System.err.println("Keliling persegi: " + psg.hitungKeliling());
        //uji persegi panjang
        System.err.println("================persegi panjang==================");
        PersegiPanjang pp = new PersegiPanjang(5, 8);
        BangunDatarGeneric<PersegiPanjang> ppan= new BangunDatarGeneric<PersegiPanjang>();
        ppan.set(pp);
        System.err.println("Keliling persegi panjang: " + ppan.hitungKeliling());
        //uji segitiga
        System.err.println("================segitiga==================");
        Segitiga sgt = new Segitiga(5, 6);
        BangunDatarGeneric<Segitiga> sgtg = new BangunDatarGeneric<Segitiga>();
        sgtg.set(sgt);
        System.err.println("Keliling segitiga: " + sgtg.hitungKeliling());
    }
}