package Bai2.model;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
