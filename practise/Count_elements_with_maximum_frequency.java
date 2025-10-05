import java.util.*;
class Solution {

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFreq = Collections.max(freqMap.values());

        // Sum the occurrences of elements with maximum frequency
        int total = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
