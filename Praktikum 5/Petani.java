import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani;
    private static final int C = 1; // Digit ke-12 NIM
    //konstruk
    public Petani(){}
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    //selektor mutator
    public String getAsal_kota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays();
        return totalHari + C;
    }
    @Override
    public double hitungPajak() {
        double pajak = 0;
        return pajak;
    }
    @Override
    public void cetakInfo() {
        System.out.println("========== Informasi PETANI ==========");
        System.out.println("Nama          : " + getNama());
        System.out.println("Asal Kota     : " + getAsal_kota());
        System.out.println("Alamat        : " + getAlamat());
        System.out.println("Tanggal Mulai : " + getTgl_mulai_kerja());
        System.out.println("Pendapatan    : Rp " + getPendapatan());
        
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays() + C;
    
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