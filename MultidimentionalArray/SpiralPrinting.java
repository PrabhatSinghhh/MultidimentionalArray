package MultidimentionalArray;

public class SpiralPrinting {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {3, 4, 6, 7}, {8, 9, 7, 6}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        System.out.println();

        //spiral printing
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            // Left to Right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;

            // Top to Bottom
            if (minr >maxr || minc>maxc)break; {
                for (int i = minr; i <= maxr; i++) {
                    System.out.print(arr[i][maxc] + " ");
                }
                maxc--;
            }

            // Right to Left
            if (minr >maxr || minc>maxc)break; {
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;
            }

            // Bottom to Top
            if (minr >maxr || minc>maxc)break; {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }
        }
    }
}
