public class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String gerak(){
        return "dia gerak";
    }

    public String bersuara(){
        return "dia bersuara";
    }

    public void printInfo() {
        System.out.println("Nama Anabul: " + getNama());
    }

}   