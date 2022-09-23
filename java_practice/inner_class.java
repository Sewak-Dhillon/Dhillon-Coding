class outer{
    void display(){
        System.out.println("Outer class methode");
    }
    class inner{
        // By this approach we can access the content of outer class.
        outer obj = new outer();
        void outermethod(){
            System.out.println("Accessing Content of outer class");
            obj.display();
        }

        void display(){
            System.out.println("Inner class methode");
        }
    }

    // An inner class can also be static, which means that you can access it without creating an object of the outer class

    static class inner1{
        void display(){
            System.out.println("Static Inner class methode");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        outer obj = new outer();

        outer.inner in = obj.new inner(); // For simple inner class it is necessary to create object of outer class.

        outer.inner1 in1 = new outer.inner1();// For Static class their is no need to create object of outer class.

        obj.display();
        in.display();
        in.outermethod();
        in1.display();
    }
}
