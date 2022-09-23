// The abstract keyword is a non-access modifier, used for classes and methods:

// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


abstract class myname{
    final String str = "Gursewak singh";
    public abstract void name(String n);
}

class data extends myname{
    public void name(String n){
        System.out.println("My name is " + n);
        System.out.println("My name is " + str);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        data obj = new data();
        obj.name("G S Dhillon");
    }

}
