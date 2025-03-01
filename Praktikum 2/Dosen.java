// Nama file : Dosen.java //
// Deskripsi : Kelas untuk merepresentasikan Dosen //
// Pembuat / Nim  : Johan Miracle Simanjuntak / 24060123120026 //
// Tanggal   : 26/02/2025 //

public class Dosen {
    private String nama;
    private String nip;
    private String prodi;

    public Dosen(String nama, String nip, String prodi){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    public String getNama(){
        return nama;
    }

    public String getNip(){
        return nip;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void printDosen(){
        System.out.println("Nama Dosen : " + nama);
        System.out.println("memiliki NIP : " + nip); 
        System.out.println("prodi : " + prodi);
    }
    
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Rismiyati", "12345", "Informatika");
        d1.printDosen();
    }
}