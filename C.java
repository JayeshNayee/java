// class A{

//     void show()
//     {
//         System.out.println("I am in A");
//     }
// }

//  class B  extends  A{
//     void show(){
//         System.out.println("I am in B");
//     }
// }
// class C extends A
// {
//     void show(){
//         System.out.println("I am in C");
//     }
//     public static void main(String[] args) {

//         A a1 = new A();
//         a1.show();
//         System.out.println("******");
//         B b1 = new B();
//         b1.show();
//         b1.show();
//         System.out.println("******");
//         C c1 = new C();
//         c1.show();
      
//         c1.show();
     
//     }
// }

class ThreadProgram extends Thread
{
   public void Run(){
        for(int i = 1 ; i<=5 ; i++)
        {
            System.out.println("Jayesh");
        }
    }
    public static void main(String[] args) {

        ThreadProgram t1 = new ThreadProgram();
        t1.start();
        
        for(int i = 1 ; i<=5 ; i++)
        {
            System.out.println("Pragnesh");
        }
    }
}