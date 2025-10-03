public class cwh_ch6_ps_pr03 {
    public static void main(String[] args) {
        double[] marks={70.5,60.5,80,95,75};
        double sum=0;
        for (double d : marks) {
            sum +=d;
        }
        double avg = sum/(marks.length);
        System.out.println("The average of marks is "+avg);
    }
}
