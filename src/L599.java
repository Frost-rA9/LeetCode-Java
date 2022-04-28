import java.util.ArrayList;
import java.util.HashMap;

public class L599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int index = 0; index < list1.length; index++) {
            map.put(list1[index], index);
        }
        ArrayList<String> res = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int j = map.get(list2[i]);
                if (i + j < sum) {
                    res.clear();
                    res.add(list2[i]);
                    sum = i + j;
                } else if (i + j == sum) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
