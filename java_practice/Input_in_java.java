import java.util.*;
public class Input_in_java {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     System.out.print("Enter your name : ");

     String str = obj.nextLine();
     System.out.println("My name is " + str);
     obj.close();
    }
}
