public class Practice_set5 {
    static int fictorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }else
        return num * fictorial(num - 1);
    }
    static int sum(int num){
        if(num == 1){
            return 1;
        }else
        return num + sum(num - 1);
    }
    void fibonnaci(int max){
        int first = 0;
        int second = 1;
        int temp = 0;
        while(first<max){
            System.out.print(first + " ");
            temp = first + second;
            first =  second;
            second =  temp;
        }
    }
    void fibonnaci(int x, int y,int max){
        int temp = 0;
        while(max != 0){
            System.out.print(x + " ");
            temp = x + y;
            x =  y;
            y =  temp;
            max--;
        }
    }
    int sum(int ...arr){
        int total = 0;
        for (int e : arr){
        total += e;
        }
        return total;
    }
    static void display_pattern_inreverseorder(int row , int column){
        for(int i = 0;i<=row;i++){
            for (int j = i;j <= column;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void display_pattern_inorder(int row , int column){
        for(int i = row;i>=0;i--){
            for (int j = column;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patter_using_recussion(int num){
        // if(num>0){
        //     patter_using_recussion(num - 1);
        //     for(int i = 0;i<num;i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        if(num>0){
            for(int i = num;i>0;i--){
                System.out.print("* ");
            }
            System.out.println();
            patter_using_recussion(num - 1);
        }
    }
    

    public static void main(String[] args) {
        // Practice_set5 obj = new Practice_set5();
        // obj.fibonnaci(10);

        // System.out.println();

        // display_pattern_inreverseorder(5, 5);

        // System.out.println();

        // display_pattern_inorder(5, 6);

        // System.out.println("Sum of 1st hundred natural number is - " + sum(100));

        patter_using_recussion(5);




    }
}
