public class cwh_ch6_ps_pr06_07 {
    public static void main (String[] args) {
        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;
        int[] arr = {4,58,399,9845,96};
        int max = arr[0];
        int min = arr[0];
        for(int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
    System.out.printf("The maximum value of array is %d, and the minimum value is %d",max,min);
    }
}