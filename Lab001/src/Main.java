import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hired Staff Report + Salary details");
        System.out.println("-----------------------------------");

        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Marco", 35, 1900));
        employees.add(new Employee("Alino", 15, 2000));
        employees.add(new Employee("Giamma", 35, 1900));
        employees.add(new Intern("Wade", 40, 5000));
        employees.add(new Employee("Flo", 47, 5000));
        employees.add(new Intern("Tony", 24, 1300));
        employees.add(new Employee("Jons", 32, 1500));
        employees.add(new Intern("Luca", 21, 1000));
        employees.add(new Employee("Dani", 29, 1600));
        employees.add(new Intern("Nico", 23, 1500));

        // for-each loop that goes thru each Employee object in the array and prints info for each employee.
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Get the salary difference between highest and lowest salary
        double salaryDifference = getSalaryDifference(employees);
        System.out.println("Difference between highest and lowest salary is: " + salaryDifference);

        // Function to find the lowest salary and the second lowest salary in the employees array, an extra to test the code
        findSmallestAndSecondSmallestSalary(employees);
        System.out.println();

        System.out.println("---> Flaco Workload Management System brought to you by FlacoCorp Economy Division 🦆 <---");
        System.out.println("\"Ask not what your country can do for you – ask how many taxes you do owe to your country.\"");
        System.out.println("John Quackgerald Kennedy, 2025.");
    }

    // Method to calculate the salary difference between the highest and lowest salary
    public static double getSalaryDifference(List<Employee> employees) {
        double maxSalary = employees.get(0).getSalary();
        double minSalary = employees.get(0).getSalary();
        String maxSalaryName = employees.get(0).getName();
        String minSalaryName = employees.get(0).getName();

        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryName = employee.getName();
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryName = employee.getName();
            }
        }

        System.out.println("\nHighest salary paid is received by: " + maxSalaryName + ": " + maxSalary);
        System.out.println("Lowest salary is received by: " + minSalaryName + ": " + minSalary);
        return maxSalary - minSalary;
    }

    // This method looks for the lowest and second lowest salary from list of employees.
    public static void findSmallestAndSecondSmallestSalary(List<Employee> employees) {
        if (employees.size() < 1) {
            System.out.println("Error, there must be at least 1 employees listed.");
            return;
        }

        double smallestSalary = Double.MAX_VALUE;
        double secondSmallestSalary = Double.MAX_VALUE;
        String smallestSalaryName = "";
        String secondSmallestSalaryName = "";

        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if (salary < smallestSalary) {
                secondSmallestSalary = smallestSalary;
                secondSmallestSalaryName = smallestSalaryName;
                smallestSalary = salary;
                smallestSalaryName = employee.getName();
            } else if (salary < secondSmallestSalary && salary != smallestSalary) {
                secondSmallestSalary = salary;
                secondSmallestSalaryName = employee.getName();
            }
        }

        System.out.println("2nd lowest salary is paid to: " + secondSmallestSalaryName + ": " + secondSmallestSalary);
    }
}
