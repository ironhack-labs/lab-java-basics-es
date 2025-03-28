class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor for the Employee class
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to represent the Employee as a string
    @Override
    public String toString() {
        return "Employee name= " + name + ", age= " + age + ", salary= " + salary;
    }
}
