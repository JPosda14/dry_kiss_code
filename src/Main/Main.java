package Main;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding sample employees
        manager.addEmployee(new Employee("Julián", 19, 1200000));
        manager.addEmployee(new Employee("Toro", 19, 4000000));
        manager.addEmployee(new Employee("Maya", 17, 800000));
        manager.addEmployee(new Employee("Morita", 18, 100000));

        // Displaying salaries
        System.out.println("Calculating and displaying salaries:");
        manager.calculateAndDisplayAllSalaries();

        // Displaying all employees' info
        System.out.println("\nDisplaying all employees' info:");
        manager.displayAllEmployeesInfo();
    }
}