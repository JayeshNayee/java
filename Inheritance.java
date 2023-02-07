class A{

    void show()
    {
        System.out.println("I am in A");
    }
}

 class B  extends  A{
    void show(){
        System.out.println("I am in B");
    }
    
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
        A a1 = new A();
        a1.show();
    }
}
