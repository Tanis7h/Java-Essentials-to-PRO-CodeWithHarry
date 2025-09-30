package CWH_Chapter_04;
import java.util.Scanner;
public class cwh_ch4_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Que 1

        System.out.print("Enter The total marks for each subject: ");
        Double total = sc.nextDouble();
        System.out.print("Enter the marks obtained in First subject ");
        Double sub1 = sc.nextDouble();
        System.out.print("Enter the marks obtained in Second subject ");
        Double sub2 = sc.nextDouble();
        System.out.print("Enter the marks obtained in Third subject ");
        Double sub3 = sc.nextDouble();

        double a = total*0.33;
        double sum = total*3;

        if (sub1>=a){
            System.out.println("Passed in First Subject ");
            }
        else{
            System.out.println("Failed in First Subject ");}
        if (sub2>=a){
            System.out.println("Passed in Second Subject ");
        } else {
            System.out.println("Failed in Second Subject ");}
        if (sub3>=a){
            System.out.println("Passed in Third Subject ");
        } else {
            System.out.println("Failed in Third Subject ");
        }

        double avg = (sub1+sub2+sub3);

        if (avg>=(sum*0.4) && sub1>=a && sub2>=a && sub3>=a){
            System.out.println("Overall Passed");
        }
        else{System.out.println("Overall Failed");}


        // Que 2

        System.out.print("Enter your income in Lakhs: ");
        double amt = sc.nextDouble();

        if (0<=amt && amt<=2.5) {
            System.out.println("No Tax applied in your income!");
        }
        else if (2.5<amt && amt<=5.0){
            System.out.print("Tax to be paid is: " + (amt-2.5)*0.05);
        }
        else if (5.0<amt && amt<=10.0){
            System.out.print("Tax to be paid is: " + ((5-2.5)*0.05)+(amt-5.0)*0.2);
        }
        else if (10.0<amt){
            System.out.print("Tax to be paid is: " + (((5-2.5)*0.05)+((10-5)*0.2)+(amt-10)*0.3));
        }


        // Que 3

        System.out.print("Enter The number to find out the respective week day: ");
        int wd = sc.nextInt();

        switch (wd) {
            case 1:
                System.out.print("Monday!");
                break;
            case 2:
                System.out.print("Tuesday!");
                break;
            case 3:
                System.out.print("Wednesday!");
                break;
            case 4:
                System.out.print("Thursday!");
                break;
            case 5:
                System.out.print("Friday!");
                break;
            case 6:
                System.out.print("Saturday!");
                break;
            case 7:
                System.out.print("Sunday");
            default:
                System.out.print("Invalid Number, please provide number from 1 to 7 only");
                break;
        }


        // Que 4

        System.out.print("Enter the year to check wheather it's leap year or not: ");
        int year = sc.nextInt();
        if (year%4 == 0) {
            System.out.println("It's a Leap year");

            } else {System.out.print("Not a leap year");}


        // Que 5

        System.out.print("Enter The Domain name or url ");
        String url = sc.next();
        if (url.endsWith(".com")) {
            System.out.print("Commercial Website");
        }
        else if (url.endsWith(".org")) {
            System.out.print("Organisation Website");
        }
        else if (url.endsWith(".in")) {
            System.out.print("Indian Website");
        }
            }
}