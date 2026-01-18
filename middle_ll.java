import java.util.Scanner;
class middle_ll{
    int data;
    middle_ll next;

    public middle_ll(int da){
        this.data= da;
        this.next=null;
    }

    public static void main(String[] args) {

        middle_ll h= createll(4);
        System.out.println("Middle value is:"+middle(h));


    }

    public static middle_ll createll(int n){
        middle_ll head= new middle_ll(1);
        middle_ll temp= head;

        Scanner sc= new Scanner(System.in);
        for(int i=1;i<n;i++){
            int de= sc.nextInt();
            temp.next= new middle_ll(de);
            temp=temp.next;


        }
        return head;

    }

    public static int middle(middle_ll head){
        middle_ll slow= head;
        middle_ll fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }
}