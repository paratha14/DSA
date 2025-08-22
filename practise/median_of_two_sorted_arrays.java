import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged= merger(nums1, nums2);
        Arrays.sort(merged);
        double med=0.0;
        if(merged.length%2!=0){
            med=merged[(merged.length/2)];

        }
        else{
            int a=merged[(merged.length/2)];
            int b=merged[(merged.length/2)-1];
            med=(a+b)/2.0;

        }
        return med;

    }
    public int[] merger(int[] a, int[] b){
        int al= a.length;
        int bl= b.length;
        int[] mer=new int[al+bl];
        int i=0;
        for(int ele: a){
            mer[i]=ele;
            i++;
        }
        for(int el: b){
            mer[i]=el;
            i++;
        }
        return mer;
    }


}