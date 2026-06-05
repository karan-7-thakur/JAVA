
public class Digits {
    public static void main(String[] args) {

        int num = 153;
        int originalNum = num;  // not overwritten
    
        int dig = 0;
        int count = 0;
        int sum = 0;
        int rev = 0;
        while (num != 0) {
            dig = num % 10;  //Extract last digit

            sum = sum + dig * dig * dig; //Armstrong number  
            rev = rev * 10 + dig;

            
            num /= 10;      // remove last digit
            count++;
        }
        System.out.println("the number of digits are " + count);
        System.out.println("the sum of digits = " + sum);
        System.out.println("digits rev = " + rev);

        // Compare the reverse to the ORIGINAL value, not the modified 'num'
        System.out.println(originalNum == rev ? "palindrome" : "not a palindrome");
        System.out.println(originalNum == sum ? "Armstrong" : "no");
    }
}
