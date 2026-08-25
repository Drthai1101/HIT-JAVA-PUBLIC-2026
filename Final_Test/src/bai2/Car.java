package bai2;

import bai1.Manufacturer;
import bai1.Vehicle;

public class Car extends Vehicle {
    private boolean luxury;

    public Car( ) {
    }

    public Car(String id, Manufacturer manufacturer, String name, double price, int quantity, boolean luxury) {
        super(id, manufacturer, name, price, quantity);
        this.luxury = luxury;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }
    @Override
    public double getDiscountPrice() {
        return getPrice();
    }
    public void logLuxury() {
        if (isLuxury()) {
            System.out.println("Nhà sản xuất:");
            System.out.println(toString());
        }
        else {
            System.out.println("Không phải xe phân khúc sang trọng!");
        }
    }
}
