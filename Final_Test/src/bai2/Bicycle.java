package bai2;

import bai1.Manufacturer;
import bai1.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String id, Manufacturer manufacturer, String name, double price, int quantity) {
        super(id, manufacturer, name, price, quantity);
    }
    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * 0.15);
    }
}
