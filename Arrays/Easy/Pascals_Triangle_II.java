import java.util.*;

public class Pascals_Triangle_II {

    public static List<Integer> BruteForce(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        // Generate Pascal's Triangle up to rowIndex
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            // Calculate middle elements
            for (int j = 1; j < i; j++) {
                row.add(
                    triangle.get(i - 1).get(j - 1)
                    + triangle.get(i - 1).get(j)
                );
            }
            // Last element is always 1
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        // Return only the required row
        return triangle.get(rowIndex);
    }
    public static List<Integer> Optimal(int rowIndex){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1 ; i<=rowIndex ; i++){
            row.add(1);
            for(int j=i-1 ; j>0 ; j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
        }
        return row;
    }
    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> result = BruteForce(rowIndex);
        //System.out.println(result);
        System.out.println(Optimal(rowIndex));
    }
}