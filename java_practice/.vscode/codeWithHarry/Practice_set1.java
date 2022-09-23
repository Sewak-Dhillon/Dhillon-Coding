import java.util.Scanner;

public class Practice_set1 {
    public static void main(String[] args) {
        float a = 7/4 * 9/2; // It will generate wrong answer.
        float b = 7/4.0f * 9/2.0f; // It will generate a write answer. 
        System.out.println(a);
        System.out.println(b);
        // Encrpting grade by adding 8 to it.
        char grade = 'B';
        grade = (char)(grade + 8);//Type-casting.
        System.out.println(grade);
        // decrpting grade by Subtracting 8 from it.
        grade = (char)(grade - 8);
        System.out.println(grade);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(num>8);
        int x = 1;
        int y = 2;
        int z = 4;
        int w = 3;
        int result = (x*x - y*y)/(2*w*z);
        System.out.println(result);
        System.out.println(7*49/7 + 35/7);
    }
}
