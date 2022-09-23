// import java.util.*;

public class Practice_set4 {
    public static void main(String[] args) {

        // Problem 1
        // float [] arr = {45.6f,59.6f,96.3f,89.6f};
        // boolean b = false;
        // float sum = 0;
        // for(float e : arr){
        // sum += e;
        // if(89.6f == e){
        // b = true;
        // break;
        // }
        // }
        // if(b){
        // System.out.println("Element present in Array.");
        // }else
        // System.out.println("Element not present in Array.");

        // System.out.println("Sum = " + sum);
        // System.out.println("Lenght of arr = " + arr.length);

        // Problem 2

        // System.out.println("Adding Two matrix of Size 2x3.");
        // Scanner sc = new Scanner(System.in);
        // int [] [] matrix1 = new int [2][3];
        // int [] [] matrix2 = new int [2][3];
        // int [] [] result = new int [2][3];
        // for(int i = 0;i<matrix1.length;i++){
        // for(int j = 0; j < matrix1[0].length;j++){
        // System.out.print("matrix1[" + i + "][" + j +"] : ");
        // matrix1[i][j] = sc.nextInt();
        // System.out.println();
        // }
        // }
        // for(int i = 0;i<matrix2.length;i++){
        // for(int j = 0; j < matrix2[0].length;j++){
        // System.out.print("matrix2[" + i + "][" + j +"] : ");
        // matrix2[i][j] = sc.nextInt();
        // System.out.println();
        // }
        // }
        // System.out.println("After Addition resultant Array.");
        // for(int i = 0;i<result.length;i++){
        // for(int j = 0; j < result[0].length;j++){
        // result[i][j] = matrix1[i][j] + matrix2[i][j];
        // System.out.println("result[" + i + "][" + j +"] : " + result[i][j]);
        // }
        // }

        // System.out.println("\nPrinting the Arrays.\n");
        // for(int i = 0;i<matrix1.length;i++){
        // for(int j = 0; j < matrix1[0].length;j++){
        // System.out.print(matrix1[i][j] +" ");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // for(int i = 0;i<matrix2.length;i++){
        // for(int j = 0; j < matrix2[0].length;j++){
        // System.out.print(matrix2[i][j] +" ");
        // }
        // System.out.println();
        // }
        // sc.close();

        // Problem 3

        // float [] arr = {45.6f,59.6f,96.3f,89.6f};
        // int l = arr.length;
        // for(float e : arr){
        // System.out.println(e);
        // }
        // for(int i = 0;i<(l/2);i++){
        // Float temp = arr[i];
        // arr[i] = arr[l-i-1];
        // arr[l-i-1] = temp;
        // }
        // System.out.println("After revering an array.");
        // for(float e : arr){
        // System.out.println(e);
        // }

        // Problem 4

        int[] arr = { 20, 30, 50, 81, 92, 1, 53, 74, 82, 5 };
        int max = 0;
        int c1 = 0;
        int c2 = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (max < arr[i]) {
                    max = arr[i];
                    c1 = i;
                }
            } else
            if (max < arr[i + 1]) {
                max = arr[i + 1];
                c1 = i + 1;
            }

            if (arr[i] > arr[i + 1]) {
                if (min > arr[i + 1]) {
                    min = arr[i + 1];
                    c2 = i + 1;
                }
            } else
            if (min > arr[i]) {
                min = arr[i];
                c2 = i;
            }
        }
        System.out.println("Maximum value is " + max + " present at " + c1 + " index inside array.");
        System.out.println("Minimum value is " + min + " present at " + c2 + " index inside array.");

        // int[] arr = { 20, 30, 50, 81, 92, 1, 53, 74, 82, 5 };
        // Arrays.sort(arr);
        // System.out.println("Largest element of arr[] is " + arr[arr.length-1]);
        // System.out.println("Smallest element of arr[] is " + arr[0]);

        
    }
}
