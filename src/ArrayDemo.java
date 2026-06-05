
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int nums[] = {2, 3, 5, (int) 7.9};
        nums[1] = 100;  //100 at index 1 

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        double arr[] = new double[5];
        arr[0] = 100;
        // arr[1] = 200;
        // arr[2] = 300;
        // arr[3] = 400;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int array[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(i + " , " + j + " = " + array[i][j]);
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
