import java.time.LocalDate;
import java.time.Period;

// Superclass Pegawai
abstract class Pegawai {
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }
    
    public abstract double hitungTunjangan();
    public abstract LocalDate hitungBUP();
    
    public void printInfo() {
        System.out.println("NIP: " + NIP + "\nNama: " + nama + "\nTanggal Lahir: " + tanggalLahir + "\nTMT: " + TMT);
        System.out.println("Gaji Pokok: Rp " + gajiPokok + "\nMasa Kerja: " + hitungMasaKerja() + " tahun");
    }
}

// Dosen superclass
abstract class Dosen extends Pegawai {
    protected String fakultas;
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
}

// Dosen Tetap
class DosenTetap extends Dosen {
    private String NIDN;
    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }
    public double hitungTunjangan() { return 0.02 * hitungMasaKerja() * gajiPokok; }
    public LocalDate hitungBUP() { return tanggalLahir.plusYears(65).withDayOfMonth(1); }
    @Override public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN + "\nFakultas: " + fakultas + "\nBUP: " + hitungBUP() + "\nTunjangan: Rp " + hitungTunjangan());
    }
}

// Dosen Tamu
class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;
    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    public double hitungTunjangan() { return 0.025 * gajiPokok; }
    public LocalDate hitungBUP() { return tanggalBerakhirKontrak; }
    @Override public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK + "\nFakultas: " + fakultas + "\nKontrak Berakhir: " + hitungBUP() + "\nTunjangan: Rp " + hitungTunjangan());
    }
}

// Tendik
class Tendik extends Pegawai {
    private String bidang;
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    public double hitungTunjangan() { return 0.01 * hitungMasaKerja() * gajiPokok; }
    public LocalDate hitungBUP() { return tanggalLahir.plusYears(55).withDayOfMonth(1); }
    @Override public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang + "\nBUP: " + hitungBUP() + "\nTunjangan: Rp " + hitungTunjangan());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Pegawai[] pegawaiList = {
            new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika"),
            new DosenTamu("9654781245", "84937234", "Budi", LocalDate.of(1985, 8, 12), LocalDate.of(2020, 3, 1), 4000000, "Fakultas Teknik", LocalDate.of(2026, 3, 1)),
            new Tendik("987654321", "Siti", LocalDate.of(1980, 6, 10), LocalDate.of(2010, 5, 1), 3500000, "Kemahasiswaan")
        };
        for (Pegawai p : pegawaiList) {
            p.printInfo();
            System.out.println();
        }
    }
}