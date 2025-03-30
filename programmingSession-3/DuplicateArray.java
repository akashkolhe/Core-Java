class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 5, 7, 2, 1, 4, 6, 5, 8 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println("After removing duplicates");
        for (int k = 0; k <= arr.length - 1; k++) {
            if (arr[k] != 0)
                System.out.println(arr[k]);
        }
    }
}