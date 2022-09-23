import java.lang.Math;
import java.util.*;
// import java.io.*;
public class java_loopll {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for(int j = 1;j <= n; j++){
                    int total = 0;
                    for(int k= 0;k<j;k++){
                    total += Math.pow(2, k) * b;
                    }
                    System.out.print((a+total) + " ");
                }
                System.out.println();
            }
            in.close();
        }
    }  


// 5 3 5
// a + i * b
// a + i * b +