
class Animal {

    int age;
    String color;
    float val;

    Animal(int age, String color, int val) {
        this.age = 24; //hard-coded
        this.color = "Orange";
        this.val = val;
        System.out.println("age from constructor is " + this.age + " age is " + age);
        System.out.println("color from constructor is " + this.color);
        System.out.println("value from constructor is " + this.val);
    }

    void walk(int age) {
        System.out.println();
        System.out.println("The age from method is " + age + " color is " + color);
    }

}

public class Demo {

    public static void main(String[] args) {
        Animal animal = new Animal(4, "maroon", 67);

        animal.color = "white";  //updated
        animal.walk(400);

    }
}
