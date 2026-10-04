//Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above. Use loops and conditionals to develop the algorithm.
//Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console. Use loops and conditionals to develop the algorithm.
//Create an Intern class that extends from Employee. All the Interns have a salary limit of 20000 (constant). You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.
//Write a program that creates 10 Employees and print it al the properties.
public static void main(String[] args) {
    System.out.println("Welcome to the Ironhack first Java Basics Lab!");
    System.out.println("Numbers excercise: ");
    int[] numbers = {100, 95, 30, 300, 480, 20, 10, 33, 45, 80, 15, 8, 28, 50, 75, 90, 120, 150, 200, 250};

    int difference = Numbers.getDifference(numbers);
    int smallest = Numbers.getSmallest(numbers);
    int secondSmallest = Numbers.getSecondSmallest(numbers);

    System.out.println("The difference between the largest and smallest values is: " + difference + ".");
    System.out.println("The smallest number is: " + smallest + ".");
    System.out.println("The second smallest number is: " + secondSmallest + ".");

    System.out.println("Employee excercise: ");

    Employee emp1 = new Employee("John Doe", 12345, 50000.00);
    System.out.println(emp1.toString());
    Employee emp2 = new Employee("Jane Smith", 67890, 60000.00);
    System.out.println(emp2.toString());
    Employee intern3 = new Intern("Alice Johnson", 54321, 15000.00, "Ironhack");
    System.out.println(intern3.toString());
    Employee emp4 = new Employee("Bob Brown", 98765, 70000.00);
    System.out.println(emp4.toString());
    Employee emp5 = new Employee("Charlie Davis", 24680, 65000.00);
    System.out.println(emp5.toString());
    Employee intern6 = new Intern("David Wilson", 13579, 21000.00, "California University");
    System.out.println(intern6.toString());
    Employee emp7 = new Employee("Eva Thompson", 86420, 80000.00);
    System.out.println(emp7.toString());
    Employee emp8 = new Employee("Frank Miller", 97531, 90000.00);
    System.out.println(emp8.toString());
    Employee intern9 = new Intern("Grace Lee", 11223, 10000.00, "Howarts School of Witchcraft and Wizardry");
    System.out.println(intern9.toString());
    Employee emp10 = new Employee("Henry Clark", 33445, 95000.00);
    System.out.println(emp10.toString());

}