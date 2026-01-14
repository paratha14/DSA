import java.util.Arrays;
class solution{
    public static void main(String[] args) {
        String a= "a-bC-dEf-ghlj";
        reverse(a);
        int[] c= {9,9,9};
        arr(c,2);

    }

    public static void reverse(String a){
        int s=0;
        int e=a.length()-1;
        StringBuilder sb= new StringBuilder(a);
        while(s<=e){
            if(Character.isAlphabetic(a.charAt(s)) && Character.isAlphabetic(a.charAt(e))){
                char temp= a.charAt(s);
                sb.setCharAt(s, a.charAt(e));
                sb.setCharAt(e, temp);
                s++;
                e--;
            }
            else if(Character.isAlphabetic(a.charAt(s))!= true){
                s++;
            }
            else{
                e--;
            }

            }
        System.out.println(sb);
        }

        public static void arr(int[] arr, int n){
        if(arr[n] !=9){
            arr[n]= arr[n]+1;
        }
        else{
            arr[n]=0;
            arr(arr, n-1);

        }
        System.out.println(Arrays.toString(arr));
        }
    }
