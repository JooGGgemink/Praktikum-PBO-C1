public class MnKoleksi {
    public static void main(String[] args) {
        //kamus lokal
        Koleksi<String> k = new Koleksi<String>(5);
        String o;
        //algoritma
        k.add("A");
        k.add("B");
        k.add("C");
        k.add("D");
        k.add("E");
        k.showAll();

        System.out.println("Jumlah elemen: " + k.getSize());
        System.out.println("Index ke 3: " + k.getIsi(3));
        System.out.println("Mengisi index 3 dengan E");
        k.setIsi(3, "E");
        System.out.println("Index ke 3: " + k.getIsi(3));
        k.setSize(3);
        k.showAll();
        //delete
        System.out.println("Menghapus elemen terakhir");
        System.out.println("Jumlah elemen: " + k.getSize());
        o = k.delete();
        System.out.println("Elemen yang dihapus: " + o);
        k.showAll();
        System.out.println("Jumlah elemen: " + k.getSize());
    }
}