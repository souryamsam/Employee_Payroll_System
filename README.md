# Employee_Payroll_System
It is a terminal based Employee Payroll System project using object oriented principles in Java.



Structure of this project
____________________________
1.Employee class (abstract):

Represents the base class for all types of employees.
It contains fields for the employee's name and ID.
Provides methods to get the name and ID of the employee.
Declares an abstract method calculateSalary() to be implemented by subclasses.
Overrides the toString() method to display employee details including calculated salary.

2.FullTimeEmp class (extends Employee):

Represents a full-time employee.
Inherits from the Employee class.
Contains a field for the monthly salary of the full-time employee.
Implements the calculateSalary() method specific to full-time employees.

3.PartTimeEmp class (extends Employee):

Represents a part-time employee.
Inherits from the Employee class.
Contains fields for the number of hours worked and the hourly rate.
Implements the calculateSalary() method specific to part-time employees.

4.payrollSystem class:

Manages the list of employees and provides methods to add, remove, and display employee details.
Contains an ArrayList to store Employee objects.
Provides methods EmployeeAdd(), RemoveEmployee(), displayAllEmployee(), and displayEmployee().
