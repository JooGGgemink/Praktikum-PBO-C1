public class Car extends vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        fare = fare - 100.00f;
        System.out.println("Car price: " + fare);
    }
}