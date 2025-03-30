class Akash {
    static int search(int x[],int ele) {
        for(int i =0;i<x.length-1;i++) {
            if(x[i] == ele) {
                return i;
            }
            return -1;
        }
        public static void main(String[] args)
         {
            int a[] = {12,57,89,56,98};
            int n = search(a,89);
            if(-1 == n)
            {
                System.out.println("element is not");
            }
            else
            {
                System.out.println("element is there "+n);
            }
        }
    }
}