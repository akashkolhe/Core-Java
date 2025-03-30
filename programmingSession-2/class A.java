class A 
{
    static int a;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(A.a);
        a=100;
        System.out.println(a);
        System.out.println(A.a);
        A.a=200;
        System.out.println(A.a);
        System.out.println(a);
        
        
        
        
    }
}