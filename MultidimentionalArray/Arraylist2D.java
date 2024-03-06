package MultidimentionalArray;
import java.util.*;

public class Arraylist2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();

        // Creating inner lists and adding individual elements
        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(10);
        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(34);

        // Adding inner lists to the list of lists
        a.add(innerList1);
        a.add(innerList2);
    }
}
