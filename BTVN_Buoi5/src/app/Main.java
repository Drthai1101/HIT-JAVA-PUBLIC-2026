package app;

import model.Customer;
import model.Smartphone;
import model.Store;

public class Main {
    public static void main(String[] args){
        Smartphone p1 = new Smartphone("IphoneXs", 12, 9);
        Smartphone p2 = new Smartphone("AndroidProMax", 10, 10);
        Smartphone p3 = new Smartphone("XiaomiPlus", 11, 12);
        Smartphone p4 = new Smartphone("Iphone 15", 200, 15);

        Store store = new Store();

        Customer cs1 = new Customer("Nam");
        store.addPhoneToStore(p1);
        store.addPhoneToStore(p2);
        store.addPhoneToStore(p3);
        store.addPhoneToStore(p4);

        store.sellPhone(cs1, "SP4");
        store.sellPhone(cs1, "SP1");

        System.out.println("------- VAT = 10% -------");
        System.out.println("Tổng tiền khách hàng: " + cs1.calculateTotalBill());
        System.out.println("Giá trị kho: " + store.calculateInventoryValue());

        Smartphone.setVatTax(0.08);

        System.out.println("------- VAT = 8% -------");
        System.out.println("Tổng tiền khách hàng: " + cs1.calculateTotalBill());

        System.out.println("Giá trị kho: " + store.calculateInventoryValue());

    }
}