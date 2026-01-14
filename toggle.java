import java.util.Scanner;
class toggle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String ans= toggle(a);
        System.out.println("original string: "+a);
        System.out.println("toggled string is: "+ans);
    }

    public static String toggle(String s){
        String res="";
        for(int i=0; i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                char ch= s.charAt(i);

                ch-=32;
                res+=ch;

            }
            else{
                char ch= s.charAt(i);
                ch+=32;
                res+=ch;
            }
        }
        return res;
    }

    public static String bitToggle(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            res+=ch ^ 32;
        }
        return res;
    }
}
