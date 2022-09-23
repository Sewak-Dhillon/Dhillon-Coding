import java.util.Random;
import java.util.Scanner;

class game{
    private int rand_num,num;
    private int noofguess = 0;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    game(){
        rand_num = 1 + rand.nextInt(99);
    }
    public void takeUserinput(){
        System.out.print("Guess the number : ");
        num = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noofguess++;
        if(num == rand_num){
            System.out.println("Your Guess is right.");
            return true;
        }
        else if(num > rand_num){
            System.out.println("Guess a lower number.");
        }
        else if(num < rand_num){
            System.out.println("Guess a higher number.");
        }
        return false;
        
    }
    public int count_getter(){
        return noofguess;
    }
}

public class Exercise3_Guess_the_number {
    public static void main(String[] args) {
        game new_game = new game();
        boolean check = false;
        while(!check){
        new_game.takeUserinput();
        check = new_game.isCorrectNumber();
        }
        System.out.println("You guess the number in " + new_game.count_getter() +" times.");

                
    }
}
