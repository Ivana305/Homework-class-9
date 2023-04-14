package HwClass9;

public class Task5 {
    public static void main(String[] args) {

        //  Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
        String[]animals={"lion","monkey","tiger","cow","elephant"};
        for (String name:animals){
            System.out.print(name+" ");
        }
        System.out.println();
        String[]animals2={"lion","monkey","tiger","cow","elephant"};
        for (int i = 0; i < animals2.length ; i++) {
            System.out.print(animals2[i]+" ");

        }
    }
}