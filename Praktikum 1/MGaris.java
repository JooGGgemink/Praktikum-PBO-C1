
/*
nama File   :   Mgaris.java
Deskripsi   :   Main dari garis
Pembuat     :   Johan Miracle Simanjuntak
Tanggal     :   22/02/2025
*/
public class MGaris {
    public static void main(String[]args){

        //bikin
        System.out.println("inisialisasi G1");
        Garis G1 = new Garis();
        G1.printgaris();
        System.out.println("inisialisasi G2");
        Garis G2 = new Garis(2, 4, 3, 3);
        G2.printgaris();
        
        System.out.println("***********************getter****************");
        //getter
        System.out.println("hasil gettitik1 dari G1 = "+G1.getTitik1().getAbsis()+", "+ G1.getTitik1().getOrdinat());
        System.out.println("hasil gettitik2 dari G1 = "+G1.getTitik2().getAbsis()+", "+ G1.getTitik1().getOrdinat());

        
        System.out.println("***********************counter garis**********************");
        //countergaris
        System.out.println("jumlah garis : "+ G1.getCountergaris());


        System.out.println("***********************setter*******************");
        //setter
        G1.setTitik1(2,3);
        G1.setTitik2(8, 4);
        System.out.println("inisialisasi G1 setelah Setter");
        G1.printgaris();


        System.out.println("***********************panjang garis*******************");
        //getpanjanggaris
        System.out.println("Panjang G1 : "+G1.getPanjangGaris());


        System.out.println("***********************gradien*******************");
        //getgradiengaris
        System.out.println("Gradien G1 : "+ G1.getGradienGaris());


        System.out.println("***********************Titik Tengah*******************");
        //titik teengah dimasukkan ke G3
        Titik G3 = G2.getTitikTengahGaris();
        G3.printTitik();


        System.out.println("***********************Sejajar*******************");
        //garis sejajar
        boolean Stat1= G1.isGarisSejajar(G2);
        System.out.println("apakah sejajar = "+Stat1);


        System.out.println("***********************Tegak Lurus*******************");
        //Tegak lurus
        boolean Stat2= G1.isGarisTegakLurus(G2);
        System.out.println("apakah tegak? = "+Stat2);


        System.out.println("***********************print garis*******************");
        //print garis 
        G1.printgaris();


        System.out.println("***********************print persamaan*******************");
        //print persamaan
        G1.printPersamaanGaris();

    }
}