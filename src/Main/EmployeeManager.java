package Main;
import java.util.List;
import java.util.ArrayList;

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateAndDisplayAllSalaries() {
        employees.forEach(employee -> System.out.println("Employee: " + employee.getName() +
                ", Monthly Salary:" + employee.calculateSalary()));
    }

    public void displayAllEmployeesInfo() {
        employees.forEach(System.out::println);
    }
}