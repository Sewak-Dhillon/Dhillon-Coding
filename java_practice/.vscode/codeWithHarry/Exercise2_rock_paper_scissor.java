import java.util.*;

public class Exercise2_rock_paper_scissor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int user_score = 0;
    int comp_score = 0;
    int n = 5;
    while(n != 0){
    String comp = "";
    System.out.print("ROCK PAPER SCISSOR : ");
    String user = sc.next();
    Random rand = new Random();
    int num = 1 + rand.nextInt(3);
    switch(num){
        case 1 -> comp = "rock";
        case 2 -> comp = "paper";
        case 3 -> comp = "scissor";
    }
    System.out.println(comp);
    System.out.println(user);
    if(user.equals("rock") && comp.equals("scissor") || user.equals("paper") && comp.equals("rock") || user.equals("scissor") && comp.equals("paper")){
        user_score++;
    }
    else if(user.equals(comp)){
        user_score++;
        comp_score++;
    }
    else{
        comp_score++;
    }
    n--;
}
System.out.println("Userscores : " + user_score + " and Computerscores : " + comp_score);
if(user_score > comp_score){
    System.out.println("You won the game by " + user_score + " Scores.");
}
else if(comp_score > user_score){
    System.out.println("Computer won the game by " + comp_score + " Scores.");
}
else{
    System.out.println("Game is Draw both having same Scores.");
}
    sc.close();
}
}