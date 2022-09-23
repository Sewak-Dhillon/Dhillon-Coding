class cylinder{
    private int height;
    private int radius;
    cylinder(){
        this.height = 10;
        this.radius = 5;
    }
    cylinder(int h,int r){
        this.height = h;
        this.radius = r;
    }
    public void setradius(int num){
        this.radius = num;
    }
    public void setheight(int num){
        this.height = num;
    }
    public int getheight(){
        return height;
    }
    public int getradius(){
        return radius;
    }
    public float surfacearea(){
        return 2*3.14f*radius*height + 2*3.14f*radius*radius;
    }
}

public class Practice_set7 {
    public static void main(String[] args) {
        cylinder obj1 = new cylinder();
        cylinder obj2 = new cylinder(20,63);
        System.out.println("surface area of obj1 " + obj1.surfacearea());
        System.out.println("surface area of obj2 " + obj2.surfacearea());
    }
}
