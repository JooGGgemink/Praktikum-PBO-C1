/* 
 * File   : BangunDatar.java
 * Deskripsi : program untuk mendefinisikan parent class BangunDatar 
 * Pembuat : Johan Miracle Simanjuntak /24060123120026
 * Tanggal : 14 Maret 2025
 */

 public abstract class BangunDatar {
     private int jmlSisi;
     private String warna;
     private String border;
     private static int counterBDatar = 0;
 
     public abstract double getLuas();
     public abstract double getKeliling();
 
     public boolean isEqualLuas(BangunDatar bd){
         return this.getLuas() == bd.getLuas();
     }
 
     public BangunDatar(){
         counterBDatar++;
     }
 
     public BangunDatar(int jmlSisi, String warna, String border){
         this.jmlSisi = jmlSisi;
         this.warna = warna;
         this.border = border;
         counterBDatar++;
     }
 
     public static void printCBD(){
         System.out.println("Jml Bangun Datar : "+counterBDatar);
     }
 
     public int getJmlSisi() {
         return jmlSisi;
     }
 
     public void setJmlSisi(int jmlSisi) {
         this.jmlSisi = jmlSisi;
     }
     public String getWarna() {
         return warna;
     }
     public void setWarna(String warna) {
         this.warna = warna;
     }
 
     public String getBorder() {
         return border;
     }
 
     public void setBorder(String border) {
         this.border = border;
     }
     
     public void printInfo(){
         System.out.println("Jumlah Sisi : "+jmlSisi);
         System.out.println("Warna : "+warna);
         System.out.println("Border : "+border);
         System.out.println("Jml BDatar : "+counterBDatar);
         System.out.println("Luas : "+getLuas());
         System.out.println("Keliling : "+getKeliling());
     }
 
     /*
      * keyword final pada class membuat class tersebut tidak bisa diwariskan
      * keyowrd final pada method membuat method tidak bisa dioverride di subclassnya
      */
 }