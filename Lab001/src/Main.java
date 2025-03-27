public class Main {
    public static void main(String[] args) {

        System.out.println("Hired Staff Report + Salary details");
        System.out.println("-----------------------------------");

        // Creating 10 employees with age + salary provided
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Marco", 35, 1900);
        employees[1] = new Employee("Alino", 15, 2000);
        employees[2] = new Employee("Giamma", 35, 1900);
        employees[3] = new Intern("Wade", 40, 5000);
        employees[4] = new Employee("Flo", 47, 5000);
        employees[5] = new Intern("Tony", 24, 1300);
        employees[6] = new Employee("Jons", 32, 1500);
        employees[7] = new Intern("Luca", 21, 1000);
        employees[8] = new Employee("Dani", 29, 1600);
        employees[9] = new Intern("Nico", 23, 1500);

        // Printing employee informations
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Method to calculate difference between higher and lower salary
        double salaryDifference = getSalaryDifference(employees);
        System.out.println("Difference between higher and lower salary is: " + salaryDifference);

        // Method to find difference between smallest and second smallest salary
        findSmallestAndSecondSmallestSalary(employees);
    }

    // Method to have highest and lowest salary difference
    public static double getSalaryDifference(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        double minSalary = employees[0].getSalary();
        String maxSalaryName = employees[0].getName();
        String minSalaryName = employees[0].getName();

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
        System.out.println();
        System.out.println("Highest salary paid is received by: " + maxSalaryName + ": " + maxSalary);
        System.out.println("Lowest salary is received by: " + minSalaryName + ": " + minSalary);
        return maxSalary - minSalary;
    }

    // Method to find smallest and second smallest salary
    public static void findSmallestAndSecondSmallestSalary(Employee[] employees) {
        if (employees.length < 1) {
            System.out.println("Error, there must be at least 1 employees listed.");
            return;
        }

        double smallestSalary = Double.MAX_VALUE;
        /* secondSmallestSalary value was not requested but i've added an extra to see if the action to math values works */
        double secondSmallestSalary = Double.MAX_VALUE;
        String smallestSalaryName = "";
        String secondSmallestSalaryName = "";

        /* cycle thru employee detail with else if method used*/
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
        System.out.println();
        System.out.println("FlacoCorp 2025");
        /* end
    }
}