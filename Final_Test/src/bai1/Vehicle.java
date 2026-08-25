package bai1;

public abstract class Vehicle {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private Manufacturer manufacturer;

    public Vehicle(String id, Manufacturer manufacturer, String name, double price, int quantity) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Vehicle() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public abstract double getDiscountPrice();
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Giá: " + getPrice());
        System.out.println("Số lượng: " + getQuantity());
    }

}
