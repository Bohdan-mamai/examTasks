package tasks;

import tasks.employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Homer", "Simson");
        Employee employee1 = new Employee();

        employee.print();
        employee1.print();
    }
}
