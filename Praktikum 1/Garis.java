
    /*
    nama File   :   Garis.java
    Deskripsi   :   Berisi atribut dan method dalam class garis
    Pembuat     :   Johan Miracle Simanjuntak
    Tanggal     :   22/02/2025
    */
    public class Garis {
        /**************Atribut***************/  
        Titik Titik1;
        Titik Titik2;
        static int countergaris = 0;
        /***************Method***********/
        //Konstruktor utk membuat garis//
    
        public Garis(){
            Titik1 = new Titik();
            Titik2 = new Titik(1,1);
            countergaris ++;
        }
    
        public Garis(double X1, double Y1, double X2, double Y2){
            Titik1 = new Titik(X1, Y1);
            Titik2 = new Titik(X2, Y2);
            countergaris ++;
        }
        
        //mengembalikan titik 1
        public Titik getTitik1() {
            return Titik1;
        }
    
        //mengembalikan titik 2
        public Titik getTitik2() {
            return Titik2;
        }
    
        //mengembalikan nilai counterGaris
        public static int getCountergaris() {
            return countergaris;
        }
    
        //memasang value titik 1
        public void setTitik1(double T1, double T2) {
            Titik1.Absis = T1;
            Titik1.Ordinat = T2;
        }
    
        //memasang value titik 2
        public void setTitik2(double T1, double T2) {
            Titik2.Absis = T1;
            Titik2.Ordinat = T2;
        }
    
        //mengembalikan panjang garis
        public double getPanjangGaris(){
            return Math.sqrt((Titik1.getAbsis()-Titik2.getAbsis())*(Titik1.getAbsis()-Titik2.getAbsis())) + ((Titik1.getOrdinat()-Titik2.getOrdinat())*(Titik1.getOrdinat()-Titik2.getOrdinat()));
        }
    
        //mengembalikan gradien garis
        public double getGradienGaris(){
            return (Titik2.getOrdinat()-Titik1.getOrdinat())/(Titik2.getAbsis()-Titik1.getAbsis());
        }
    
        //membuat titik baru untuk titik tengah dari garis
        public Titik getTitikTengahGaris(){
            double TempAbsis = (Titik1.getAbsis() + Titik2.getAbsis())/2;
            double TempOrdinat = (Titik1.getOrdinat() + Titik2.getOrdinat())/2;
            return new Titik(TempAbsis, TempOrdinat);
        }
    
        //mengembalikan hasil boolean jika kedua garis sejajar
        public boolean isGarisSejajar(Garis G){
            return (getGradienGaris() == G.getGradienGaris());
        }
    
        //mengembalikan hasil boolean jika kedua garis tegak lurus
        public boolean isGarisTegakLurus(Garis G){
            return (getGradienGaris() * G.getGradienGaris()) == -1;
        }
    
        //menampilkan titik awal dan akhir garis
        public void printgaris(){
            System.out.println("Titik Awal: (" + Titik1.getAbsis() + ", " + Titik1.getOrdinat() + "), (" + Titik2.getAbsis() + ", " + Titik2.getOrdinat() + ")");
        }
    
        //menampilkan persamaan garis dalam bantuk y = mx + c.
        public void printPersamaanGaris(){
            double temp = (Titik1.getOrdinat()-(getGradienGaris() * Titik1.getAbsis()));
            System.out.println("y = " + getGradienGaris() + "x + " + temp);
        }
    }