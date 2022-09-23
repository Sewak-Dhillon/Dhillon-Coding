// Regular expressions can be used to perform all types of text search and text replace operations.

// Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

// Pattern Class - Defines a pattern (to be used in a search)
// Matcher Class - Used to search for the pattern
// PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

// Flags in the compile() method change how the search is performed. Here are a few of them:

// Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.

// Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.

// Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet.

import java.util.regex.*;

public class RegExp {
public static void main(String[] args) {

//  Pattern obj = Pattern.compile("gursewak",Pattern.CASE_INSENSITIVE);
 //  Pattern obj = Pattern.compile("[abc]",Pattern.CASE_INSENSITIVE);
 //  Pattern obj = Pattern.compile("[0-6]",Pattern.CASE_INSENSITIVE);
 //  Pattern obj = Pattern.compile("[^abc]",Pattern.CASE_INSENSITIVE);
 //  Pattern obj = Pattern.compile("[.abc]",Pattern.CASE_INSENSITIVE);
 Pattern obj = Pattern.compile("o{2,}",Pattern.CASE_INSENSITIVE);
 Matcher m = obj.matcher("M|abc zooooooo 14|nme 958489is gursewk singh");
//  boolean mfind = m.find();
 if(m.find()){
     System.out.println("Match Found");
     System.out.println(m.group());
 } 
 else{
    System.out.println("Match Not Found");
 }
}  
}
