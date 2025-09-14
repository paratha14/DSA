import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        nums = cycleSort(nums);
        List<Integer> ls = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ls.add(i + 1);
            }
        }
        return ls;
    }

    public int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // Swap to correct position
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
