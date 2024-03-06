package MultidimentionalArray;

public class Syntax {
    public static void main(String[] args) {
        int[][] arr=new int[2][3];
        arr[0][0]= 2;
        arr[0][1]= 9;
        arr[0][2]= 7;
        arr[1][0]= 6;
        arr[1][1]= 3;
        arr[1][2]= 5;
        int m= arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
