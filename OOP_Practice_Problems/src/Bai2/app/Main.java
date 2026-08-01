package Bai2.app;

import Bai2.model.Employee;
import Bai2.model.FullTimeEmployee;
import Bai2.model.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("001", "John", 7000000, 3000000),
                new PartTimeEmployee("002", "Cena", 36000, 360)
        };
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.getInfo();
            double salary = employee.calculateSalary();
            totalSalary += salary;
        }
        System.out.println("Tổng quỹ lương công ty: " + totalSalary);
    }
}
