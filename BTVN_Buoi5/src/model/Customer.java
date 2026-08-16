package model;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.cart = new ArrayList<>();
        this.customerName = customerName;
    }
    public void addPhone(Smartphone phone) {
        cart.add(phone);
    }
    public void printCart() {
        for (Smartphone phone : cart) {
            phone.printInfo();
        }
    }
    public void removePhone(String id) {
        boolean found = false;

        for (int i = 0; i < cart.size(); i++) {
            Smartphone phone = cart.get(i);

            if (phone.getId().equals(id)) {
                cart.remove(i);
                System.out.println("Đã xóa " + phone.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tồn tại ID: " + id);
        }
    }
    public void removePhone(int index) {
        boolean found = false;

        for (int i = 0; i < cart.size(); i++) {
            Smartphone phone = cart.get(i);

            if (cart.indexOf(phone) == index) {
                cart.remove(i);
                System.out.println("Đã xóa " + phone.getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tồn tại Index: " + index);
        }
    }
    public ArrayList<Smartphone> getCart() {
        ArrayList<Smartphone> copyCart = new ArrayList<>(cart);
        return copyCart;
    }
    public double calculateTotalBill() {
        double totalBill = 0;
        for (Smartphone phone : cart) {
            totalBill += phone.getFinalPrice();
        }
        return totalBill;
    }
}
