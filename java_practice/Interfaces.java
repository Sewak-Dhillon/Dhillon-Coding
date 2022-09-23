// Notes on Interfaces:
// Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)
interface calculation{
    public abstract void add(int x,int y);
    public abstract void mul(int x,int y);
}
interface show{
    static String str = "****Calculation****";
    public abstract void display();

}

// To implement multiple interfaces, separate them with a comma

class math implements calculation,show{
    public void display(){
        System.out.println(str);
    }
    public void mul(int x,int y){
        System.out.printf("\nMultiplication of %d and %d is %d",x,y,x*y);
    }
    public void add(int x,int y){
        System.out.printf("\nAddition of %d and %d is %d",x,y,x+y);

    }
}
public class Interfaces  {
   public static void main(String[] args) {
    math obj = new math();
    obj.display();
    obj.add(20, 30);
    obj.mul(5, 10);
   }
}
