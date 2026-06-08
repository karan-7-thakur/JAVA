//Single abstract method - FI
@FunctionalInterface
interface A {
    void show();
    // void play();
}

// class B implements A {
// public void show() {
// System.out.println("IN show");
// }
// }

public class FuncInterface {

    public static void main(String[] args) {

        // A obj1 = new A() {
        //     public void show() {
        //         System.out.println("inside Anony ineer class");
        //     }
        // };
        // obj1.show();

        // Or even simpler, use a lambda expression (since it's a functional interface):
        A obj = () -> { System.out.println("inside Anony ineer class"); };
        obj.show();
    }
}
