// Nama file : Mahasiswa.java
// Deskripsi : Kelas yang merepresentasikan 
// Pembuat   : Johan Miracle Simanjuntak / 24060123120026 //
// Tanggal   : 26/02/2025

import java.util.ArrayList;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali; 
    private Kendaraan kendaraan;

    public Mahasiswa(String nama, String nim, String prodi, Dosen dosenWali, Kendaraan kendaraan){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<MataKuliah>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMataKuliah(MataKuliah mk){
        listMatKul.add(mk);
    }

    public void printMahasiswa(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang diambil : ");
        for(MataKuliah mk : listMatKul){
            mk.printMatKul();
        }
    }

    public static void main(String[] args) {
        Dosen d1 = new Dosen("APW", "12345", "Informatika");
        Kendaraan k1 = new Kendaraan("B 3175 ULF", "Motor");
        Mahasiswa m1 = new Mahasiswa("Paruda", "12345", "Informatika", d1, k1);
        MataKuliah mk1 = new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3);
        m1.addMataKuliah(mk1);
        m1.printMahasiswa();
    }
}