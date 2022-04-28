import java.util.*;

public class L349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums1) {
            map.put(num, 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultSet.add(num);
            }
        }
        Integer[] temp = resultSet.toArray(new Integer[]{});
        int[] result = new int[resultSet.size()];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
