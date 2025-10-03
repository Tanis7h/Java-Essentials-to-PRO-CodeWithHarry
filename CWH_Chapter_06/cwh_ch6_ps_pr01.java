import java.util.Scanner;
public class cwh_ch6_ps_pr01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float[] floats = {a,b,c,d,e};

        float sum=0;
        for(int i=0;i<floats.length;i++){
            sum += floats[i];
        }
        System.out.println(sum);
    }
}
