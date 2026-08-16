package model;

public class Smartphone {
    private static int totalPhones = 0;
    private String id;
    private String name;
    private double price;
    private int stock;
    private static double vatTax = 0.10;

    public Smartphone(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        totalPhones++;
        this.id = "SP" + totalPhones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Lỗi! Giá phải lớn hơn 0!");
        }
        else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Lỗi! Số lượng phải lớn hơn 0!");
        }
        else {
            this.stock = stock;
        }
    }

    public static int getTotalPhones() {
        return totalPhones;
    }

    public void printInfo() {
        System.out.println("=== SmartPhone Info ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    public String getId() {
        return id;
    }

    public static void setVatTax(double tax) {
        if ( tax < 0) {
            System.out.println("Khong hop le!");
        }
        else {
            Smartphone.vatTax = tax;
        }
    }
    public double getFinalPrice() {
        return price+ (price * vatTax);
    }
}
