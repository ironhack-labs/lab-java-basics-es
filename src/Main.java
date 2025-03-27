import classes.Employee;
import classes.Intern;

import javax.naming.ldap.ManageReferralControl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] arg){

        //EXERCICE 1
        System.out.println("EXERCICE 1 ----");
        Integer[] numbers = {1, 2, 3, 4, 5};

        int max = numbers[0];
        for (int number : numbers)
            if (number > max) {
                max = number;
            }
        int min =numbers[0];
        for (int number : numbers)
            if (number < min){
                min = number;
            }
        int difference = max - min;
        System.out.println("The difference between the higher (" + max + ") and the lowest (" + min + ") number is " + difference);

        //EXERCICE 2
        System.out.println("EXERCICE 2 ------");
        Integer[] numbers2 = {-2, 5, 18, 20, -20};
        int smallest = numbers2[0];
        for  (int number2 : numbers2)
            if (number2 < smallest){
                smallest = number2;
            }
        int position = 0;

        for (int i = 0; i < numbers2.length; i++){
            if(numbers2[i] == smallest){ position = i;}
        }
        System.out.println("The lowest element is " + numbers2[position]);

        Integer[] result = new Integer[numbers2.length - 1];
        for (int j = 0, k = 0; j < numbers2.length; j++) {
            if (j != position) {
                result[k++] = numbers2[j];
            }
        }

        int smallest2 = result[0];
        for (int result1 : result)
            if (result1 < smallest2)
            {smallest2 = result1;}
        System.out.println("The second lowest element is " + smallest2);
    // EXERCICE 3
        System.out.println("EXERCICE 3 ---------");
        Intern intern1 = new Intern("Marc",28,23000,true,2);
        Intern intern2 = new Intern("Montserrat", 22, 18000, false,1);
        Intern intern3 = new Intern ("Paula", 25, 20000, true, 2);
        Intern intern4 = new Intern ("Buggy", 27, 19000, false, 7);
        Intern intern5 = new Intern ("Kate", 31, 21000, false, 10);
        Employee employee1 = new Employee("Rafa", 26, 25000, true);
        Employee employee2 = new Employee("Judit", 24, 35000, true);
        Employee employee3 = new Employee("Moha", 23, 26000, true);
        Employee employee4 = new Employee("Laura", 34, 32000,  true);
        Employee employee5 = new Employee("April", 22, 21000,false);



        List<Employee> people = new ArrayList<>();
        people.add(intern1);
        people.add(intern2);
        people.add(intern3);
        people.add(intern4);
        people.add(intern5);
        people.add(employee1);
        people.add(employee2);
        people.add(employee3);
        people.add(employee4);
        people.add(employee5);

        // loop to every employee
        for (Employee person : people) {
            System.out.print(person.getName() + " is " + person.getAge() + " years old, " );
            if (person.isUniversityGrade()){
                System.out.print("has an university degree,");}
            else {System.out.print("doesn't have an universtiy degree,");}
            if(person instanceof Intern){
                System.out.print("has " + ((Intern) person).getYearsExperience() + " years of experience ");
            }
            System.out.println("and has set a salary of: " + person.getSalary() + "€ per year");

        }
        //try to increase the salary over the limit of intern
        intern2.setSalary(20000);
        intern4.setSalary(23000);

        }


    }

