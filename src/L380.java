import java.util.*;

public class L380 {
}

class RandomizedSet {

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        if (list.get(list.size() - 1) == val) {
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        int valIndex = map.get(val);
        int lastVal = list.get(list.size() - 1);
        list.set(valIndex, lastVal);
        list.remove(list.size() - 1);
        map.put(lastVal, valIndex);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
