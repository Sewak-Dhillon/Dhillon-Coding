// import java.io.*;
import java.util.*;

public class String_introduction{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        // Comparing two Strings lexicographically.
        int n = A.compareTo(B);
        if(n > 0){
           System.out.println("Yes");
        }else{
           System.out.println("No");
        }
        System.out.println(A.substring(0
        , 1).toUpperCase() + A.substring(1) + " " + B.substring(0
        , 1).toUpperCase() + B.substring(1));
        
    }
}



