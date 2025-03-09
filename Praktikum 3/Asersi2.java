class lingkaran {
    private double jarijari;
    public lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungkeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2{
    public static void main (String[] args){
        double jarijari = 0;
        assert(jarijari>0):"jari jari tidak boleh no !!!";
        lingkaran l = new lingkaran(jarijari);
        double kelilinglingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilinglingkaran);
    }
}