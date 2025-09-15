import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        nums= cyclic_Sort(nums);
        System.out.println(Arrays.toString(nums));

        return nums[nums.length-1];
    }

    public int[] cyclic_Sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int pos=arr[i]-1;

            if(arr[i]!= arr[pos]){
                int temp= arr[i];
                arr[i]= arr[pos];
                arr[pos]= temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}