package MultidimentionalArray;

public class SumOF2DArray {
    public static void main(String[] args) {
        int[][]arr= {{23,4,56,},{4,5,8},{9,8,7}};
        int m= arr.length, n= arr[0].length;
        int sum=0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("The of all the element in 2d Array is "+sum);
    }
}
