// import java.util.Scanner;

public class Practice_set2 {
    public static void main(String[] args) {
        // Program 1

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Marks in Physics");
        // byte marks1 = sc.nextByte();
        // System.out.println("Enter your Marks in Chemistry");
        // byte marks2 = sc.nextByte();
        // System.out.println("Enter your Marks in Mathematics");
        // byte marks3 = sc.nextByte();
        // sc.close();
        // float avg = (marks1 + marks2 + marks3)/3.0f;
        // System.out.printf("Your Overall percentage is %.2f\n" , avg);
        // if(avg >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33){
        //     System.out.println("Pass");
        // }else
        // System.out.println("Fail");

        // Program 2

        // float tax = 0.0f;
        // int income = 30000;
        // if(income > 2500 && income <= 5000){
        //     tax = tax + 0.05f * (income - 2500);
        // }
        // else if(income > 5000 && income <= 10000){
        //     tax = tax + 0.05f * (5000 - 2500);
        //     tax = tax + 0.1f * (income - 5000);
        // }
        // else if(income > 10000){
        //     tax = tax + 0.05f * (5000 - 2500);
        //     tax = tax + 0.1f * (10000 - 5000);
        //     tax = tax + 0.2f * (income - 10000);
        // }
        // System.out.println("You have to pay " + tax +"Rs of tax on your income " + income);

        // Program 3 

        // byte num = sc.nextByte();
        // switch (num){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
            
        // Program 4

        // int num = sc.nextInt();
        // if(num%400 == 0){
        //     System.out.println(num + " is a leap year.");
        // }
        // else if(num%100 == 0){
        //     System.out.println(num + " is not a leap year.");
        // }
        // else if(num%4 == 0){
        //     System.out.println(num + " is a leap year.");
        // }
        // else
        // System.out.println(num + " is not a leap year.");


        // Program 5
        String str = "www.gov.in";
        if(str.endsWith(".org")){
            System.out.println(str + " is Organisational Website.");
        }
        else if(str.endsWith(".com")){
            System.out.println(str + " is Commercial Website.");
        }
        else if(str.endsWith(".in")){
            System.out.println(str + " is Indian Website.");
        }
        
        }


    }

