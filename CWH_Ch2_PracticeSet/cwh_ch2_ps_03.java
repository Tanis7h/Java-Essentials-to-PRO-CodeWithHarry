package CWH_Ch2_PracticeSet;
import java.util.Scanner;
public class cwh_ch2_ps_03 {
    public static void main(String[] args) {
        System.out.println("Enter The Number To Check: ");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        System.out.println(a>8);
    }
}