package bai2;

import bai1.Manufacturer;
import bai1.Vehicle;

public class Motorbike extends Vehicle {
    public Motorbike() {
    }

    public Motorbike(String id, Manufacturer manufacturer, String name, double price, int quantity) {
        super(id, manufacturer, name, price, quantity);
    }
    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * 0.1);
    }
}
