public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();

        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukan angka !!!");
        }
    }
}

// pada baris 12 tidak dapat dieksekusi, karena program langsung melempar eksepsi (throw new AngkaSialException()) saat angka == 13, 
// sehingga perintah setelahnya tidak dijalankan.
// sedangkan baris 21 dapat dieksekusi, karena blok catch menangkap eksepsi yang dilempar, dan semua 
// perintah di dalamnya akan dijalankan sebagai respons terhadap eksepsi.
