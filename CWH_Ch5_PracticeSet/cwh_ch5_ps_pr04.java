package CWH_Ch5_PracticeSet;
import java.util.Scanner;
public class cwh_ch5_ps_pr04 {
    public static void main(String[] args) {
        // To print the multiplication table of any number in reverse order
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for table:- ");
        int a = sc.nextInt();
        
        System.out.print("Enter the number from where you want the reverse multiplication table:- ");
        int b = sc.nextInt();
        for (; b >= 0; b--) {
            System.out.printf("%d X %d = %d \n", a, b, a * b);
        }
    }
}
