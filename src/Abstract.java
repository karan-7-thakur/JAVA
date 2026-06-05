
abstract class Car extends Object {

    abstract protected void drive(String a, long b);   // abstract methods only belong to abstract class and cant be instantiated
    // {
    //No definition
    // }
    int a = 5;
    Car() {    //can have constructors
        super();
        System.out.println("hi");
    }

    // abstract protected void fly();
    public void dance() {
        System.out.println("i dance");
    }

}

class Truck extends Car {
    
    @Override
    public void drive(String a, long b) {   // all abstract methods must be overridden or make the child class abstract.
        System.out.println("in B drive");
        System.out.println(super.a);
    }

    // @Override
    // public void dance() {
    //     System.out.println("i dance in Truck");
    // }

    public void drive(int a) {  //Method Overloading -> same name , different parameters
        System.out.println("I am not overridden");
    }
}

public class Abstract {

    public static void main(String[] args) {

        Car car = new Car() {

            // NOTE:- we are creating the object of this anonymous inner class and not Car which is abstract.
            @Override
            public void drive(String a, long b) {
                System.out.println("in new drive");
            }

        };  // cant create/instantitate an object of abstract class. 
        car.drive("hehehe", 4);

        // car.dance();
        // car.drive(null, 5);
        Car obj;             //However we can create a reference of an abstract class
        obj = new Truck();
        obj.dance();
        obj.drive("karan", 45);

        Integer a = 45; //auto-boxing
        int b = a;   // auto-unboxing
        
    }
}
