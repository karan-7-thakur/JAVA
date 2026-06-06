
import packages.*;

class Home extends Farm {

    public void hello() {
        System.out.println("marks are: " + marks);
    }
}

public class Package{

    public static void main(String[] args) {
        Farm obj = new Farm();
        Home h1 = new Home();
        h1.hello();
        // System.out.println(obj.marks); 
    }
}
