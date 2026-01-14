class count{
    public static void main(String[] args) {
String x="abbada";
String y="abbaad";
count_sort(x,y);
    }
    public static void count_sort(String s1, String s2){
        int[] a= new int[26];
        int[] b= new int[26];
        for(int p=0;p<s1.length();p++){
            char ch= s1.charAt(p);
            a[ch-'a']+=1;
        }
        for(int p=0;p<s1.length();p++){
            char ch= s2.charAt(p);
            b[ch-'a']+=1;
        }
        for(int i=0;i<=25;i++){
            if(a[i]!=b[i]){
                System.out.println("is not Anagram");
                return;
            }
        }
        System.out.println("is Anagram");
        return;
    }
}