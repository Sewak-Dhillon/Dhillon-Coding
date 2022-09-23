// static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.

// void means that this method does not have a return value.

public class Methods_in_java {
    static void fibonacci(int num){
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        while (temp<=num){
            System.out.print(temp + " ");
            n1 = n2;
            n2 = temp;
            temp = n1 + n2;
        }
    }
    static int fictorial(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num*fictorial(num-1);
        }
    }
    public static void main(String[] args) {
    fibonacci(55);
    System.out.println("\nFictorial of number is " + fictorial(5));
}
}
