import java.util.*;


public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> days= new ArrayList<String>();
    
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        Iterator<String> obj = days.iterator();
        
        // It will print the first value and so on.
        // System.out.println(obj.next());

        // To loop through a collection, use the hasNext() and next() methods of the Iterator.

        

        while(obj.hasNext()){
            System.out.println(obj.next());
        }

        while(obj.hasNext()){
            // System.out.println(obj.next());
            String i = obj.next();
            if(i == "Monday"){
                obj.remove();
            }
            else if(i == "Tuesday"){
                obj.remove();
            }
            else if(i == "Saturday"){
                obj.remove();
            }
        }
        System.out.println(days);
        }    
}
