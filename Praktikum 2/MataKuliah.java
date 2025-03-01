// Nama file : MataKuliah.java //
// Deskripsi : Kelas untuk merepresentasikan Mata Kuliah //
// Pembuat   : Johan Miracle Simanjuntak / 24060123120026 //
// Tanggal   : 26/02/2025 //
public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println("ID Mata Kuliah : " + idMatKul);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
    }

    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3);
        mk1.printMatKul();
    }
    
        
}