package model;

import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory;

    public Store() {
        this.inventory = new ArrayList<>();
    }
    public void addPhoneToStore(Smartphone phone) {
        inventory.add(phone);
    }
    public Smartphone search(String id) {
        for (Smartphone phone : inventory) {
            if (phone.getId().equals(id)) {
                return phone;
            }
        }
        return null;
    }
    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>(inventory);
        for (Smartphone phone : inventory) {
            if (phone.getPrice() <= maxPrice && phone.getPrice() >= minPrice) {
                result.add(phone);
            }
        }
        return result;
    }
    public ArrayList<Smartphone> search(String keyword, boolean isName) {
        ArrayList<Smartphone> result = new ArrayList<>(inventory);
        for (Smartphone phone : inventory) {
            if (phone.getName().equals(keyword)) {
                result.add(phone);
            }
        }
        return result;
    }

    public void sellPhone(Customer customer, String phoneId) {
        Smartphone phone = search(phoneId);
        if (phone == null) {
            System.out.println("Không tồn tại!");
            return;
        }
        System.out.println("Đã tìm thấy " + phone.getName() + " - Stock: " + phone.getStock());
        if (phone.getStock() > 0) {
            System.out.println("Đã thêm vào giỏ hàng: " + phone.getName());
            phone.setStock(phone.getStock() -1);
            System.out.println("Stock: " + phone.getStock());
            customer.addPhone(phone);
        }
        else {
            System.out.println("Đã hết hàng!");
        }
    }

    public double calculateInventoryValue() {
        double finalValue = 0;
        for (Smartphone phone : inventory) {
            finalValue += phone.getFinalPrice() * phone.getStock();
        }
        return finalValue;
    }
}
