public class Numbers {

    public static int getDifference(int[] numbers) {

        int smallest = getSmallest(numbers);
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest - smallest;
    }

    public static int getSmallest(int [] numbers){

        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];

            }
        }
        return smallest;
    }

    public static int getSecondSmallest(int [] numbers){

        int smallest = getSmallest(numbers);
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > smallest && numbers[i] < secondSmallest){
                secondSmallest = numbers [i];
            }

        }


        return secondSmallest;
    }
}