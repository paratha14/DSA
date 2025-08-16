class Solution{
public int findInMountainArray(int target, int[]arr) {
        int peakindex= findPeak(arr);
        if(target==arr[peakindex]){
            return peakindex;
        }
        int left_index= findElement(arr,target, 0,peakindex-1);
        int right_index= findElement(arr, target, peakindex+1, arr.length-1);
        if(left_index!= -1){
            return left_index;
        }
        else{
            return right_index;
        }

    }

    public int findPeak(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int findElement(int[] arr, int target, int start, int end){

            while(start<=end){
                int mid= start + (end-start)/2;

                if(target==arr[mid]){
                    return mid;
                    }

                else if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }

            }
            return -1;
        }

}