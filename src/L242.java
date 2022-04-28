import java.util.HashMap;
import java.util.Map;

public class L242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for (char c : t.toCharArray()) {
//            if (map.containsKey(c) && map.get(c) > 0) {
//                map.put(c, map.get(c) - 1);
//            }else {
//                return false;
//            }
//        }
//        return true;
        int[] letterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            letterCount[t.charAt(i) - 'a']--;
        }
        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
