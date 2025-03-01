// Nama file : Kendaraan.java //
// Deskripsi : Kelas untuk merepresentasikan Kendaraan //
// Pembuat   : Johan Miracle Simanjuntak / 24060123120012 //
// Tanggal   : 26/02/2025

public class Kendaraan {
    private String noPlat;
    private String jenis; // Jenis berupa "Motor" atau "Mobil"

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}