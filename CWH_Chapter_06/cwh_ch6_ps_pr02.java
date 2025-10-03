import java.util.Scanner;
public class cwh_ch6_ps_pr02 {
    public static void main(String[] args) {
        // Method 1
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the numbers ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float[] floats = {a,b,c,d,e};*/
        System.out.print("Enter the number to check if it's there or not ");
        float f = sc.nextFloat();
        /*
        for(int i=0;i<floats.length;i++){
            if (f==floats[i]) {
                System.out.println("Yes it is present");
                break;
            }
        }
*/
        // Method 2
        float[] fl ={84.3f,64.6f,69.9f,34.5f,99.6f};
        boolean isAnArray=false;
        for (float g : fl) {
            if (f==g) {
                isAnArray=true;
                break;
            }
        }
        if (isAnArray) {
            System.out.println("Yes it is present!");
        } 
        else{
            System.out.println("NO it isn't!");
        }
    }
}