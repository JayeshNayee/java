class C{
    void showC(){
        System.out.println("I am in showC");
    }
}
class B extends C{
    void showB(){
        System.out.println("I am in showB");
    }
}
class A extends B{
    void showA(){
        System.out.println("I am in showA");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.showA();
        a1.showB();
        a1.showC();
        System.out.println("_______");
        B b1 = new B();
        b1.showB();
        b1.showC();
        System.out.println("_______");
        C c1 = new C();
        c1.showC();
    }
}
























