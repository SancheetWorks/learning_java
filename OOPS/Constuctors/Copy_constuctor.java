class Employee{
    String name;
    double salary;
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor Called");
    }

    Employee(Employee emp){
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor Called");
    }

    void details(){
        System.out.println("Name: " + name + ", " + "Salary: " + salary);
    }
}





public class Copy_constuctor {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Sancheet", 50000);
        Employee obj2 = new Employee(obj1);
        obj1.details();
        obj2.details();
        obj2.name = "Tejas";
        obj1.details();
        obj2.details();

    }
}
