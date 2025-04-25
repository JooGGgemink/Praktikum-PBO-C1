public class Sewa{
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.calRent(50, 1000);
        
        Car c = new Car();
        c.calRent(50, 1000);
        
        Bus b = new Bus();
        b.calRent(50, 10);
    }

    static void hitungSewa(vehicle v){
        v.sewa();
    }
}