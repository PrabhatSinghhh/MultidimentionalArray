package MultidimentionalArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a= {{1,4,5},{2,1,2}};
        int[][] b= {{1,0,1,3},{1,4,5,3},{4,3,2,2}};
        if (a[0].length!= b.length){
            System.out.println(" multiplication not possible ");
        }else{
            int [][] c = new int[a.length][b[0].length];
            for (int i = 0; i < c.length ; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j]+= a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
