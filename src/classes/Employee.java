package classes;

public class Employee {
private String name;
private int age;
int salary;
private boolean universityGrade;

public Employee (String name, int age, int salary, boolean university) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    universityGrade = university;
}
//getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean isUniversityGrade() {
        return universityGrade;
    }
    public void setUniversityGrade(boolean universityGrade) {
        this.universityGrade = universityGrade;
    }
}
