class n{

public static void main(String[] args) {
int x=4;
System.out.println("using multiplication: ");
    mul(x);
    System.out.println("using recursion: ");
    System.out.println(fact(x));
    System.out.println("natural numbers using recursion: ");
    fun(5,1);
    System.out.println("\npower of a numbers using recursion: ");
    System.out.println(power(3,3));


}

public static int fact(int x){
    while(x>0){

        if(x==1){
            return 1;
        }
        else{
            return x*fact(x-1);

        }
    }
    return -1;
}

public static void mul(int x){
    int ans=1;
    while(x>0){
        ans=ans*x;
        x-=1;
    }
    System.out.println(ans);
}

public static void fun(int n, int i){
        if(i==n+1){
            return;
        }
        else {
            System.out.print(i + " ");
            fun(n, i + 1);
        }
    }

    public static int power(int x, int e){
    if(e==0){
        return 1;
    }
    else{
        return x*power(x, e-1);
    }
    }

}

