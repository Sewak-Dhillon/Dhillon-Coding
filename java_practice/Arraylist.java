// The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different.


import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> days= new ArrayList<String>();
        // Add data to ArrayList.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        //using get() method you can access data of ArrayList.
        System.out.println(days.get(0));

        //Change data at specific index using set() method.

        System.out.println(days.set(0 , "Gursewak"));

        // remove() method for removing data from ArrayList.

        System.out.println(days.remove(5));

        // clear() method to remove all elements in the ArrayList.

        // days.clear();

        // size() method to find how many data elements present in ArrayList().

        System.out.println("Size of ArrayList  : " + days.size() + "\n");

        // Loops Through an ArrayList.

        for(String i : days){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i));
          }
        System.out.println();
          // sort() method for sorting Arraylist alphabatically or numerically.

          Collections.sort(days);

          for(String i : days){
              System.out.println(i);
          }


    }
}


// LinkedList:

// The LinkedList class is almost identical to the ArrayList.

// The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

// The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

// However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

// the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently.


// addFirst()	    Adds an item to the beginning of the list.	

// addLast()	    Add an item to the end of the list	

// removeFirst()	Remove an item from the beginning of the list.	

// removeLast()	    Remove an item from the end of the list	

// getFirst()	    Get the item at the beginning of the list	

// getLast()	    Get the item at the end of the list