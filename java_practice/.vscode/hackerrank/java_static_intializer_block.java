import java.util.*;

public class java_static_intializer_block {
    public static int B;
    public static int H;
    public static boolean flag;
    static{
    Scanner sc = new Scanner(System.in);
    try
    {
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if (B <= 0 || H <= 0) {
            throw new Exception("Breadth and height must be positive");
        } else {
            flag = true;
        }
    }
    catch(Exception e)
        {
            System.out.println(e);
        }
    }

public static void main(String[] args){
		if(flag){
            int area=B*H;
			System.out.print(area);
		}
		
}
}
