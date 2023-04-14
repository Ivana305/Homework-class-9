package HwClass9;

public class task7 {
    public static void main(String[] args) {
        //
        //        From an array of integer elements find the largest number.
        int[] numbers = {15, 20, 57, 41, 30};
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }}
            System.out.println(largest);


        }

    }
