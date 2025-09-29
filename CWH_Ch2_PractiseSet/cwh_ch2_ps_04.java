package CWH_Ch2_PractiseSet;
import java.util.Scanner;
public class cwh_ch2_ps_04 {
    public static void main(String[] args) {
        System.out.println("Enter The Value: ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        double v = a.nextDouble();
        double u = b.nextDouble();
        double s = c.nextDouble();
        double A = d.nextDouble();
        
        System.out.println((v*v - u*u)/(2*A*s));
    }
}
