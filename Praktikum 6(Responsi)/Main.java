//Nama : Johan Miracle Simanjuntak
//NIM  : 24060123120026
public class Main {
    public static void main(String[] args) {
        Fakultas fakultasFSM = new Fakultas("Sains dan Matematika", 5000000, 7000000);
        Fakultas fakultasEK = new Fakultas("Ekonomi", 4000000, 6000000);

        Mahasiswa mhs1 = new Mahasiswa("Joseph", "joseph01@gmail.com", "123456", 6, fakultasFSM);
        Mahasiswa mhs2 = new Mahasiswa("Budiono Siregar", "budionosrgar@gmail.com", "654321", 2, fakultasEK);
        
        Dosen dosen1 = new Dosen("Prof.Messi", "messigoat@gmail.com", "789101", 5, fakultasFSM);
        Dosen dosen2 = new Dosen("Dr.Akeno", "akenosubarashi@gmail.com", "987654", 7, fakultasEK);
        
        Tendik tendik1 = new Tendik("Azril", "azrilganteng@gmail.com", "112233", 10);
        Tendik tendik2 = new Tendik("Andre", "andreaduhai@gmail.com", "223344", 8);

        mhs1.tampilkanInfo();
        dosen1.tampilkanInfo();
        tendik1.tampilkanInfo();
        System.out.println("\n===============================\n");
        mhs2.tampilkanInfo();
        dosen2.tampilkanInfo();
        tendik2.tampilkanInfo();
    }
}