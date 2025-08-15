class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start_pos = -1;
        int end_pos = -1;

        // Find start position (leftmost)
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                start_pos = mid;
            }
        }

        // Find end position (rightmost)
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                end_pos = mid;
            }
        }

        return new int[]{start_pos, end_pos};
    }
}
