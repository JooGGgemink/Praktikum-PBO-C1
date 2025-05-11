public class Persegi extends BangunDatar{
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }

    public Persegi(double sisi) {
        setJmlSisi(4);
        setSisi(sisi);
    }

    @Override
    public double getLuas() {
        return getSisi() * getSisi() ;
    }

    @Override
    public double getKeliling() {
        return getSisi() * getJmlSisi();
    }

    @Override
    public void printInfo() {
        System.out.println("Persegi");
        super.printInfo();
        System.err.println("sisi: " +getSisi());
    }
}