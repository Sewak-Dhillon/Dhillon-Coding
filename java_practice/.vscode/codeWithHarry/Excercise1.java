import java.util.Scanner;

// Calculate Percentages of given student Marks.
public class Excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float total = 0.0f;
        System.out.println("Enter Marks of 5 subjects");
        for(int i = 0;i < 5;i++)
        {
                total += sc.nextFloat(); 
        }
        System.out.println("Percentage of Student : " + (total/5));
        System.out.println("CGPA of Student : " + (total/50));

        // String str = sc.nextLine();
        // System.out.println("Hello, " + str + " have a good day.");
        
        // boolean b = sc.hasNextInt();
        // String str = (b)? "Entered number is Integer." : "Entered number is not an Integer.";
        // System.out.println(str);

        
        sc.close();


    }
    }

