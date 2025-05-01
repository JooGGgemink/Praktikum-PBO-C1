public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Peluru Habis");
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void isiPeluru(int jumlahPeluru) {
        int peluruSebelumnya = senjata.getPeluru();
        senjata.setPeluru(peluruSebelumnya + jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("MENUSUK musuh");
        } else {
            System.out.println("Gagal, belum pasang bayonet");
        }
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
}