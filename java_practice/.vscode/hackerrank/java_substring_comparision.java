import java.util.*;

public class java_substring_comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < num ; i++ ){
            int n = i;
            for(int j = 1 ; j < str.length() ; j++ ){
            if(num*j+i <= str.length() && n < str.length()){
            list.add(str.substring(n,num*j+i));
            n += 3;
            } 
            }
        }
        Collections.sort(list);
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        for(String s : list){
            System.out.println(s);
        }
        
        sc.close();
        
    }
}
