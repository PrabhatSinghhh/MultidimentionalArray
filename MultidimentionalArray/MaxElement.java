package MultidimentionalArray;
//Write a JAVA program to find the largest element of a
//given 2D array of integers.
public class MaxElement {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,15}};
        int m= arr.length, n= arr[0].length;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max= Math.max(max,arr[i][j]);

            }
        }
        System.out.println("The maximum element in the array are "+max);

    }
}
