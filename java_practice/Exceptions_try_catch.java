// The try statement allows you to define a block of code to be tested for errors while it is being executed.

// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

// The finally statement lets you execute code, after try...catch, regardless of the result.

// The throw statement allows you to create a custom error.

// The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

public class Exceptions_try_catch {
    public static void main(String[] args) {
    try{
        for(int i = 0;i<=10;i++){
            if(i%2 == 0){
            System.out.println(i/2);
            }
            else{
                throw new ArithmeticException(i + " is not multiple of 2.");
            }
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Please check your code.");
    }

    }
}
