// this code demonstrates encapsulation 

final class BankAccount {

    private String name;  //cannot be accessed directly
    private double amount;

    final public String getName() {
        return name;
    }

    public void setName(String name) {
        // BankAccount b1 = new BankAccount(); // a new object created not the main one.
        // b1.name = "hehe";

        // BankAccount obj1 = obj;
        if (name.equals("karan")) {
            this.name = name;
        } else {
            System.out.println("Name didnt match");
        }
        // this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    protected void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("wrong input");
        }
    }

}

public class Encap {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setAmount(200);
        b1.setName("karan");

        System.out.println("Name : " + b1.getName() + " amount is : " + b1.getAmount());

    }
}
