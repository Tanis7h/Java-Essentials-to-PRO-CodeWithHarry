package CWH_Ch5_PractiseSet;
import java.util.Scanner;
public class cwh_ch5_ps_pr09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum =0;
        System.out.print("Enter the number for the table:- ");
        int a = sc.nextInt();
        
        System.out.print("Enter the number till you want the multiplication table:- ");
        int b = sc.nextInt();

        for (int i=0; i<=b;i++){
            sum+=a*i;
        }
        System.out.printf("The sum of all numbers of the multiplication table of %d multiplied till %d is %d",a,b,sum);
    }
}
