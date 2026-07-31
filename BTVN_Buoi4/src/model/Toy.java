package model;

public class Toy {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Toy(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <=0) {
            System.out.println("Giá bán không hợp lệ!");
        }
        else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Số lượng không hợp lệ!");
        }
        else {
            this.quantity = quantity;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public double calculateDiscount() {
        return 0;
    }
    public void printInfo() {
        System.out.print("=== Toy Info ===\n");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}
