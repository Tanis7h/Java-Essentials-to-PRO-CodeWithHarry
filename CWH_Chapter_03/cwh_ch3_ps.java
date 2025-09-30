package CWH_Chapter_03;
import java.util.Scanner;
public class cwh_ch3_ps {
    public static void main(String[] args) {
        //Problem 1
        String Name = "To My Friend";
        Name = Name.replace(" ", "_");
        System.out.println(Name);


        //Problem 2
        System.out.print("Enter Your Name! ");
        Scanner i = new Scanner(System.in);
        String a = i.nextLine();
        String letter = "Dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>",a );
        System.out.println(letter);


        //Problem 2
        String myletter = "This Letter contains double  and triple   spaces";
        System.out.println(myletter.indexOf("  ")); 
        System.out.println(myletter.indexOf("   "));
        
        
        //Problem 3
        String Myletter = "Dear Harry\n\t  this course is very nice.\n\t  Thankyou";
        System.out.println(Myletter);
    }
}
