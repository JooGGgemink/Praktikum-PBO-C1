//Nama : Johan Miracle Simanjuntak
//NIM  : 24060123120026
public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        double ukt = fakultas.getTarifUKT();
        for (int i = 1; i < semester; i++) {
            ukt *= 0.95; // UKT berkurang 5% setiap semester
        }
        return ukt;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + ", NIM: " + NIM + ", Fakultas: " + fakultas.getNama());
        System.out.println("Email: " + email + ", Semester: " + semester + ", UKT: Rp" + Math.round(hitungUKT()));
    }
}