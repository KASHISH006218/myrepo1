import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("They are not anagrams.");
        }
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty(); // If all values match, map should be empty
    }
}