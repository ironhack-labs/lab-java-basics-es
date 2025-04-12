package Ejercicios1_2;

public class Ejercicio2 {
    public static void  main(String[] args){

    /*2. Escribe un metodo en Java para encontrar el elemento más pequeño y el segundo más pequeño de un array dado e imprimirlo en la consola.
    Utiliza bucles y condicionales para desarrollar el algoritmo.*/

        int[] numbers={ 2,6,98,54,34,22,1};

        int lowestNumber = Integer.MAX_VALUE;
        int secondLowestNumber = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < lowestNumber){
                secondLowestNumber = lowestNumber;
                lowestNumber = numbers[i];
            }else if(numbers[i] < secondLowestNumber && numbers [i] !=lowestNumber){
                secondLowestNumber=numbers[i];
            }
        }

        System.out.println("El numero mas pequeño es: " + lowestNumber);
        System.out.println("El segundo numero mas pequeños es: " + secondLowestNumber);
    }
}
