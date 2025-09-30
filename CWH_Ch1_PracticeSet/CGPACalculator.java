package CWH_Ch1_PracticeSet;
import java.util.Scanner;

public class CGPACalculator{
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the first subject marks ");
        double subject1 = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter the second subject marks ");
        double subject2 = a.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter the third subject marks ");
        double subject3 = a.nextDouble();

        double cgpa = (subject1+subject2+subject3)/30;
        System.out.print("CGPA is: ");
        System.out.print(cgpa);
    }
}