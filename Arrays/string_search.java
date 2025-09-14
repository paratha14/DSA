class string_search{
    public static void main(String[] args) {
        string_search obj= new string_search();
        String s="Pratham";
        char tar= 'a';
        System.out.println(obj.checker(s, tar));
    }

    boolean checker(String str, char target){
        int l=str.length();
        for(char i: str.toCharArray()){

         if(i==target)
             return true;
        }
        return false;
    }
}