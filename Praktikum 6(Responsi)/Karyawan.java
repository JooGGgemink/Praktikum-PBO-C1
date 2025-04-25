//Nama : Johan Miracle Simanjuntak
//NIM  : 24060123120026
public abstract class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}