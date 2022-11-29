package google_practice;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJump_Hard {

    public int oddEvenJumps(int[] arr) {
        // we can always jump to the end from the last index // count = 1
        int count = 1, n = arr.length;
        // initialize higher and lower jumps arrays
        boolean[] higher = new boolean[n], lower = new boolean[n];
        // last index jump is always allowed
        higher[n - 1] = lower[n - 1] = true;
        // use a tree map for natural ordering
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // key of map = value of array & value of map = index of array
        map.put(arr[n - 1], n - 1);
        for (int i = n - 2; i >= 0; i--) {
            // use the two brilliant treemap methods to get the desired odd and even jumps next entry
            Map.Entry<Integer, Integer> higherEntry = map.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> lowerEntry = map.floorEntry(arr[i]);
            // if higherEntry form the DP array
            if (higherEntry != null) higher[i] = lower[(int) higherEntry.getValue()];
            // if lowerEntry form the DP array
            if (lowerEntry != null) lower[i] = higher[(int) lowerEntry.getValue()];
            // since first jump is an odd jump / higher jump // hence a good index
            if (higher[i]) count++;
            // no matter what add the index to the map
            map.put(arr[i], i);
        }
        return count;
    }
}
