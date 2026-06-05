//Method 

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        add(3.0, 3);
        add(3, 3);
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Demos {

    public double add(double a, int b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        double r1 = c1.add(4, 5.0);
        System.out.println("via obj = " + r1);

        Demos demo = new Demos();
        double sum = demo.add(3, (int) 8.9, (float)7.0F );

        for (int i = 1; i <= 10; i++) {
            System.out.println(sum);
        }

        double d = 9.8;
        int cd = (int) d;

        Calculator.add(2, 3);

    }
}
