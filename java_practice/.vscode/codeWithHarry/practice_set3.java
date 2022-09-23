public class practice_set3 {
    public static void main(String[] args) {
        // Problem 1
        // for(int i=5;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<5;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Problem 2

        // int fict = 1;
        // int num = 5;

        // for(int i = 5;i>0;i--){
        //     fict *= i;
        // }

        // while(num != 0){
        //     fict *= num;
        //     num--;
        // }

        // System.out.println("Fictorial of number 5 is " + fict);

        // Problem 3
            for(int i = 1 ;i<=10;i++){
                System.out.println("2 x " + i + " = " + 2*i);
            }
            System.out.println("\nTable in reverse order\n");
            for(int i = 10 ;i>=1;i--){
                System.out.println("2 x " + i + " = " + 2*i);
            }

    }
}
