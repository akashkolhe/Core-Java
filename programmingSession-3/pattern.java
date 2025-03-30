class pattern{
    public static void main(String[] args) {
        int k=0,row=5;
        for (int i=1;i<=row;i++,k=0) { 
            for(int s=1 ; s<=row-i;s++){  
                System.out.print("  "); }
           for(;k!=2*i-1;k++) {
            System.out.print("* "); }
            System.out.println();}}}