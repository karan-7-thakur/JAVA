

class A extends Object {

    String name = "siuu";
    public char[] marks;

    void y() {
        
    }

    A() {

    }

    public A(int a) {
        super(); // calling the constructor of Object class. Object class doesnt have a super constructor as it is the root of class heirarchy
        System.out.println("hello world from a " + a + name);

    }

}

class B extends A {

    B() {
        // super(5);
    }

    B(String name) {
        super(60);
        // this();
        System.out.println("hello world from b " + name);
    }
}

class C extends A {

    C() {
        super(90);
        System.out.println("hello world from c");
    }
}

public class Type {

    public static void main(String[] args) {

        B obj = new B("hehe") {
            //inner class(anonymous) 

        };
        obj.y();

        // System.out.println(obj.y());
        // int it = 257;  // byte MAX value stored
        // byte bt = (byte) 257;
        // System.out.println("byte " + bt);
        // long lt = 2147483648L;  //int MAX
        // int a = (int) lt;
        // System.out.println(a);
        // System.out.println("long to int -> " + a);
        // int c = 40;
        // int d = 10;
        // int res = c * d;
        // System.out.println(res);
    }
}
