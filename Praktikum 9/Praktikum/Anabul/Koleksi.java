public class Koleksi<T> {
    private T[] wadah;
    private int nbElm;

    @SuppressWarnings("unchecked")
    public Koleksi(int size) {
        wadah = (T[]) new Object[size];
        nbElm = 0;
    }

    public void setSize(int nbElm) {
        this.nbElm = nbElm;
    }

    public int getSize() {
        return nbElm;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbElm) {
            return wadah[index];
        } else {
            return null;
        }
    }

    public void setIsi(int index, T isi) {
        if (index >= 0 && index < nbElm) {
            wadah[index] = isi;
        }
    }

    public void add(T isi) {
        if (nbElm < wadah.length) {
            wadah[nbElm] = isi;
            nbElm++;
        } else {
            System.out.println("Koleksi sudah penuh");
        }
    }

    public T delete() {
        //kamus lokal
        T isi;
        //algoritma
        if (nbElm > 0) {
            nbElm--;
            isi = wadah[nbElm];
            wadah[nbElm] = null;
            return isi;
        } else {
            System.out.println("Koleksi sudah kosong");
            return null;
        }
    }

    public void showAll(){
        //kamus lokal
        int i;
        //algoritma
        if (nbElm > 0) {
            for (i = 0; i < nbElm; i++) {
                System.out.println(getIsi(i) + " ");
            }
        } else {
            System.out.println("Koleksi sudah kosong");
        }   
    }


}