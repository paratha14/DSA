class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();
        while(l>0){
            l=l-1;
            if ((num.charAt(l) - '0') % 2 != 0) {
                return num.substring(0,l+1);
            }
        }
        return "";
    }
}