class Intern extends Employee {
    private static final double MAX_SALARY = 20000; /* max salay is provided */

    public Intern(String name, int age, double salary) {
        super(name, age, salary); /* grabs name age and salary from superclass employee */
        validateSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        validateSalary(salary);
        super.setSalary(salary);
    }

    private void validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Salary for intern cannot exceed " + MAX_SALARY);
            /* we have used throw to have the code to print an error message is the salary exceed the allowed value */
        }
    }
}

