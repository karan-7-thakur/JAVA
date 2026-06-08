// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
// interface - class -> ERROR

// IMP:- A class that implements an interface must implement all methods inside it. 

interface A {

    int age = 22;  //All fields in interface public, static and final by default
    public static final String name = "bhidu"; 

    // A(){} NOTE:- interface cant have any constructors whereas abstract class can

    void details(); // By default, every method in interface is - public abstract

    void hello();  

    private void siuu(){
    }
}

interface C extends A {   // An interface can't extend a class but can extend another interface.
    
    // @Override
    void hello();
    // void show();
    
}
class B implements A, C {           //multiple inheritance in interfaces not classes.

    @Override
    public void hello() {
        System.out.println("i am hello");
    }

    @Override
    public void details() {
        System.out.println("in B details");
    }
}

public class Interface {

    public static void main(String[] args) {

        A obj;
        obj = new B();  //cant instantiate interfaces 
        obj.hello();
        obj.details();

        // obj.show();

        // A.name = "Karan"; //cant initialize as it is final
        System.out.println(" Age: " + A.age + " Name: " + A.name);
    }
}
