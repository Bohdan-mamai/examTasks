package tasks.employee;

public class TestEmployee {
    public void createEmpoyees() {
        Employee employee = new Employee("Homer", "Simson");
        Employee employee1 = new Employee();

        employee.print();
        employee1.print();
    }
}
