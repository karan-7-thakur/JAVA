// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;

public class UserInput {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);  // System.in takes input from the console
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println("Number entered "+ num);

        bf.close();  //closing the resource 

    }
}
