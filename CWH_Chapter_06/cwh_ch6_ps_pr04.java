public class cwh_ch6_ps_pr04 {
    public static void main(String[] args) {
    int[][] mat1 ={{6,3,8},
                  {25,7,12}};
    int[][] mat2 ={{16,33,68},
                   {85,73,78}};
    int[][] resultant={{0,0,0},
                       {0,0,0}};

    for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
            resultant[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1[i].length;j++){
            System.out.print(resultant[i][j]+" ");
            }
        System.out.println("");
        }
    }
}
