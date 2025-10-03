public class cwh_ch6_ps_pr08 {
    public static void main(String[] args) {
        //int[] arr = {4,58,399,9845,96};
        int[] arr = {4,5,399,9845};
        Boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}