public class Segitiga extends BangunDatar{
    private double sisi, tinggi; // asumsinya segitiga sama sisi

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public Segitiga(double sisi, double tinggi){
        setSisi(sisi);
        setTinggi(tinggi);
        setJmlSisi(3);
    }

    @Override
    public double getLuas(){
        return getSisi() * getTinggi();
    }

    @Override
    public double getKeliling(){
        return sisi * 3;
    }

    @Override
    public void printInfo(){
        System.out.println("Segitiga");
        super.printInfo();
    }
}