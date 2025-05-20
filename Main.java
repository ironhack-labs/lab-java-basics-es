public class Main {
    public static void main(String[] args) {
        int[] array = {8, 12, 23, 31, 14};

        int pequeño = Integer.MAX_VALUE;
        int masPequeño = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < pequeño) {
                masPequeño = pequeño;
                pequeño = array[i];
            } else if (array[i] < masPequeño && array[i] != pequeño) {
                masPequeño = array[i];
            }
        }

        System.out.println("El número más pequeño es: " + pequeño);
        System.out.println("El segundo más pequeño es: " + masPequeño);
    }
}

