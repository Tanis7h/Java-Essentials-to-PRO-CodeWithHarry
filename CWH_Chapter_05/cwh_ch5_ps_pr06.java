package CWH_Chapter_05;
import java.util.Scanner;
public class cwh_ch5_ps_pr06 {
    public static void main(String[] args) {

        // To FIND THE FACTORIAL OF A GIVEN NUMBER with while loop
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to find it's factorial ");
        int f=sc.nextInt();
        int fct=1;
        while (f>0){
            fct*=f;
            f--;
        }
        System.out.println(fct);
    }
}
