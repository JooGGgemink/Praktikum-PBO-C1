import java.time.LocalDate;
import java.time.Period;
public class PNS extends Manusia implements Pajak{
    //atribut
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 7; // Digit ke-14 NIM
    //konstriktor
    public PNS(){}
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip=nip;
        counterPNS++;
    }
    //selektor mutator
    public String getNip() {
        return nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays();
        return totalHari + A;
    }
    
    @Override
    public double hitungPajak() {
        double pajak = (10.0/100) * pendapatan;
        return pajak;
    }
    @Override
    public void cetakInfo() {
        System.out.println("========== Informasi PNS ==========");
        System.out.println("Nama          : " + getNama());
        System.out.println("NIP           : " + getNip());
        System.out.println("Alamat        : " + getAlamat());
        System.out.println("Tanggal Mulai : " + getTgl_mulai_kerja());
        System.out.println("Pendapatan    : Rp " + getPendapatan());
    
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(tgl_mulai_kerja, now);
        int totalHari = selisih.getYears() * 365 + selisih.getMonths() * 30 + selisih.getDays() + A;
    
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