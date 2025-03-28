public class Intern extends Employee {

    private static final double MaxSalary = 20000;

    public Intern(String name, int age, double salary) {
        super(name, age, salary);

        if (salary > MaxSalary) {
            this.setSalary(20000);
            System.out.println("--El salario de " + name + " ha sido ajustado a " + MaxSalary + " porque excedía el límite permitido para los internos.--");
            System.out.println("");
        } else{
            this.setSalary(salary);
        }
    }


}
