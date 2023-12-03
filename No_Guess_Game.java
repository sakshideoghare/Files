import java.util.Random;
import java.util.Scanner;
class Game{
    int com_no;
    public Game(){
        Random ran = new Random();
        com_no = ran.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
        System.out.println("You will have only 10 itteration for guessing a number");
    }
    public int computerNo(){
        return com_no;
    }
}
public class No_Guess_Game{
    static int takeUserInput(){
        int guess; 
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        guess=sc.nextInt();
        return guess;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NO. Guess");
        }
        else if(i>j){
            System.out.println("Your No. is higher than computer No.");
        }
        else {
            System.out.println("Your No. is lower than computer No.");
        }
    }
    public static void main(String[] args) {
        int guess=0,com_no=0,itteration=0;
        Game g = new Game();
        do {
           guess = takeUserInput();
            com_no = g.computerNo();
            isCorrectNumber(guess, com_no);
            itteration++;
            {
                if(itteration>10){
                    System.out.println("You are preforming itterations out of the range of itterations.");
                    System.out.println("You loose the game");
                    System.out.println("The right answer was:"+com_no);
                    return; 
                }
            }
        }
        while (guess!=com_no);
        System.out.println("Congratulations! You Win!");
        System.out.println("You guess correct nunmber.");
        System.out.println("You guess number in "+ itteration+" itterations.");
        System.out.println("Your Score is "+((11-itteration)*10)+" Out of 100");
    }
}