class Solution {
    public int strStr(String haystack, String needle) {
        int l= needle.length();
        for(int i=0; i<=haystack.length()-l; i++){
            String sub= haystack.substring(i,i+l);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}