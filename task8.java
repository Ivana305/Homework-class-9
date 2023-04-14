package HwClass9;

public class task8 {
    public static void main(String[] args) {
        //        Create an array to store char values and then print those in reverse orderX
        char[]grades=new char[]{'A','B','C','D','F'};
        for (int i = grades.length-1; i>=0 ; i--) {
            System.out.print(grades[i]+" ");

        }

    }
}
