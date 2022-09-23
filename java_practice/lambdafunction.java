import java.util.ArrayList;
import java.util.function.Consumer;

// A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.


// The simplest lambda expression contains a single parameter and an expression.

// parameter -> expression

// To use more than one parameter, wrap them in parentheses.

// (parameter1, parameter2) -> expression


public class lambdafunction {
    public static void main(String[] args) {
        ArrayList<String> days= new ArrayList<String>();
        // Add data to ArrayList.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // days.forEach((n) -> {System.out.println(n);});

        // Lambda function can be Stored in a variable.

        Consumer<String> obj = (n) -> {System.out.println(n);};

        days.forEach(obj);
    }
}



