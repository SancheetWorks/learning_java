
class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary;
    }

    public void details() {
        System.out.println("Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void details() {
        System.out.println("Full time Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void details() {
        System.out.println("Part time Employee: " + name + ", Salary: " + calculateSalary());
    }
}

class TemporaryEmployee extends Employee {

    int daysWorked;
    double dailyrate;

    @Override
    public double calculateSalary() {
        return daysWorked * dailyrate;
    }

    @Override
    public void details() {
        System.out.println("Temporary Employee: " + name + ", Salary: " + calculateSalary());
    }
}

public class OverRiding_example {

    public static void main(String[] args) {
        FullTimeEmployee obj = new FullTimeEmployee();
        obj.name = "Sancheet";
        obj.baseSalary = 10000.00;
        obj.bonus = 400;
        obj.calculateSalary();
        obj.details();

        PartTimeEmployee obj2 = new PartTimeEmployee();
        obj2.name = "Tejas";
        obj2.hoursWorked = 12;
        obj2.hourlyRate = 600.00;
        obj2.calculateSalary();
        obj2.details();

        TemporaryEmployee obj3 = new TemporaryEmployee();
        obj3.name = "Satej";
        obj3.daysWorked = 13;
        obj3.dailyrate = 2000.00;
        obj3.calculateSalary();
        obj3.details();
    }
}
