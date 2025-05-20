public class intern extends Employee {
    public static final double MAX_SALARY = 20000.0;

    public intern() {
    }

    public intern(String name, String department, double salary) {
        super(name, department, salary);
        if (salary > MAX_SALARY) {
            System.out.println("El salario de un Intern no puede superar los " + MAX_SALARY + ". Se asignará el máximo permitido.");
            super.setSalary(MAX_SALARY);
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("El salario de un Intern no puede superar los " + MAX_SALARY + ". Se asignará el máximo permitido.");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
