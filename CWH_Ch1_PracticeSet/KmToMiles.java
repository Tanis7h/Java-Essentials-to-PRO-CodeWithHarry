package CWH_Ch1_PracticeSet;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Value in kilometers to convert ");
        Float km = x.nextFloat();

        System.out.print(km*0.621371);
    }
}