package transport;

public class Train extends Transport {
    private Double cost;
    private Double travelTime;
    private String departureStationName;
    private String endingStationName;
    private Integer numbersOfWagons;



    public Train(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed,
                 String departureStationName,String endingStationName, Double cost, Integer numbersOfWagons, String fuel) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);
        setCost(cost);
        setDepartureStationName(departureStationName);
        setEndingStationName(endingStationName);
        setNumbersOfWagons(numbersOfWagons);

    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost <= 0 ? 3000 : cost;
    }

    public Double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Double travelTime) {
        if (travelTime == null || travelTime <=0) {
            this.travelTime = 1.5;
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName.isBlank()) {
            this.departureStationName = "Нет информации";
        } else {
            this.departureStationName = departureStationName;
        }
    }

    public String getEndingStationName() {
        return endingStationName;
    }

    public void setEndingStationName(String endingStationName) {
        if (endingStationName == null || endingStationName.isBlank()) {
            this.endingStationName = "Нет информации";
        } else {
            this.endingStationName = endingStationName;
        }
    }

    public Integer getNumbersOfWagons() {
        return numbersOfWagons;
    }

    public void setNumbersOfWagons(Integer numbersOfWagons) {
        if (numbersOfWagons == null || numbersOfWagons <=5) {
            this.numbersOfWagons = 15;
        } else {
            this.numbersOfWagons = numbersOfWagons;
        }
    }

    @Override
    public void infoOfVehicle() {
        super.infoOfVehicle();
        System.out.println("Поезд - " + getBrand() + ", модель: " + getModel() + ", " + getProductionYear() + " года, " +
                "страна - " + getProductionCountry() + ", макс.скорость - " + getMaxSpeed() + " км/час, ст. отправления - "
                + departureStationName + ", прибывает на станцию - " + endingStationName + ", цена билета составляет "
                + cost + " рублей, количество мест в вагоне - " + numbersOfWagons + ".");
    }

    @Override
    public void refill() {
        System.out.println("Вид топлива для заправки поезда " + getBrand() + ": " + getFuel());
    }
}