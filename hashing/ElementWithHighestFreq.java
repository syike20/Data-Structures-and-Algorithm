import java.util.*;
class ElementWithHighestFreq{
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Step 1: Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Count frequency
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 3: Find highest frequency
        int maxFreq = 0;
        int maxElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        // Step 4: Print result
        System.out.println(maxElement + "->" + maxFreq);
      
    }
}