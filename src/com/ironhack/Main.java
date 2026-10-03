package com.ironhack;

import com.ironhack.arrays.ArrayUtils;
import com.ironhack.employees.Employee;
import com.ironhack.employees.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Entry point of the lab. Running this class walks through every task in order and prints
 * the result of each one in the console.
 */
public class Main {

    /** Width of the separator lines used to keep the console output readable. */
    private static final int SEPARATOR_WIDTH = 100;

    public static void main(String[] args) {
        runTaskOne();
        runTaskTwo();
        runTaskFive();
        runValidationDemo();
    }

    // --------------------------------------------------------------------- task 1

    /** Task 1 - difference between the largest and the smallest value of an array. */
    private static void runTaskOne() {
        printHeader("Task 1 - Difference between the largest and the smallest value");

        int[][] samples = {
                {40, 20, 60, 30, 10},   // regular case, expected 50
                {7},                    // single element, expected 0
                {-15, -3, -42, -8},     // only negative values, expected 39
                {5, 5, 5, 5}            // all equal, expected 0
        };

        for (int[] sample : samples) {
            System.out.printf("%-24s -> difference = %d%n",
                    toText(sample), ArrayUtils.differenceBetweenLargestAndSmallest(sample));
        }

        // The array must hold at least one element, so an empty one is rejected.
        try {
            ArrayUtils.differenceBetweenLargestAndSmallest(new int[0]);
        } catch (IllegalArgumentException exception) {
            System.out.println("[]                       -> rejected: " + exception.getMessage());
        }
    }

    // --------------------------------------------------------------------- task 2

    /** Task 2 - smallest and second smallest elements of an array. */
    private static void runTaskTwo() {
        printHeader("Task 2 - Smallest and second smallest elements");

        int[][] samples = {
                {40, 20, 60, 30, 10},   // expected 10 and 20
                {4, 1, 1, 9},           // duplicated minimum, expected 1 and 4
                {-7, -7, -7},           // all equal, no second distinct value
                {2, 1}                  // shortest array accepted, expected 1 and 2
        };

        for (int[] sample : samples) {
            System.out.println("Array: " + toText(sample));
            ArrayUtils.printSmallestAndSecondSmallest(sample);
            System.out.println();
        }
    }

    // --------------------------------------------------------------------- tasks 3, 4 and 5

    /** Task 5 - creates ten employees (interns included) and prints all of their properties. */
    private static void runTaskFive() {
        printHeader("Tasks 3, 4 and 5 - Ten employees with all of their properties");

        List<Employee> staff = buildStaff();

        for (Employee employee : staff) {
            System.out.println(employee);
        }

        System.out.printf(Locale.US, "%nTotal yearly payroll: %,.2f%n", totalPayroll(staff));
    }

    /**
     * Builds the ten employees of the demo: seven regular employees and three interns, all
     * stored in a {@code List<Employee>} to show that an {@link Intern} is also an
     * {@link Employee}.
     *
     * @return the list of ten employees
     */
    private static List<Employee> buildStaff() {
        List<Employee> staff = new ArrayList<>();

        staff.add(new Employee(1, "Ada Lovelace", "Engineering", "Software Engineer", 62_000));
        staff.add(new Employee(2, "Grace Hopper", "Engineering", "Principal Engineer", 95_000));
        staff.add(new Employee(3, "Alan Turing", "Research", "Research Lead", 88_500));
        staff.add(new Employee(4, "Margaret Hamilton", "Engineering", "Engineering Manager", 101_000));
        staff.add(new Employee(5, "Katherine Johnson", "Data", "Data Scientist", 74_250));
        staff.add(new Employee(6, "Linus Torvalds", "Platform", "Systems Engineer", 83_000));
        staff.add(new Employee(7, "Barbara Liskov", "Research", "Chief Scientist", 120_000));
        staff.add(new Intern(8, "Mia Fernandez", "Engineering", "Backend Intern", 18_000, "Ironhack"));
        staff.add(new Intern(9, "Noah Silva", "Data", "Data Intern", 20_000, "Universidad de Sevilla"));
        staff.add(new Intern(10, "Lia Moreau", "Platform", "QA Intern", 15_500, null));

        return staff;
    }

    /**
     * Adds up the salary of every employee of the list.
     *
     * @param staff the employees to add up
     * @return the total yearly payroll
     */
    private static double totalPayroll(List<Employee> staff) {
        double total = 0;
        for (Employee employee : staff) {
            total += employee.getSalary();
        }
        return total;
    }

    // --------------------------------------------------------------------- validation demo

    /** Shows the intern salary cap and the other guard clauses rejecting invalid data. */
    private static void runValidationDemo() {
        printHeader("Task 4 - The intern salary cap of " + String.format(Locale.US, "%,.2f", Intern.MAX_SALARY));

        // Case 1: the salary is above the cap at creation time.
        try {
            new Intern(11, "Over Paid", "Engineering", "Intern", 25_000, "Ironhack");
        } catch (IllegalArgumentException exception) {
            System.out.println("Creating an intern with 25,000 -> rejected: " + exception.getMessage());
        }

        Intern intern = new Intern(12, "Ana Ruiz", "Engineering", "Frontend Intern", 16_000, "Ironhack");
        System.out.println("Valid intern created            -> " + intern);
        System.out.printf(Locale.US, "Room left before the cap        -> %,.2f%n",
                intern.getRemainingSalaryAllowance());

        // Case 2: the salary goes above the cap on an update, and the object keeps its old value.
        try {
            intern.setSalary(30_000);
        } catch (IllegalArgumentException exception) {
            System.out.println("Updating the salary to 30,000   -> rejected: " + exception.getMessage());
            System.out.printf(Locale.US, "Salary left untouched           -> %,.2f%n", intern.getSalary());
        }

        // Case 3: a raise that would push the intern over the cap is rejected as well.
        try {
            intern.raiseSalary(50);
        } catch (IllegalArgumentException exception) {
            System.out.println("A 50% raise                     -> rejected: " + exception.getMessage());
        }

        // Case 4: a raise that stays under the cap is applied normally.
        intern.raiseSalary(10);
        System.out.printf(Locale.US, "A 10%% raise                     -> accepted, new salary %,.2f%n",
                intern.getSalary());

        // Case 5: a regular employee has no cap, only the shared rules of Employee.
        Employee employee = new Employee(13, "Hugo Prats", "Sales", "Account Executive", 48_000);
        employee.raiseSalary(12.5);
        System.out.printf(Locale.US, "Employee after a 12.5%% raise    -> %,.2f (monthly %,.2f)%n",
                employee.getSalary(), employee.getMonthlySalary());

        try {
            employee.setSalary(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println("A negative salary               -> rejected: " + exception.getMessage());
        }
    }

    // --------------------------------------------------------------------- console helpers

    /**
     * Prints a section title surrounded by separator lines.
     *
     * @param title the title to display
     */
    private static void printHeader(String title) {
        String separator = "=".repeat(SEPARATOR_WIDTH);
        System.out.println();
        System.out.println(separator);
        System.out.println(title);
        System.out.println(separator);
    }

    /**
     * Renders an array as {@code [1, 2, 3]} without relying on {@code Arrays.toString},
     * keeping the console output under the control of this class.
     *
     * @param numbers the array to render
     * @return the text representation of the array
     */
    private static String toText(int[] numbers) {
        StringBuilder text = new StringBuilder("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                text.append(", ");
            }
            text.append(numbers[i]);
        }
        return text.append("]").toString();
    }
}
