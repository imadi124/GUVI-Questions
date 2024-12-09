# OOPs Features & Interface

# Problem Statement
Implement an interface Employee with methods calculateSalary and getDetails. Create two classes FullTimeEmployee and PartTimeEmployee that implement this interface. Each class should have its own way of calculating salary.

# Description
Define an interface Employee with methods double calculateSalary() and String getDetails().
Create a class FullTimeEmployee with properties name (String), monthlySalary (double) and implement the interface methods.
Create a class PartTimeEmployee with properties name (String), hourlyRate (double), and hoursWorked (int) and implement the interface methods.
Ensure each class has a constructor to initialize its properties.

# Input Format
String representing the employee type (FullTimeEmployee or PartTimeEmployee).
If FullTimeEmployee, a string for name and a double for monthlySalary.
If PartTimeEmployee, a string for name, a double for hourlyRate, and an integer for hoursWorked.
# Output Format
String representing the employee details.
Double representing the calculated salary.

# Sample Input 1:
FullTimeEmployee
John
3000.0
# Sample Output 1:
Name: John, Salary: 3000.0

# Sample Input 2:
PartTimeEmployee
Jane
15.0
120
# Sample Output 2:
Name: Jane, Salary: 1800.0
