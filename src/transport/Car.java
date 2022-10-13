package transport;

import java.util.Objects;

public class Car extends Transport{
    public static class Key {
        private String keylessEntry;
        private String remoteEngineStart;

        public Key(String keylessEntry, String remoteEngineStart) {
            setKeylessEntry(keylessEntry);
            setRemoteEngineStart(remoteEngineStart);
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(String keylessEntry) {
            if (keylessEntry == null || keylessEntry.isBlank()) {
                this.keylessEntry = "Нет информации";
            } else {
                this.keylessEntry = keylessEntry;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "Нет информации";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
        }

        @Override
        public String toString() {
            return "Доступ к авто  через " + keylessEntry + ", доступ к двигателю через " + remoteEngineStart + ".";
        }
    }

    public static class Insurance {
        private Double duration;
        private double cost;
        private String number;

        public Insurance(Double duration, double cost, String number) {
            setDuration(duration);
            setCost(cost);
            setNumber(number);
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            if (duration == null || duration <= 0) {
                this.duration = 0.0;
            } else {
                this.duration = duration;
            }
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost <= 0 ? 10000 : cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            if (number.matches("[A-Z]{3}\\d{6}")) {
                this.number = number;
            } else {
                this.number = "Номер указан неверно";
            }
        }
        public void checkDuration() {
            if (duration == 0) {
                System.out.println("Вам необходимо оформить страховку!");
            }
        }

        @Override
        public String toString() {
            return "Срок действия страховки: " + duration + " год(а). Стоимость: " + cost + " рублей. Номер страховки: "
                    + number + ".";
        }
    }
    private Double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, Double engineVolume, String bodyColor, Integer productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tires, Integer maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, bodyColor,maxSpeed, fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setBodyType(bodyType);
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()){
            registrationNumber = "Нет информации";
        }
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Неверный формат номера";
        }
        setNumberOfSeats(numberOfSeats);
        setTires(tires);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5);
    }

    public String getTransmission() {
        return transmission;
    }


    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Нет информации";
        } else {
            this.transmission = transmission;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Нет информации";
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "Нет информации";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats =  numberOfSeats <= 0 ? 5 : numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        if (tires == null || tires.isEmpty() || tires.isBlank()) {
            this.tires = "Нет информации";
        } else {
            this.tires = tires;
        }
    }


    @Override
    public void infoOfVehicle() {
        super.infoOfVehicle();
        System.out.println(getBrand() + " " + getModel() + ". Год выпуска: " + getProductionYear() + ". Сборвка в " + getProductionCountry()
                + ". Цвет кузова: " + getBodyColor() + ". Объем двигателя: " + engineVolume + " литра. Коробка передач: " +
                transmission + ". Тип кузова: " + bodyType + ". Регистрационный номер: " + registrationNumber +
                ". Количество мест: " + numberOfSeats + ". Тип резины: " + tires + ". Макс.скорость: "
                + getMaxSpeed() + " км/час.");
    }
    @Override
    public void refill() {
        System.out.println("Вид топлива для заправки машины " + getBrand() + ": " + getFuel());
    }

}