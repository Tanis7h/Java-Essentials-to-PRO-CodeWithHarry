public class Practice_06 {
    public static void main(String[] args) {
        int[] marks;
        //marks= new int[];
        marks = new int[]{82,10,4,5};
        for (int i=0;i<marks.length;i++){
            System.out.printf("%d ",marks[i]);
        }
        for (int i : marks) {
            System.out.println(i);
        }

        int[][] flats;
        flats = new int[2][3];
        flats = new int[][]{{001,002,003,004},{101,102,103,104},{201,202,203,204}};
        for (int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.printf("%d ",flats[i][j]);
            }
            System.out.println("");
        }
    }
}