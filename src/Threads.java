// If one process crashes, it doesn't affect other processes. If one thread crashes, it can bring down the entire process.
// threads are lightweight whereas process is heavyweight
// threads - parallel execution of methods(behaviours) 
// NOTE :- Every thread must have a run() method

// these two methods will run at the same time(concurrency)

class T1 extends Thread {  // T1 is now a Thread class

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Threads {

    public static void main(String[] args) {

        T1 obj = new T1();   // these are threads now not normal objects
        T2 obj1 = new T2();

        obj.start();   
        obj1.start();

    }
}
