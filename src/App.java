
class Student {

    //instance variables
    String name = "helo";
    int marks = 45;
    static int age = 22;
    
    public static int add(int a,int b){
        return a+b;
    }
}

public class App {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(Student.add(3, 5));     
        System.out.println("Hello, World!");
    }
}
