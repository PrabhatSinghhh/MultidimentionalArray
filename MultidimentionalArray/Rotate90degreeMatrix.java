package MultidimentionalArray;
public class Rotate90degreeMatrix {

public static void print(int[][] arr) {
    int m = arr.length;
    int n = arr[0].length;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Original matrix
        System.out.println("Original Matrix:");
        print(arr);

        // Transpose matrix

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Transposed matrix
        System.out.println("Transposed Matrix:");
        print(arr);
        //   Rotating the matrix

        for (int i = 0; i < n; i++) {
            int a= 0, b= n-1;
            while (a<b){
                int temp = arr[i][a];
                arr[i][a]= arr[i][b];
                arr[i][b]= temp;
                a++;
                b--;
            }
        }
        System.out.println("Rotate matrix: ");
        print(arr);
        }
    }

