package transport;


public class Bus extends Transport{

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String bodyColor, Integer maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed, fuel);
    }

    @Override
    public void refill() {
        System.out.println("Вид топлива для заправки автобуса " + getBrand() + ": " + getFuel());
    }
}