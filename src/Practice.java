
public class Practice {

    public static void main(String[] args) {
        // double n = 2;
        // double root = Math.sqrt(n + 1);

        // if (root == (int) root) {
        // System.out.println("Sunny Number");
        // } else {
        // System.out.println("Not Sunny");
        // }
        for (int i = 1; i <= 500; i++) {

            int temp = i;
            int sum = 0;
            int digit = 0;
            int rev = 0;

            while (temp != 0) {
                digit = temp % 10;

                sum += digit * digit * digit;
                rev = rev * 10 + digit;

                temp /= 10;
            }
            if (sum == i) {
                System.out.println("Armstrong: " + i);
            }

        }

    }
}
