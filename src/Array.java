
class Student {

    String name;
    int marks;

    Student(String naam, int mks){
        name = naam;
        marks = mks;
    }
}

public class Array {

    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "karan";
        // s1.marks = 80;

        // Student s2 = new Student();
        // s2.name = "ronny";
        // s2.marks = 300;

        // Student s3 = new Student();
        // s3.name = "karan";
        // s3.marks = 80;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        
        Student students[] = {  // array literal syntax
            new Student("hhee", 89),
            new Student("sike", 56),
            new Student("siuue", 89),
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " = " + students[i].marks);
            System.out.println(students[i]);
        }
    }

}
