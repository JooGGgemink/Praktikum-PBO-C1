import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int  counterPengusaha = 0;
    private static final int B = 9; // Digit ke-13 NIM
    //konstruktor
    public Pengusaha(){}
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    //selektor mutator
    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
        @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays();
        return totalHari + B;
    }
    
    @Override
    public double hitungPajak() {
        double pajak = (15.0/100) * pendapatan;
        return pajak;
    }
    @Override
    public void cetakInfo() {
        System.out.println("========== Informasi PENGUSAHA ==========");
        System.out.println("Nama          : " + getNama());
        System.out.println("NPWP          : " + getNpwp());
        System.out.println("Alamat        : " + getAlamat());
        System.out.println("Tanggal Mulai : " + getTgl_mulai_kerja());
        System.out.println("Pendapatan    : Rp " + getPendapatan());
    
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays() + B;
    
        int tahun = totalHari / 365;
        int sisaHari = totalHari % 365;
        int bulan = sisaHari / 30;
        int hari = sisaHari % 30;
    
        System.out.println("Masa Kerja    : " + tahun + " tahun, " + bulan + " bulan, " + hari + " hari");
    
        System.out.print("Pajak         : Rp "+hitungPajak());
        System.out.println();
        System.out.println("===================================");
    }
}