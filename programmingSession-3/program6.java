public class program6 {
public static void main(String [] args)
{
    System.out.println("from main");
    int a=10;
    int b=0;
    try {
        {
            int c=a/b;
            System.out.println(c);
        }
    
    } catch (Exception e) {
        System.out.println("exception handled");
        System.out.println("from catch-block");
        System.out.println(e);
    }
}
   
}
