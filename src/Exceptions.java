
class ThakurException extends Exception {  //custom exception

    public ThakurException(String str) {
        super(str);
    }
}


public class Exceptions {

    public static void main(String[] args) {

        String str = null;  //null means absence of a value.
        int j = 0;
        try {
            // System.out.println(str.length());
            // int a = 5 / 0;  //it throws an exception. no instructions will be executed further. Thats why we have finally block
            throw new ThakurException("i want to throw a custom exception");

            // if (j == 0){
            //     throw new ArithmeticException("Hi"); 
            // }
            // System.out.println(str.length());
            // System.out.println("No error so a = "+ a);
            // System.out.println("i wont be executed the moment an exception occurs above");
        } catch (NullPointerException k) {

            System.out.println("the exception is " + k);

        } catch (ThakurException t) {

            System.out.println("the exception is " + t);

        } catch (Exception e) {        //common block for any exception
            System.out.println("the exception is " + e);
        } finally {                       // finally block always executes irrespective of the exception. 

            // finally block is used to close the resource - eg- br.close() . it can be for file/input/connections-DB,Network

            System.out.println("i always execute..");
        }
    }
}
