package management;


import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String NINumber, double salary, double budget) {
        super(name, NINumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}