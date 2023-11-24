
import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', employees=" + employees + '}';
    }
}

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', employeeId=" + employeeId + '}';
    }
}

public class ObjectWithinObjectExample {
    public static void main(String[] args) {
        // Create a department
        Department hrDepartment = new Department("HR");

        // Add employees to the department
        hrDepartment.addEmployee(new Employee("Alice", 101));
        hrDepartment.addEmployee(new Employee("Bob", 102));
        hrDepartment.addEmployee(new Employee("Charlie", 103));

        // Display the department and its employees
        System.out.println(hrDepartment);
    }
}
