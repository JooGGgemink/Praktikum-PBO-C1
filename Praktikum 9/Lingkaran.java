/* 
 * File   : Lingkaran.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Lingkaran 
 * Pembuat : Johan Miracle Simanjuntak /24060123120026
 * Tanggal : 14 Maret 2025
 */


public class Lingkaran extends BangunDatar{
    private double jari;

    public void setJari(double jari){
        this.jari = jari;
    }
    public double getJari(){
        return jari;
    }
    public Lingkaran(){
        setJmlSisi(0);
        setJari(0);
    }

    public Lingkaran(double jari){
        setJmlSisi(0);
        setJari(jari);
    }

    public Lingkaran(double jari, String warna, String border){
        setWarna(warna);
        setBorder(border);
        setJari(jari);
    }

    @Override
    public double getLuas(){
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling(){
        return 2*Math.PI*jari;
    }


    @Override
    public void printInfo(){
        System.out.println("****Lingkaran****");
        super.printInfo();
        System.out.println("Jari-jari : "+getJari());
    }

}