class A {
    public int a =100;
    public A(){
        super();
        System.out.println(this.a);
    }
} // End of class A
class B extends A {
    public int a =80;
    public B(){
        super();
        System.out.println(this.a);
    }
} // End of class B
class C extends B {
    public int a =60;
    public C() {
        super();
        System.out.println(this.a);
    }
} // End of class C
class D extends C {
    public int a =40;
    public D(){
        super();
        System.out.println(this.a);
    }
} // End of class D
// NOTE : The variable named ‘a’ is used in above classes is the instance field of each class
class E extends D {
    public int a = 10;

    public E() {
        super();
        System.out.println(this.a);
    }

    public void show() {
        int a = 0;
        System.out.println(a);
        class Test {
            public static void main(String args[]) {
                new E().show(); // This is an example of anonymous object
                A a1 = new E();
                D d1 = (D) a1;
            }
        }
    }
}