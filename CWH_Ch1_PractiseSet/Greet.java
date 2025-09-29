package CWH_Ch1_PractiseSet;
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the Name of the user ");
        String name = user.nextLine();

        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(", Have a Good Day");

    }
}