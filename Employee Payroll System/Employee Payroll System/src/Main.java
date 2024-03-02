import java.util.ArrayList;

abstract class Employee {
    private String Name;
    private int Id;

    public Employee(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee [Name= " + Name + ", Id= " + Id + ", Salary= " + calculateSalary() + "]";
    }
}

class FullTimeEmp extends Employee {
    private double monthlySalary;

    public FullTimeEmp(String Name, int id, double monthlySalary) {
        super(Name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmp extends Employee {
    private int hourswork;
    private double hoursRate;

    public PartTimeEmp(String Name, int Id, int hourswork, double hoursRate) {
        super(Name, Id);
        this.hourswork = hourswork;
        this.hoursRate = hoursRate;
    }

    public double calculateSalary() {
        return (hourswork * hoursRate);
    }
}

class payrollSystem {
    private ArrayList<Employee> EmployeeList; // creating the arraylist for store employee

    public payrollSystem() {
        EmployeeList = new ArrayList<>();
    }

    public void EmployeeAdd(Employee employee) { // add Employee
        EmployeeList.add(employee);
    }

    public void RemoveEmployee(int id) { // Removed Employee
        Employee employeeToRemove = null;
        for (Employee employee : EmployeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            EmployeeList.remove(employeeToRemove);
        }
    }

    public void displayAllEmployee() { // Display all employee
        for (Employee employee : EmployeeList) {
            System.out.println(employee);
        }
    }

    public void displayEmployee(int id) { // Display one specific employee.
        boolean found = false;
        for (Employee employee : EmployeeList) {
            if (employee.getId() == id) {
                System.out.println(employee);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        payrollSystem payrollsystem = new payrollSystem();

        FullTimeEmp emp1 = new FullTimeEmp("Rohit Sen", 1, 20000.00);
        FullTimeEmp emp2 = new FullTimeEmp("Arnab Ghosh", 2, 80000.00);
        PartTimeEmp emp3 = new PartTimeEmp("Souryam Sam", 3, 5, 100.00);
        PartTimeEmp emp4 = new PartTimeEmp("Tathagata Das", 4, 7, 50.00);

        payrollsystem.EmployeeAdd(emp1);
        payrollsystem.EmployeeAdd(emp2);
        payrollsystem.EmployeeAdd(emp3);
        payrollsystem.EmployeeAdd(emp4);
        payrollsystem.displayAllEmployee();
        System.out.println(" ");
        payrollsystem.RemoveEmployee(4);
        payrollsystem.displayAllEmployee();

    }
}
