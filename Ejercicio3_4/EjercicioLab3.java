package Ejercicio3_4;

public class EjercicioLab3 {
    public static void main (String[] args){

        Employee empleado1 = new Employee(3476,"Maria","Perez","HR", 3,32876.25);
        Employee empleado2 = new Employee(2761,"Pedro", "Gonzales", "Management", 10, 59300.85);
        Employee empleado3 = new Employee(1693,"Carlota", "Rodriguez","Development", 7, 37866.01);
        Employee empleado4 = new Employee(3465,"Carolina", "Martinez","HR", 2, 33005.32);
        Employee empleado5 = new Employee(2110,"Sergio", "Puig","Logistic", 1, 37866.01);
        Employee empleado6 = new Employee(6792,"Mariana", "Mendosa","Development", 4, 35436.29);
        Employee empleado7 = new Employee(9664,"Daniel", "Fernandez","Operations", 3, 37221.76);
        Employee empleado8 = new Employee(1234,"Antonia", "Lopez","CEO", 20, 123328.05);
        Employee empleado9 = new Employee(2671,"Aaron", "Gimenez","Regional Management", 2, 45826.47);
        Employee empleado10 = new Employee(3977,"Alejandro", "Herrera","Support", 6, 42706.93);

        System.out.println("Empleado1: " + empleado1.getName() + " " + empleado1.getLastName() + " con ID: " + empleado1.getId() + " lleva " + empleado1.getWorkingYears() + " años ocupando la posicion de " + empleado1.getDepartment() + " por lo que su salario es de: " + empleado1.getSalary() + " Euros");
        System.out.println("Empleado2: " + empleado2.getName() + " " + empleado2.getLastName() + " con ID: " + empleado2.getId() + " lleva " + empleado2.getWorkingYears() + " años ocupando la posicion de " + empleado2.getDepartment() + " por lo que su salario es de: " + empleado2.getSalary() + " Euros");
        System.out.println("Empleado3: " + empleado3.getName() + " " + empleado3.getLastName() + " con ID: " + empleado3.getId() + " lleva " + empleado3.getWorkingYears() + " años ocupando la posicion de " + empleado3.getDepartment() + " por lo que su salario es de: " + empleado3.getSalary() + " Euros");
        System.out.println("Empleado4: " + empleado4.getName() + " " + empleado4.getLastName() + " con ID: " + empleado4.getId() + " lleva " + empleado4.getWorkingYears() + " años ocupando la posicion de " + empleado4.getDepartment() + " por lo que su salario es de: " + empleado4.getSalary() + " Euros");
        System.out.println("Empleado5: " + empleado5.getName() + " " + empleado5.getLastName() + " con ID: " + empleado5.getId() + " lleva " + empleado5.getWorkingYears() + " años ocupando la posicion de " + empleado5.getDepartment() + " por lo que su salario es de: " + empleado5.getSalary() + " Euros");
        System.out.println("Empleado6: " + empleado6.getName() + " " + empleado6.getLastName() + " con ID: " + empleado6.getId() + " lleva " + empleado6.getWorkingYears() + " años ocupando la posicion de " + empleado6.getDepartment() + " por lo que su salario es de: " + empleado6.getSalary() + " Euros");
        System.out.println("Empleado7: " + empleado7.getName() + " " + empleado7.getLastName() + " con ID: " + empleado7.getId() + " lleva " + empleado7.getWorkingYears() + " años ocupando la posicion de " + empleado7.getDepartment() + " por lo que su salario es de: " + empleado7.getSalary() + " Euros");
        System.out.println("Empleado8: " + empleado8.getName() + " " + empleado8.getLastName() + " con ID: " + empleado8.getId() + " lleva " + empleado8.getWorkingYears() + " años ocupando la posicion de " + empleado8.getDepartment() + " por lo que su salario es de: " + empleado8.getSalary() + " Euros");
        System.out.println("Empleado9: " + empleado9.getName() + " " + empleado9.getLastName() + " con ID: " + empleado9.getId() + " lleva " + empleado9.getWorkingYears() + " años ocupando la posicion de " + empleado9.getDepartment() + " por lo que su salario es de: " + empleado9.getSalary() + " Euros");
        System.out.println("Empleado10: " + empleado10.getName() + " " + empleado10.getLastName() + " con ID: " + empleado10.getId() + " lleva " + empleado10.getWorkingYears() + " años ocupando la posicion de " + empleado10.getDepartment() + " por lo que su salario es de: " + empleado10.getSalary() + " Euros");

        empleado5.setDepartment("Operations");
        empleado6.setSalary(38453.54);

        Intern intern1 = new Intern(10001,"Marieta", "Rodriguez", "Intern1", 0, 21022.25);
        System.out.println("Intrno 1: " + intern1.getName() + " " + intern1.getLastName() + " con ID: " + intern1.getId() + " lleva " + intern1.getWorkingYears() + " años ocupando la posicion de " + intern1.getDepartment() + " por lo que su salario es de: " + intern1.getSalary() + " Euros");

        Intern intern2 = new Intern(10002,"Gonzalo", "Medina", "Intern2", 0, 20987.20);
        System.out.println("Intrno 2: " + intern2.getName() + " " + intern2.getLastName() + " con ID: " + intern2.getId() + " lleva " + intern2.getWorkingYears() + " años ocupando la posicion de " + intern2.getDepartment() + " por lo que su salario es de: " + intern2.getSalary() + " Euros");
    }
}
