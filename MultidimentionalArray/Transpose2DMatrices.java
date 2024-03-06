package MultidimentionalArray;

public class Transpose2DMatrices {
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
        for (int j = 0; j < n; j++) {
            for (int[] ints : arr) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
