package CWH_Ch1_PracticeSett;

import java.util.Scanner;

public class SumOfThreeNumbers{
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double x = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter the Second number: ");
        double y = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter the Second number: ");
        double z = c.nextDouble();

        double sum=x+y+z;
        System.out.print("Sum of Three NUmber is: ");
        System.out.print(sum); 
    }
}
