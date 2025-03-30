public class ArraySort {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 11, 6, 8, 12, 19, 15, 4 };

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array after Sorting");

        for (int k = 0; k <= arr.length - 1; k++) {

            System.out.print(arr[k] + "        ");
        }

    }
}
