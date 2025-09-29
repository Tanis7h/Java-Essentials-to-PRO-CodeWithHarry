package CWH_Exercices;
import java.util.Scanner;
import java.util.Random;

public class EX2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int totalround = 5;
        int round = 1;
        int user = 0;
        int comp = 0;
        System.out.println("Instructions:- \n0 refers to Rock \n1 refers to Paper \n2 refers to Scissors");
        while (round <= totalround) {
            System.out.println("Round "+round);
            int r1 = rand.nextInt(3);
            System.out.print("Choose a Selection From the Above Instructions :- ");
            int u1 = sc.nextInt();
            System.out.println("Computer Choose:- "+r1);
            if (r1 == u1 ){
                System.out.println("It's A Draw!");
                user++;
                comp++;
            }
            else if (u1==0 && r1 == 2 || u1 == 1 && r1 == 2 || u1 == 2 && r1 == 1){
                user++;
                System.out.println("You Won!");
                }
            else {
                comp++;
                System.out.println("You Loose");
            }
            round++;
        }
        System.out.println("Your Points:- "+user);
        System.out.println("Computer's Points:- "+comp);
        if (user>comp){
            System.out.println("YOU WON THE GAME");
        }
        else if (user==comp){
            System.out.println("Game Draw!");
        }
        else{
            System.out.println("You Loose!");
        }
    }
}