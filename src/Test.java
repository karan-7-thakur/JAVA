

class Tests extends Type {

    public Tests()
    {
        System.out.println("object created");
    }

    void display() {
        System.out.println("hello,karan");
    }
}

public class Test {

    public static void main(String[] args) {

        new Tests().display(); //Anonymous object
        Animal a1 = new Animal(0, null, 0);
        // a1.age = 24;
    
        a1.walk(5);

    }
}
