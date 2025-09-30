package CWH_Chapter_05;
import java.util.Scanner;
public class cwh_ch5_ps_pr03 {
    public static void main(String[] args) {
        // To print the multiplication table of any number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for multiplication table:- ");
        int a = sc.nextInt();
        
        System.out.print("Enter the number till you want the multiplication table:- ");
        int b = sc.nextInt();
        for (int i=0; i<=b;i++){
            System.out.printf("%d X %d = %d \n",a,i,a*i);
        }
        
    }
}
