// import java.io.*;
import java.util.*;
import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class java_currency_formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en" ,"in"));
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        
        System.out.println("US: " + n1.format(payment));
        System.out.println("India: " + n2.format(payment));
        System.out.println("China: " + n3.format(payment));
        System.out.println("France: " + n4.format(payment));
    }
}