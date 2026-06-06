
class A {

    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in B show");
    }

    @Override
    public void show1() {
        System.out.println("in B show (overidden)");
    }
}

class C extends A {

    public void show() {
        System.out.println("in c show");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        A obj = (A) new B(); // which method will be called A's or B's will be decided at runtime based on the actual object type.Thats why it is called rumtime polymorphism
        obj.show1();

        // obj = new C();
        // obj.show2(); //Super class reference type cant access child class methods unless its overridden or Downcasting.
        
        //Downcasting
        B obj1 = (B) obj;  // typecasting superclass ref -> child class reference
        obj1.show2();

        C obj3=(C) obj;
        obj3.show();
    }
}
