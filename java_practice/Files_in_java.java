// import java.io.*;
import java.util.Scanner;

// Note: There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.

public class Files_in_java {
    public static void main(String[] args) {
        // File Creation.

        // try {
        //     File obj = new File("dhillon.txt");
        //     if (obj.createNewFile()) {
        //         System.out.println("File created : " + obj.getName());
        //     } else {
        //         throw new IOException("File already exists.");
        //     }
        // } catch (IOException e) {
        //     System.out.println("Something went wrong");
        //     e.printStackTrace();
        // }

        // Performing Writing operation.

        // try{
        //     FileWriter obj = new FileWriter("dhillon.txt");
        //     obj.write("My name is Gursewak Singh.\nJava is very Powerful language.\nIt is created by Sun Microsystems in the early 1990s.");
        //     obj.close();
        //     System.out.println("Successfully wrote to a file.");
        // }
        // catch(IOException e){
        //     System.out.println("Something went wrong");
        //     e.printStackTrace();
        // }

        //Performing Read operation.


        // try{
        //     File obj = new File("dhillon.txt");
        //     Scanner in = new Scanner(obj);
        //     while(in.hasNextLine()){
        //         String data = in.nextLine();
        //         System.out.println(data);
        //     }
        //     in.close();
        // }
        // catch(FileNotFoundException e){
        //     e.printStackTrace();
        // }

        // Some File information.

        // File obj = new File("dhillon.txt");
        // if(obj.exists()){
        //     System.out.println("File name : " + obj.getName());
        //     System.out.println("Path of file : " + obj.getAbsolutePath());
        //     System.out.println("Writeable : " + obj.canWrite());
        //     System.out.println("Readable : " + obj.canRead());
        //     System.out.println("File size in Byte : " + obj.length());
        // }
        // else{
        //     System.out.println("File not present in the Directory.");
        // }

        // Delete Files or Folder.

        // File obj = new File("dhillon.txt"); // For files deletion.
        // File obj = new File("Here Specify the path of Folder....."); // For file deletion.
        // if(obj.delete()){
        //     System.out.println("File " + obj.getName() + " is deleted.");
        // }
        // else{
        //     System.out.println("File deletion failed.");
        // }
    }
}
