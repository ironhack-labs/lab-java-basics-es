package Ejercicio3_4;

public class Intern extends Employee{
    private static final double MAX_SALARY =20000.0;

    public Intern(int id, String name, String lastName, String department, int workingYears, double salary) {
        super(id, name, lastName, department, workingYears, validateSalary(salary));
    }

    private static double validateSalary(double salary){
        if (salary > MAX_SALARY){
            throw new IllegalArgumentException("El salario de un interno no debe superar los " + MAX_SALARY);
        }
        return salary;
    }
}
