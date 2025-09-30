package CWH_Ch5_PractiseSet;
import java.util.Scanner;
public class cwh_ch5_ps_pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TO PRINT THE SUM OF EVEN NUMBERS TILL "N"
        System.out.print("Enter the Number till which you want add all the even numbers:- ");
        int a = sc.nextInt();
        int sum=0;
        int i = 0;
        while (i<a) {
            int b = 2*i;
            sum = sum+b;
            System.out.println(b);
            i++;
        }
        System.out.println(sum);


        /*   CODE TO PRINT ALL THE EVEN NUMBERS TILL "N"

        System.out.println("All even Numbers till "+a+" are ");
         while (i<a) {
            int b = 2*i;
            System.out.println(b);
            i++;
            if (a==b) {
                break;
            }
            else if ((a-1)==b) {
                break;
            }
        }  
        */
    }
}
