package Ejercicios1_2;

public class Ejercicio1 {

    public static void  main(String[] args){

    /*1. Escribe un métodos en Java para obtener la diferencia entre el valor más grande y el más pequeño en un array de enteros.
    La longitud del array debe ser **1 o mayor**.
    Utiliza bucles y condicionales para desarrollar el algoritmo.*/

    int[] numbers = {2,5,14,75,68,35,8};

    // para saber el numero mas alto y el mas bajo:
        int highestNumber = numbers[0];
        int lowestNumber = numbers[0];
        for (int number : numbers){
            if (number > highestNumber){
                highestNumber = number;
            }if (number < lowestNumber){
                lowestNumber = number;

            }
        }
        System.out.println("El número más alto es de: " + highestNumber);
        System.out.println("El número más bajo es de: " + lowestNumber);

        // la diferencia
        System.out.println("La diferencia entre el valor mas alto y el mas bajo es de : " + (highestNumber-lowestNumber));

    }
}
