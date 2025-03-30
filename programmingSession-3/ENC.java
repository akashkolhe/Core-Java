import org.omg.CORBA.BAD_CONTEXT;

class ENC{
    public static void main(String[] args) {
        B s = new B();
        System.out.println(s.get());
        s.set(20);
        System.out.println(s.get());
        
    }

}
class B {
  private  int m = 10;

  public int get() {
    return m;
  }

  public void set(int newdata) {
    m = newdata;
 }

}
