class Intern extends Employee {
    private static final double MAX_SALARY = 20000; // max salary for an intern

    // Constructor for Intern class
    public Intern(String name, int age, double salary) {
        super(name, age, salary);
        setSalary(salary);  // Ensure the salary is validated when setting
    }

    // Override setSalary to ensure the salary is within the limit for Interns
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);  // Use the setter of Employee to set salary
        } else {
            super.setSalary(salary);  // Otherwise, set the salary as normal
        }
    }
}


