package tasks.employee;

public class TestEmployee {
    public void createEmployees() {
        Employee employee = new Employee("Bohdan", "Mamai");
        Employee employee1 = new Employee();

        employee.print();
        employee1.print();
    }
}
