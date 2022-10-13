package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer productionYear;
    private final String productionCountry;
    private String bodyColor;
    private Integer maxSpeed;
    private final String fuel;

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String bodyColor, Integer maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
        this.fuel = fuel;
    }
    public Transport(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setMaxSpeed(maxSpeed);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public Integer getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null ||bodyColor.isBlank()) {
            this.bodyColor = "синий";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == null || maxSpeed <= 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void infoOfVehicle() {
        System.out.println("Информация о транспортном средстве:");
    }

    public abstract void refill();
    @Override
    public String toString() {
        return "Транспортное средство {" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", год выпуска=" + productionYear +
                ", страна выпуска='" + productionCountry + '\'' +
                ", цвет='" + bodyColor + '\'' +
                ", макс. скорость=" + maxSpeed +
                '}';
    }
}
