//Nama : Johan Miracle Simanjuntak
//NIM  : 24060123120026
public class Tendik extends Karyawan {
    private static final double GAJI_POKOK = 4000000;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
    }

    @Override
    public double hitungGaji() {
        return GAJI_POKOK + (masaKerja * 0.01 * GAJI_POKOK);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Tendik: " + nama + ", NIP: " + NIP);
        System.out.println("Email: " + email + ", Masa Kerja: " + masaKerja + " tahun, Gaji: Rp" + hitungGaji());
    }
}