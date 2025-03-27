import employer.Employer;
import employer.Intern;

public class Main {
    public static void main( String[] args){
        //Array que vamos a utilizar en nuestro ejercicios tareas 1, 2.
        int[] enteros = new int[5];
        enteros[0] = 12;
        enteros[1] = 3;
        enteros[2] = 98;
        enteros[3] = 53;
        enteros[4] = 88;

        //Creación de employers para tareas 3, 4, 5.
        Employer [] employers = new Employer[10];

        employers[0] = new Employer("María", 24, 32700, 6 , "Front end" , 0);
        employers[1] = new Employer("Juan", 35, 36000, 17, "Senior Data base" , 1);
        employers[2] = new Employer("Pedro", 22, 35500,4 , "RRHH" ,2 );
        employers[3] = new Employer("Sandra", 43, 34300, 25 , "General Manager" ,3 );
        employers[4] = new Employer("Jenifer", 33, 34000, 12 , "Lead Back end" ,4 );
        employers[5] = new Employer("Manel", 45, 38000, 2 , "Junior Security" ,5 );

        //creación de Intern
        employers[6] = new Intern("Marcos", 18, 15000, 2 , "Junior Data Base" ,6);
        employers[7] = new Intern("Alejandra", 20, 20000 , 2 , "Support Java",7 );
        employers[8] = new Intern("José", 31, 18000 , 5 , "Development JavaScript" ,8);
        employers[9] = new Intern("Isabel", 22, 19000 , 3, "Junior Back end", 9);


        Main main = new Main();
        main.calcularDiferencia(enteros);
        main.encontrarElementos(enteros);
        main.createTenEmployer(employers);

    }
    //-----------------------------
    //tarea 1. Escribe un método en Java para obtener la diferencia
    // entre el valor más grande y el más pequeño en un array de enteros.
    // La longitud del array debe ser 1 o mayor. Utiliza bucles y
    // condicionales para desarrollar el algoritmo.
    public void calcularDiferencia(int[] enteros){
        System.out.println("Tarea 1.");

        int indeceArrayMayor = enteros[0];
        int indiceArrayMenor = enteros[0];

        for(int entero : enteros){
            //System.out.println(entero);

            if(entero > indeceArrayMayor){
                indeceArrayMayor = entero;
                System.out.println("Indice mayor del array: " +indeceArrayMayor);

            }
            else if(entero < indiceArrayMenor){
                indiceArrayMenor = entero;
                System.out.println("Indice menor del array : " + indiceArrayMenor);
            }
        }
        System.out.println("Diferencia entre el indice menor y el indice mayor: " + (indeceArrayMayor - indiceArrayMenor));
    }
        //-----------------------------
    //Tarea 2. Escribe un método en Java para encontrar el elemento más pequeño
    // y el segundo más pequeño de un array dado e imprimirlo en la consola.
    // Utiliza bucles y condicionales para desarrollar el algoritmo.
    public void encontrarElementos(int[] enteros) {
        System.out.println("\nTarea 2.");


        int firstElementLow, secondElementLow;

        if (enteros[0] < enteros[1]){
            firstElementLow = enteros[0];
            secondElementLow = enteros[1];
        }else {
            firstElementLow = enteros[1];
            secondElementLow = enteros[0];
        }
        
        for(int i = 2; i < enteros.length; i++){

            if (enteros[i] < firstElementLow){
                secondElementLow = firstElementLow;
                firstElementLow = enteros[i];

            }
        }
        System.out.println("El valor del elemento más bajo es " + firstElementLow);
        System.out.println("El valor del segundo elemento más bajo es "+ secondElementLow +"\n");
    }
    //Tarea 5
    public void createTenEmployer(Employer[] employers){
        System.out.println("Tare 5. Escribir un programa que cree 10 empleados y muestre todas sus propiedades.");

        int idBuscado = 9;
        double subidaSalario = 50100;

        //Mostrar por consola empleados y sus datos
        System.out.println("Trabajadores de la empresa  IT S.l.\n");

        for(Employer employer : employers){
            System.out.println("ID: " + employer.getId() + " - " + employer.getName() + " de " + employer.getAge() + " años, salario -> " + employer.getSalary() + "€.");

            if(employer instanceof Intern){
                Intern intern = (Intern) employer;

                if(intern.getId() == idBuscado){
                    double nuevoSalario = intern.getSalary() + subidaSalario;

                    if (nuevoSalario > intern.getMAXSALARY()){
                    System.out.println("\nEl salario actual de " + employer.getName() + " es de " + ((Intern) employer).getMAXSALARY() + "€," + " es el máximo permitido para un Intern." );

                    }else{
                        //Si el salario no supera los 20000€ anuel, dejara sumar la cantidad sin superar
                        intern.setSalary(nuevoSalario);
                        System.out.println("\nEl nuevo salario de " + employer.getName() + " es " + intern.getSalary() + "€.");

                    }
                }
            }

        }
    }
}
