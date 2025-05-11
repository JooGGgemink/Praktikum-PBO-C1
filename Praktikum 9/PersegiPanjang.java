public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public PersegiPanjang(double panjang, double lebar) {
        setPanjang(panjang);;
        setLebar(lebar);;
    }

    @Override
    public double getLuas(){
        return getPanjang() * getLebar();
    }

    @Override
    public double getKeliling(){
        return (2 * getPanjang()) + (2 * getLebar());
    }

    @Override
    public void printInfo() {
        System.out.println("Persegi Panjang");
    }
}