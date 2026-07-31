package app;
import model.Toy;
import model.ElectronicToy;
import model.PlushToy;
public class Main {
    public static void main(String[] args) {
        Toy[] shop = {
                new Toy("001", "Lego", 100000, 123),
                new ElectronicToy("002", "Smart Robot", 3600000, 36, 12),
                new PlushToy("003", "Teddy Bear", 200000, 200, "Cotton")
        };
        for (Toy info : shop) {
            info.printInfo();
        }
    }
}