import java.util.Scanner;

public class introJava {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input some String");
       String str1 = sc.nextLine(); // For a line.
       String str2 = sc.next(); // For a word.
       System.out.println("line : " + str1);
       System.out.println("word : " + str2);

       System.out.print("Enter value of x : "); 
       int x = sc.nextInt();
       System.out.print("Enter value of y : "); 
       int y = sc.nextInt();
       System.out.print("Enter value of z : "); 
       int z = sc.nextInt();
       int sum = x + y + z;
       System.out.println("Sum : " + sum); 
    
    
    boolean b = sc.hasNextInt();
    System.out.println(b); 
    sc.close();

    }
}
