public class Demo7 {
    public static void main(String[] args) {
        test();
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("This is block for Arithmetic exception");
        }
        catch (Exception e) {
            System.out.println("This is block for exception");
        }
        catch (Throwable e) {
            System.out.println("This is block for throwable");
        }

    }

    public static void test() {
        int a = 10 / 0;
    }
}
