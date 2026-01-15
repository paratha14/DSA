class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] ans= new int[n];
        for(int i= 0; i<nums1.length; i++){
            int ele= nums1[i];
            int c=0;
            for(int j=0;j<nums2.length;j++){

                if(ele == nums2[j]){
                    int k=checker(nums2, j);
                    ans[i]=k;
                    c++;
                    break;
                }

            }
            if(c==0){
                ans[i]=-1;
            }
        }

        return ans;
    }

    public int checker(int[] a, int pos){
        for(int i=pos+1; i<a.length;i++){
            if(a[i]>a[pos]){
                return a[i];
            }
        }
        return -1;
    }
}