import java.util.AbstractMap;

class Solution {
    public AbstractMap.SimpleEntry<Long, Long> getMinMax(int[] arr) {
        long min = arr[0];
        long max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new AbstractMap.SimpleEntry<>(min, max);
    }
}
