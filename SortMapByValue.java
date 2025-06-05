import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        // Create an unsorted map
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 30);
        map.put("Mango", 20);

        // Convert map to list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort list by value (ascending)
        list.sort(Map.Entry.comparingByValue());

        // Print sorted list
        System.out.println("Sorted by values:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}