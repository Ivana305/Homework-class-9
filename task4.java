package HwClass9;

public class task4 {
    public static void main(String[] args) {
        // Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
        String[] cars = {"audi", "toyota", "ferrari", "bugatti", "bentley"};
        for (String x:cars){
            System.out.print(x+" ");
        }
        System.out.println();
        String[] cars1 = {"audi", "toyota", "ferrari", "bugatti", "bentley"};
        for (int i = 0; i<cars1.length ; i++) {
            System.out.print(cars1[i]+" ");

        }
    }
}