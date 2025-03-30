class A {
    int var1 = 10;

}

class B extends A {
    int var2 = 20;
}

class C extends B {
    int var3 = 30;

}

class D {
    public static void main(String[] args) {
        B sc = new B();
        System.out.println(sc.var1);
    }
}
