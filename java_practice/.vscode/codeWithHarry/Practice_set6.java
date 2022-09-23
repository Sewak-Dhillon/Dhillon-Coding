class circle{
    private float radius;
    private final float pi = 3.14f;

    circle(float r){
        this.radius = r;
    }
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }

}
class rectangle{
    private int length,breath;
    

    rectangle(int l , int b){
        this.breath = b;
        this.length = l;
    }
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class square{
    private int side;
    

    square(int s){
        this.side = s;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class Practice_set6 {
    public static void main(String[] args) {
        square s = new square(20);
        rectangle r = new rectangle(20, 30);
        circle c = new circle(3.6f);
        System.out.println("Area of circle is - " + c.area());
        System.out.println("Area of rectangle is - " + r.area());
        System.out.println("Area of square is - " + s.area());
    }
}
