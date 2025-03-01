// Nama file: Main.java
// Deskripsi: Program utama untuk menjalankan semua kelas yang telah dibuat
// Pembuat   : Johan Miracle Simanjuntak
// Tanggal   : 26/02/2025

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("Dr. Rismiyati", "12345", "Informatika");
        
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 3175 ULF", "Motor");
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Paruda", "24060123120026", "Informatika", dosen1, kendaraan1);
        
        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("IF5678", "Struktur Data", 3);
        
        // Menambahkan MataKuliah ke dalam Mahasiswa
        mahasiswa1.addMataKuliah(mk1);
        mahasiswa1.addMataKuliah(mk2);
        
        // Menampilkan informasi Mahasiswa
        mahasiswa1.printMahasiswa();
    }
}