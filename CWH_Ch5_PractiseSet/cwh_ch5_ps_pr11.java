package CWH_Ch5_PractiseSet;
import java.util.Scanner;
public class cwh_ch5_ps_pr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number till which you want add all the even numbers:- ");
        int a = sc.nextInt();
        int sum=0;
        for (int i=0;i<a;i++){
            sum+=2*i;
        }
        System.out.println(sum);
    }
}
