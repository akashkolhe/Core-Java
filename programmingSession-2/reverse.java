class reverse{
    public static void main(String [] args){
        reverse obj = new reverse();
        String op = obj.reverse_no("Omkar");
        System.out.println(op);
       
    }
    
    public String reverse_no(String str){
        if(str.length() == 0 || str.length() == 1){
            return str;
        }
        char ch[] = str.toCharArray();
        String rev = "";
        for(int i =str.length()-1; i >=0;i--){
            rev = rev + ch[i];
        }
        return rev;
    }
}