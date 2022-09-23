// HashMap in Java.

// A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type.

// For other types:

// To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc

// Use the keySet() method if you only want the keys, and use the values() method if you only want the values

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
    //  Create a Hashmap
    HashMap<Integer,String> obj = new HashMap<Integer, String>();

    // Add keys and value.
    obj.put(1, "gursewak singh");
    obj.put(2, "karan singh");
    obj.put(3, "kunal singh");
    obj.put(4, "shan singh");
    obj.put(5, "mohit singh");


    // To access a value in the HashMap, use the get() method and refer to its key.
    // obj.get(1);
    
    // To remove an item, use the remove() method and refer to the key.
    // obj.remove(2);

    // To remove all items, use the clear() method.
    // obj.clear();
    
    // To find out how many items there are, use the size() method.
    System.out.println("Size of HashMap : " + obj.size());

    // Use the keySet() method if you only want the keys, and use the values() method if you only want the values.
    
    // For keys.
    for(int i : obj.keySet()){
        System.out.println(i);
    }
    
    // For Values.
    for(String j : obj.values()){
        System.out.println(j);
    }

    // For keys and values.
    for(int i = 1; i <= obj.size(); i++){
        System.out.println((i) + " : " + obj.get(i));
    }










    }

}
