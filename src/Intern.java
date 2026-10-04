public class Intern extends Employee {

    private String school;
    private final double MAX_SALARY = 20000.00;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
        setSalary(salary); // Salario maximo 20.000
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }


    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", School= " + school + "]";
    }

}


