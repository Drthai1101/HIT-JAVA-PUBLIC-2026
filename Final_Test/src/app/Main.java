package app;


import bai1.Manufacturer;
import bai2.Bicycle;
import bai2.Car;
import bai2.Motorbike;

public class Main {
    public static void main(String[] args) {
        Manufacturer honda = new Manufacturer("01", "Honda", "Tokyo", "honda@mail.com");
        Manufacturer giant = new Manufacturer("02", "Giant", "New York", "giant@mail.com");
        Manufacturer mercedesBenz = new Manufacturer("03", "Mercedes-Benz", "HaNoi", "mercedesbenz@mail.com");

        Motorbike vision = new Motorbike("001", honda, "Vision", 250000, 12);
        Motorbike lead = new Motorbike("002", honda, "Lead", 350000, 24);

        Bicycle xedap1 = new Bicycle("003", honda, "Xedap1", 12000, 9);
        Bicycle xedap2 = new Bicycle("004", honda, "Xedap2", 15000, 7);

        Car mercedes1 = new Car("005", mercedesBenz, "mercedesBenz", 5000000, 2, true);
        Car honda2 = new Car("005", honda, "honda2", 4000000, 3, false);

    }
}