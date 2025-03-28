public class Main {

    public static void main(String[] args) {

        int[] numeros = {12,44,55,32,6,7,24};

        System.out.println("------------Difference Numbers------------");
        differenceMaxMin(numeros);
        System.out.println();
        System.out.println();
        System.out.println("------------Two Minimun Numbers------------");
        twoMinimum(numeros);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------Show Employees and Interns------------");
        showEmployees();

    }

    public static void differenceMaxMin(int[] numeros) {

        int numMax = numeros[0];
        int numMin = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numMax) {
                numMax = numeros[i];
            }
            if (numeros[i] < numMin) {
                numMin = numeros[i];
            }
        }
        System.out.println("La diferencia en el el mayor numero del array y el menor es: "+ (numMax-numMin));
    }

    public static void twoMinimum (int [] numeros){

        int min1 = numeros[0];
        int min2 = numeros[1];

        if (min1 > min2) {
            min1 = numeros[1];
            min2 = numeros[0];
        }

        for (int i = 2; i < numeros.length; i++) {
            if (numeros[i] < min1) {
                min2 = min1;
                min1 = numeros[i];
            } else if (numeros[i] < min2) {
                min2 = numeros[i];
            }
        }

        System.out.println("El número más pequeño del array es: " + min1);
        System.out.println("El segundo número más pequeño del array es: " + min2);

    }


    public static void showEmployees () {

        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Matias", 35, 49000);
        employees[1] = new Employee("Jocelin", 36, 62000);
        employees[2] = new Employee("Woody", 28, 15000);
        employees[3] = new Employee("Fernando", 35, 50000);
        employees[4] = new Employee("Lucas", 40, 5000);
        employees[5] = new Intern("Joan", 29, 9000);
        employees[6] = new Intern("Xavi", 33, 7000);
        employees[7] = new Intern("Laura", 26, 31000);
        employees[8] = new Intern("Claudia", 38, 54000);
        employees[9] = new Intern("Veronica", 32, 3000);


        for (int i = 0; i < employees.length; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.println("Nombre: " + employees[i].getName());
            System.out.println("Edad: " + employees[i].getAge());
            System.out.println("Salario: " + employees[i].getSalary());
            System.out.println();

        }

    }

}
