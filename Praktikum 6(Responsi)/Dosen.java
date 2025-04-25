//Nama : Johan Miracle Simanjuntak
//NIM  : 24060123120026
public class Dosen extends Karyawan {
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen: " + nama + ", NIP: " + NIP + ", Fakultas: " + fakultas.getNama());
        System.out.println("Email: " + email + ", Masa Kerja: " + masaKerja + " tahun, Gaji: Rp" + hitungGaji());
    }
}