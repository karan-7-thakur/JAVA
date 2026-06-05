
enum Status {
    running, Failed, Pending, Success;  //a group of named constants, like final variables
}

public class Enum {

    public static void main(String[] args) {
        Status s = Status.running;
        System.out.println(s);
        System.out.println(s.ordinal());  // gives the idx of that constant

        Status[] s1 = Status.values();
        System.out.println(s1);
        System.out.println(s1[2]);

        for (Status ss : s1) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
