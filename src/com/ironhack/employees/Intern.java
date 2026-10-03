package com.ironhack.employees;

import java.util.Locale;

/**
 * Task 4 - An {@link Employee} whose salary can never exceed {@link #MAX_SALARY}.
 *
 * <p>The limit is enforced by overriding {@link #validateSalary(double)}, the hook the parent
 * class calls from both its constructor and its {@code setSalary} method. That single override
 * therefore covers the two cases required by the lab: an intern created with a salary above the
 * cap, and an intern whose salary is updated above the cap afterwards.</p>
 */
public class Intern extends Employee {

    /** Maximum yearly gross salary an intern is allowed to earn. */
    public static final double MAX_SALARY = 20_000;

    /** Default school or university shown when none is provided. */
    private static final String UNKNOWN_SCHOOL = "Not specified";

    private String school;

    /**
     * Creates an intern.
     *
     * @param id         unique identifier; must be positive
     * @param name       full name; must not be {@code null} or blank
     * @param department department the intern belongs to; must not be {@code null} or blank
     * @param position   job title; must not be {@code null} or blank
     * @param salary     yearly gross salary; must be between {@code 0} and {@link #MAX_SALARY}
     * @param school     school or university the intern comes from; may be {@code null}
     * @throws IllegalArgumentException if any argument is invalid, in particular if the salary
     *                                  is above {@link #MAX_SALARY}
     */
    public Intern(int id, String name, String department, String position, double salary, String school) {
        super(id, name, department, position, salary);
        setSchool(school);
    }

    /**
     * Adds the intern salary cap on top of the validation inherited from {@link Employee}.
     *
     * @param salaryToValidate the candidate salary
     * @throws IllegalArgumentException if the salary is negative or above {@link #MAX_SALARY}
     */
    @Override
    protected void validateSalary(double salaryToValidate) {
        super.validateSalary(salaryToValidate);

        if (salaryToValidate > MAX_SALARY) {
            throw new IllegalArgumentException(String.format(
                    "An intern salary cannot exceed %.2f but %.2f was given", MAX_SALARY, salaryToValidate));
        }
    }

    /**
     * Returns how much room is left before the intern reaches the salary cap.
     *
     * @return the difference between {@link #MAX_SALARY} and the current salary
     */
    public double getRemainingSalaryAllowance() {
        return MAX_SALARY - getSalary();
    }

    public String getSchool() {
        return school;
    }

    /**
     * Updates the school, falling back to a readable default when no value is given.
     *
     * @param school school or university name; may be {@code null} or blank
     */
    public void setSchool(String school) {
        this.school = (school == null || school.trim().isEmpty()) ? UNKNOWN_SCHOOL : school.trim();
    }

    /**
     * Extends the parent description with the intern specific properties.
     *
     * @return a human readable description of this intern
     */
    @Override
    public String toString() {
        return super.toString()
                + String.format(Locale.US, " school=%-14s maxSalary=%,.2f", school, MAX_SALARY);
    }
}
