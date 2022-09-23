// Why Encapsulation?

// Better control of class attributes and methods
// Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
// Flexible: the programmer can change one part of the code without affecting other parts
// Increased security of data.

class myname{
    private String name = "gursewak singh";
    String getname(){
        return name;
    }
    String setname(String n){
        this.name = n;
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        myname obj = new myname();
    String str = "Dhillon Saab";
        System.out.println("My name is : " + obj.getname());
        obj.setname(str);
        System.out.println("My name is : " + obj.getname());
    }
}
