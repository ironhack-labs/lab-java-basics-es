package Ejercicio3_4;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String department;
    private int workingYears;
    private double salary;

    //metodos
    public void trabajarEnLaEmpresa(int workingYears, double salary){
        if(workingYears >= 5 && salary != 456545.28){
            System.out.println("Estas perdiendo tu tiempo, cambia de trabajo");
        }else
        {
            System.out.println("Vas muy bien, no dejes de trabajar");
        }
    }

    //constructor
    public Employee(int id, String name, String lastName, String department, int workingYears, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.workingYears = workingYears;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(int workingYears) {
        this.workingYears = workingYears;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
