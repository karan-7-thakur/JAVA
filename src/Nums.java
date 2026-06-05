import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int rows = 2;
         int cols = 3;
         int a[][] = new int[rows][cols];

         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 a[i][j] = sc.nextInt();
             }
         }
         int X = 5;
         for (int j = 0; j < cols; j++) {
             int sum = 0;
             for (int i = 0; i < rows; i++) {
                sum += a[i][j]; 
             }
             System.out.println("Sum of "+ j+" col "+ sum);
         }
    // int n = 553;
    // String k = "", a[]={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine"}; // a is an array of string objects

    // // The Concatenation (k = a[dig] + " " + k): This is the most important part. By putting the new word before the existing string k, it reverses the digits back into the correct order as it builds the sentence
    // int temp = n;
    // while(temp != 0){
    //     int dig = temp % 10;

    //     k = a[dig] + " "+ k;   //The Array a[]: Acts as a "translator." If you give it index 5, it gives you the word "Five".
        
    //     temp/=10;
    // }
    // System.out.println("Digit in words: "+ k);

    }
}
