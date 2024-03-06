package MultidimentionalArray;

public class TransposeMethod2 {
    public static void main(String[] args) {
        int[][] arr= {{12,34,55},{23,56,78},{67,89,56}};
        int m= arr.length, n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] transpose= new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <m; i++) {
                transpose[i][j]=arr[i][j];
                System.out.print(transpose[i][j]+" ");

            }
            System.out.println();
        }
    }
}
