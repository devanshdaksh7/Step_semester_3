package oops.assigment_problems;

import java.util.Scanner;

class Employee {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompanyInformationManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee1 = new Employee("Divya", 65000);
        Employee employee2 = new Employee("Arjun", 40000);
        Employee employee3 = new Employee("Priya", 55000);

        System.out.println("3 Employee objects created");

        Employee.printCompanyInfo();

        scanner.close();
    }
}
