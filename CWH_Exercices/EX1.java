package CWH_Exercices;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        System.out.print("Enter the NAME of the STUDENT: ");
        String z = h.nextLine();

        System.out.println("Enter ALL the MARKS carefully to the respective subjects(OUT OF HUNDREAD) !!");

        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Marks obtained in MATHEMATICS: ");
        float a = i.nextFloat();

        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Marks obtained in ENGLISH: ");
        float b = j.nextFloat();

        Scanner k = new Scanner(System.in);
        System.out.print("Enter the Marks obtained in CHEMISTRY: ");
        float c = k.nextFloat();

        Scanner l = new Scanner(System.in);
        System.out.print("Enter the Marks obtained in PHYSICS: ");
        float d = l.nextFloat();

        Scanner m = new Scanner(System.in);
        System.out.print("Enter the Marks obtained in COMPUTER SCIENCE: ");
        float e = m.nextFloat();

        double sum = a+b+c+d+e;
        System.out.print("Out of 500 Sum of All the five subjects is ");
        System.out.println(sum);
        System.out.print("Total Percentage of ");
        System.out.print(z);
        System.out.print(" is: ");
        System.out.print(sum/5);
    }
}