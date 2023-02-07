// public class OverLoad {
//     void show(int a){
//         System.out.println("10");
//     }
//     void show(String a){
//         System.out.println("20");
//     }
    
//     public static void main(String[] args) {
//         OverLoad  m1 = new OverLoad();
//         m1.show(10);

//     }
// }

/*Method OverRide */
class B
{
    void show(){
        System.out.println("I am in B class");
    }
}
class OverRide extends B{

    void show()
    {
        System.out.println("I am in OverRide class");
    }
    public static void main(String[] args) {
        OverRide o1 = new OverRide();
        o1.show();
        B b1 = new B();
        b1.show();
    }
}