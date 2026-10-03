package com.ironhack.employees;

import java.util.Locale;

/**
 * Task 3 - Represents an employee of the company.
 *
 * <p>State is kept private and reached only through getters and setters so that every write
 * goes through validation. The {@link #validateSalary(double)} hook is the extension point
 * subclasses use to tighten the salary rules (see {@link Intern}).</p>
 */
public class Employee {

    private int id;
    private String name;
    private String department;
    private String position;
    private double salary;

    /**
     * Creates a fully initialised employee.
     *
     * @param id         unique identifier of the employee; must be positive
     * @param name       full name; must not be {@code null} or blank
     * @param department department the employee belongs to; must not be {@code null} or blank
     * @param position   job title; must not be {@code null} or blank
     * @param salary     yearly gross salary; must respect the rules of {@link #validateSalary(double)}
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Employee(int id, String name, String department, String position, double salary) {
        // The setters are reused so that construction and later updates share the same rules.
        setId(id);
        setName(name);
        setDepartment(department);
        setPosition(position);
        setSalary(salary);
    }

    // --------------------------------------------------------------------- behaviours

    /**
     * Increases the salary by the given percentage.
     *
     * @param percentage percentage to apply, for example {@code 10} for a 10% raise;
     *                   must not be negative
     * @throws IllegalArgumentException if the percentage is negative or if the resulting
     *                                  salary breaks the validation rules of this employee
     */
    public void raiseSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("A raise cannot be negative: " + percentage);
        }
        setSalary(salary + (salary * percentage / 100));
    }

    /**
     * Returns the salary split into twelve equal monthly payments.
     *
     * @return the monthly salary
     */
    public double getMonthlySalary() {
        return salary / 12;
    }

    // --------------------------------------------------------------------- validation

    /**
     * Validates a salary before it is stored.
     *
     * <p>Subclasses override this method to add their own limits. It is safe to call from the
     * constructor because every implementation relies only on its arguments and on constants,
     * never on instance fields that may still be uninitialised.</p>
     *
     * @param salaryToValidate the candidate salary
     * @throws IllegalArgumentException if the salary is negative
     */
    protected void validateSalary(double salaryToValidate) {
        if (salaryToValidate < 0) {
            throw new IllegalArgumentException("The salary cannot be negative: " + salaryToValidate);
        }
    }

    /**
     * Validates a mandatory text field.
     *
     * @param value     the value to check
     * @param fieldName the field name, used to build a helpful error message
     * @return the trimmed value
     * @throws IllegalArgumentException if the value is {@code null} or blank
     */
    private static String requireText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("The " + fieldName + " must not be null or blank");
        }
        return value.trim();
    }

    // --------------------------------------------------------------------- getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("The id must be a positive number: " + id);
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = requireText(name, "name");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = requireText(department, "department");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = requireText(position, "position");
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Updates the salary after validating it.
     *
     * @param salary the new yearly gross salary
     * @throws IllegalArgumentException if the salary does not pass {@link #validateSalary(double)}
     */
    public void setSalary(double salary) {
        validateSalary(salary);
        this.salary = salary;
    }

    // --------------------------------------------------------------------- object contract

    /**
     * Returns every property of the employee on a single line, ready to be printed.
     *
     * @return a human readable description of this employee
     */
    @Override
    public String toString() {
        // Locale.US keeps the number formatting identical on every machine that runs the demo.
        return String.format(Locale.US,
                "%-10s id=%-3d name=%-18s department=%-12s position=%-22s salary=%,11.2f",
                getClass().getSimpleName(), id, name, department, position, salary);
    }
}
