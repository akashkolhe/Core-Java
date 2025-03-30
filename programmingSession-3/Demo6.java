public class Demo6 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            System.out.println("this is catch block for exception");
        } catch (ArithmeticException e) {
            System.out.println("this is catch block for Arithmetic exception");
        } catch (RuntimeException e) {
            System.out.println("this is catch block for Runtime exception");
        } catch (Throwable e) {
            System.out.println("this is catch block for Throwable");
        }
    }
}
