import java.util.*;

public class java_end_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i = 1;
        while(in.hasNext()){
            System.out.println(i++ +" "+ in.nextLine());
        }
        in.close();
        
    }
}
