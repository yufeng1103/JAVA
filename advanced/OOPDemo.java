interface Payable {
    double calculatePay();
}

abstract class Employee {
    private final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee implements Payable {
    private final double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee implements Payable {
    private final double hourlyRate;
    private final int hours;

    public PartTimeEmployee(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Payable alice = new FullTimeEmployee("Alice", 12000);
        Payable bob = new PartTimeEmployee("Bob", 80, 60);

        printPay((Employee) alice, alice.calculatePay());
        printPay((Employee) bob, bob.calculatePay());
    }

    private static void printPay(Employee employee, double pay) {
        System.out.printf("%s 本月薪资: %.2f%n", employee.getName(), pay);
    }
}
