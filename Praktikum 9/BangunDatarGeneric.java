public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    public void set(T tipebangunDatar){
        bangunDatar = tipebangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.getKeliling();
    }
    
}