import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int n= sc.nextInt();
        int i=1;
        int magic=0;

        while(n!=0){
            if((n&1)==1){
                magic= (int)(magic+Math.pow(5,i));
                i++;
                n=n>>1;
            }
            else{
                i++;
                n=n>>1;
            }
        }
        System.out.println("magic number is: "+ magic);
    }
}