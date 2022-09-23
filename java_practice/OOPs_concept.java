

// Object-oriented programming has several advantages over procedural programming:

// OOP is faster and easier to execute
// OOP provides a clear structure for the programs
// OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
// OOP makes it possible to create full reusable applications with less code and shorter development time.
abstract class myclass{
    public abstract void myadd(int x,int y);
    final int num = 5;
}
public class OOPs_concept extends myclass{
    static void mystatic(int num){
        System.out.println("Square of "+num+" : "+ (int)Math.pow(num,2));
    }
    public void myadd(int x,int y){
        System.out.println("Addition of "+x+" and "+y+" is : "+(x+y));
    }

    public static void main(String[] args) {
     OOPs_concept obj = new OOPs_concept();
     obj.myadd(5, 5);
     int n = obj.num;
     mystatic(n);

    }
}
