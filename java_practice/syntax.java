
// non-primitive types are Strings, Arrays, Classes, Interface, etc.
// import java.io.*;
import java.lang.Math;
public class syntax {
public static void main(String[] args) {

    // int b = 20 + 20;
    // Type casting Variables.
    // Automatic casting:-
    // double x = b;

    //Manual casting:-
    // double x = (int) b; 

    // int c = 30;
//  System.out.println("Hello " + (x + c));

// String in java.
String str1 = "Gursewak ";
String str2 = "singh";
System.out.println("My string is : "+ str1);
System.out.println("My string is : "+ str1.length());
System.out.println("My string is : "+ str1.toLowerCase());
System.out.println("My string is : "+ str1.toUpperCase());
System.out.println("My string is : "+ str1.indexOf("singh"));
//String Concatenation.
System.out.println("String after Concatenation : "+ str1 +  str2);
System.out.println("String after Concatenation : "+ str1.concat(str2));
// Code	Result

// \n	New Line	
// \r	Carriage Return	
// \t	Tab	
// \b	Backspace	
// \f	Form Feed

System.out.println("Some text for Understanding \tdiffereny escape \fsequences.");

// Math in java.

int a = 20;
int b = 90;
System.out.println(Math.max(a,b));
System.out.println(Math.min(a,b));
System.out.println(Math.sqrt(a));
System.out.println((int)(Math.random()*101));

}
}

// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

// Primitive Data Type      	Wrapper Class

// byte	                        Byte
// short	                    Short
// int	                        Integer
// long	                        Long
// float	                    Float
// double	                    Double
// boolean	                    Boolean
// char	                        Character



// Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects).


