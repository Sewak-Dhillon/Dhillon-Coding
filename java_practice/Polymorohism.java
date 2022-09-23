class cal{
    int multiplication(int i ,int j){
        return i * j;
    }
}

class cal1 extends cal{
    int multiplication(int i ,int j){
        return i * j;
    }
}
class cal2 extends cal{
    int multiplication(int i ,int j){
        return i * j;
    }
}

public class Polymorohism {
    public static void main(String[] args) {
        cal obj = new cal();
        cal1 obj1 = new cal1();
        cal2 obj2 = new cal2();
        System.out.println("Multiplication by cal class : " + obj.multiplication(2, 30));
        System.out.println("Multiplication by cal1 class : " + obj1.multiplication(3, 30));
        System.out.println("Multiplication by cal2 class : " + obj2.multiplication(4, 30));
        
    }
}
