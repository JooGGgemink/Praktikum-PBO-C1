import java.time.LocalDate;
public abstract class Manusia {
    //abstract
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    //konstruktor
    public Manusia(){}
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns ++;
    }
    //selektor mutator
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    public String getAlamat() {
        return alamat;
    }
    public static int getCounterMns() {
        return counterMns;
    }
    public String getNama() {
        return nama;
    }
    public double getPendapatan() {
        return pendapatan;
    }
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: Rp" + getPendapatan());
    }
    public abstract int hitungMasaKerja();
}