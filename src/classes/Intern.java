package classes;

public class Intern extends Employee{
        private int yearsExperience;
        private static final int maxSalary = 20000;

    public Intern(String name, int age, int salary, boolean university, int yearsExperience) {
        super(name, age, salary, university);
        this.yearsExperience = yearsExperience;
    if (salary > maxSalary){
        System.out.println("The salary exceed the limit for intern: " + name);
        System.out.println("Salary adjusted to: 20.000€");
        super.setSalary(maxSalary);}
    }
// if an intern wants to update his salary after being created, we enforce the rule of maxSalary
    @Override
    public void setSalary(int salary) {
        if (salary > maxSalary) {
            System.out.println(getName() + " salary exceeds the max limit for interns. Setting to " + maxSalary +"€ allowed");
            super.setSalary(maxSalary);
        } else {
            super.setSalary(salary);
            System.out.println(getName() + " salary have been updated to: " + salary +"€");
        }
    }
    //getter and setter new variable
    public int getYearsExperience(){return yearsExperience;}
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;}
    }

