
class BankAccount {

    double balance; //instance variable
    static int otp = 23; // static variable

    public static double details(double balane) {
        // this.balance = balane;
        // System.out.println("balance is " + this.balance);
        return balane + 100;
    }

    
}
public class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        double balance = 100.0;

        b1.balance = 9199.45;

        System.out.println("Balance via instance" + b1.details(balance)); //access via instance
        System.out.println("Balance returned is" + b1.details(balance)); //calling it via obj
        System.out.println("age is" + b1.otp); 
        System.out.println("otp is" + BankAccount.otp);
        System.out.println("age is" + BankAccount.details(678)); 
        
    }
}
