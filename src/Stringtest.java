// String pool only stores unique literals. same objects are reused.

public class Stringtest {

    public static void main(String[] args) {

        // Strings are immutable
        String name = "Karan"; // old obj -> Garbage collection handles it
        System.out.println(name.hashCode());
        name = name + " Thakur";  // a new object created with different reference
        System.out.println(name.hashCode());
        String names = "Karan";             //reuses the same object stored in pool.
        System.out.println(name == names);
        System.out.println("hello, " + name);


        String s1 = "karan";
        String s2 = "kAran"; // reuses the same object(case-matched) from the string pool in the heap. same object different references in this case
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // Both have the same reference(address) to the object.thats why s1 == s2
        
        if (s1.equalsIgnoreCase(s2)) {   // equals() --> value comparison and == reference comparison not values
            System.out.println("equal");
        } else {
            System.out.println("Not equal");
        }



        // String s = new String("Thakur");
        // System.out.println(name);
        // System.out.println(s);
        // System.out.println("Hello" + s); //string concat
        // //string methods
        
        // System.out.println(name.charAt(2));
        // System.out.println(name.concat("THAKUR"));
        // System.out.println(name.contains(s));
        // System.out.println(s.hashCode()); 
        // System.out.println(name.hashCode());
    }
}
