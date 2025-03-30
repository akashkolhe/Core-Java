import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book("Java", 420, 550);
        Book b2 = new Book("C", 100, 450);
        Book b3 = new Book("Python", 501, 499);
        Book b4 = new Book("PHP", 200, 999);
        Book arr[] = { b1, b2, b3, b4 };
        System.out.println("before sorting");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("after sorting");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);

        }
    }
}
