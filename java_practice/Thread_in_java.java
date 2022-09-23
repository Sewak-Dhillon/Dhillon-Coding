// Threads allows a program to operate more efficiently by doing multiple things at the same time.

// Threads can be used to perform complicated tasks in the background without interrupting the main program.

// There are two ways to create a thread.

// It can be created by extending the Thread class and overriding its run() method.

// Another way to create a thread is to implement the Runnable interface.

// Differences between "extending" and "implementing" Threads

// The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.

// public class Thread_in_java implements Runnable {
//     public static int a = 20;
//     public static int b = 30;
//     public static void main(String[] args) {
//         Thread_in_java obj = new Thread_in_java();
//         Thread t = new Thread(obj);
//         t.start();
//         while(t.isAlive()){}
//         b++;
//         System.out.println(a+b);
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//     }
//     public void run(){
//         a++;
//     }
// }



public class Thread_in_java extends Thread {
        public static int a = 20;
        public static int b = 30;
        public static void main(String[] args) {
        Thread_in_java obj = new Thread_in_java();
        obj.start();
        while(obj.isAlive()){} 
        // It will stop main program execution and give time to run function to complete its operationn.

        b++;
        System.out.println(a+b);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
    public void run(){
        a++;
    }
}
