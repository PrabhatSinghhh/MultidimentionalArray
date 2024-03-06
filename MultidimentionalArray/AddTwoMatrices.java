package MultidimentionalArray;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a= {{1,2,9},{2,5,6},{7,8,9}};
        int[][] b= {{9,8,9},{7,6,5},{6,7,8}};
        int m =a.length, n= b.length;
        int [][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
