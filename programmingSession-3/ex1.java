class ex1{
    public static void main(String[] args) {
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 && j<5) {
                    System.out.print("*");
                }
                else if (i==1 && j<3) {
                    System.out.print("*");
                }
                else if (i==2 && j<1) {
                    System.out.print("*");
                }
                
            }
            System.out.println(" ");
       }
    }
}