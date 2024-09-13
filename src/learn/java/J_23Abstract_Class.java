package learn.java;

abstract class Employee2 {
    String name;
    double salary;
    int leaves;

    // Constructor
    Employee2(String name, double salary, int leaves) {
        this.name = name;
        this.salary = salary;
        this.leaves = leaves;
    }

    // Abstract methods
    abstract void incrementSalary();
    abstract void incrementLeaves();
}

class Developmen extends Employee2 {
    // Constructor
    Developmen(String name, double salary, int leaves) {
        super(name, salary, leaves);
    }

    // Implementing abstract methods
    @Override
    void incrementSalary() {
        salary += 5000; // Example increment logic
        System.out.println(name + "'s new salary (Development): " + salary);
    }

    @Override
    void incrementLeaves() {
        leaves += 5; // Example increment logic
        System.out.println(name + "'s new leaves (Development): " + leaves);
    }
}

class DevOp extends Employee2 {
    // Constructor
    DevOp(String name, double salary, int leaves) {
        super(name, salary, leaves);
    }

    // Implementing abstract methods
    @Override
    void incrementSalary() {
        salary += 7000; // Example increment logic
        System.out.println(name + "'s new salary (DevOps): " + salary);
    }

    @Override
    void incrementLeaves() {
        leaves += 3; // Example increment logic
        System.out.println(name + "'s new leaves (DevOps): " + leaves);
    }
}

public class J_23Abstract_Class {

    public static void main(String[] args) {
        Employee2 dev1 = new Developmen("Alice", 50000, 20);
        Employee2 devOps1 = new DevOp("Bob", 60000, 15);

        dev1.incrementSalary();
        dev1.incrementLeaves();

        devOps1.incrementSalary();
        devOps1.incrementLeaves();
    }
}
