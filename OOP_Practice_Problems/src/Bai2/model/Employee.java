package Bai2.model;

public abstract class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        setBaseSalary(baseSalary);
        setId(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Lương không hợp lệ!");
        }
        this.baseSalary = baseSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();
    public void getInfo() {
        System.out.println("=== Employee Info ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: " + getBaseSalary());
        System.out.println("Total Salary: " + calculateSalary());
    }
}
