class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        nums= cyclic_Sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= i+1){

                list.add(nums[i]);

            }
        }
        return list;
    }

    public int[] cyclic_Sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // swap
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