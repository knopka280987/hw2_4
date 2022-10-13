package transport;

import animals.*;

public class Main {
    public static void main(String[] args) {

            Car ladaGrande = new Car("Lada", "Grande", null, "желтый",
                    2015,"Россия", "механика", "седан", "A456NM657",
                    5, "летняя", 130, "дизель");
            Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                    2020, "Германия", "автомат", "седан", "K454OH2441",
                    5, "зимняя", null, "электричество");
            ladaGrande.infoOfVehicle();

            Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",301,
                    "Белорусский вокзал", "Минск-Пассажирский", 3500.0, 11, "дизель");
            Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270,
                    "Ленинградский вокзал", "Ленинградский-Пассажирский", 1700.0,8, "дизель");
            lastochka.infoOfVehicle();
            leningrad.infoOfVehicle();

            System.out.println();

            Bus schoolBus = new Bus("Школьный", "Ш-1", 2021, "Россия",
                    "желтый", 90, "бензин");
            Bus workBus = new Bus("Рабочий", "В-2", 2014, "Германия", "белый",
                    100, "дизель");
            Bus cityBus = new Bus("Городской", "Г-14", 2022, "Россия", "Синий",
                    80, "бензин");
            Bus touristBus = new Bus("Туристический", "Т-11", 2019, "Корея",
                    "оранжевый", 95, "дизель");
            Bus oldBus = new Bus("Старый", "Н-12", 2005, "Россия", null,
                    60, "дизель");

            System.out.println(schoolBus);
            System.out.println(workBus);
            System.out.println(cityBus);
            System.out.println(touristBus);
            System.out.println(oldBus);
            System.out.println();

            audiA8.refill();
            leningrad.refill();
            cityBus.refill();
    }
}




