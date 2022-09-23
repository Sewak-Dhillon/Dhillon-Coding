// import java.lang.reflect.Method;

public class cwh_String {
 public static void main(String[] args) {
    // Both are same.
    String str1 = new String("gursewak singh");
    String str2  = "Gursewak singh";
    System.out.println(str1);

    str1 = "dhillon"; //changing value of str1 instance of String.
    System.out.println(str1);
    
    System.out.println(str2);


    // trim() method removes extra spaces from string.
    String ex = "     klklo       ";
    System.out.println(ex);
    System.out.println(ex.trim());

    //Substring() method.

    String str3 = "Gursewak singh";
    System.out.println(str3.substring(5));
    System.out.println(str3.substring(5,9));

    // replace() method.

    System.out.println(str3.replace("G", "k"));
    System.out.println(str3.replace("Gur", "plok"));

    // startsWith() and endsWith() method.

    System.out.println(str1.startsWith("har"));
    System.out.println(str1.endsWith("on"));

    // charAt() Method.

    System.out.println(str1.charAt(5));

    // indexOf() and lastIndexOf method. 
    String m = "Thank you";
    System.out.println(m.indexOf("o"));
    System.out.println(m.indexOf("o",3));

    System.out.println(m.lastIndexOf("o"));
    System.out.println(m.lastIndexOf("h",3));

    //equals() and equalsIgnoreCase() method.

    System.out.println(m.equals("Thank you"));
    System.out.println(m.equalsIgnoreCase("Thank YOU"));

    // In String if you want to print double qoutes they you can using / sign or you can use Single qoutes as well.

    System.out.println("\"Hi\", my \\ it will print one backslash name is 'gursewak singh'");



 }   
}
