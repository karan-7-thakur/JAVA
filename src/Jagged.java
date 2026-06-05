
public class Jagged {

    public static void main(String[] args) {
        int array[][] = new int[2][];  //jagged array

        // Then, you must initialize each inner array individually with its own specific length
        array[0] = new int[3]; // row 0 has 3 cols
        array[1] = new int[2]; // row 1 has 2 cols
        // array[2] = new int[3];

        for (int i = 0; i < array.length; i++) {  //rows
            for (int j = 0; j < array[i].length; j++) {  // elements or no. of cols/inner array  in each row i or length of inner array stord at index i
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(i + " , " + j + " = " + array[i][j]);
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {  //outer loop manages the no. of rows
            for (int j = 0; j < array[i].length; j++) { // inner loop manages the no. of columns within that row i
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
