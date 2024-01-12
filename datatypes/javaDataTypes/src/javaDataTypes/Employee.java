package javaDataTypes;

public class Employee {

    String name;
    int salary;  

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void incrementSalary() {  
        salary = salary + 500;
        System.out.println(name + " salary has incremented to " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("divya", 75000);

        System.out.println("Information about " + e1.name + ":");
        e1.displayInfo();

        e1.incrementSalary();  

        Employee e2 = new Employee("Deepika", 80000);

        System.out.println("\n Information about " + e2.name + ":");
        e2.displayInfo();
    }
}
