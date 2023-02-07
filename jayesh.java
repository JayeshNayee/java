// abstract class Person
// { 
// abstract void speeak();
// };
// class jayesh  extends Person
// {
// void speeak()
// {
//     System.out.println("Jayesh is speek");
// }
// public static void main(String[] args) {
    
//     Nayee n2 = new Nayee();
//     n2.speeak();
//     jayesh j2 = new jayesh();
//     j2.speeak();
// }
// }
// class Nayee extends Person
// {
//     void speeak()
//     {
//         System.out.println("Nayee is speek");
//     }
// }



class jayesh {
    void show(){
        System.out.println("i am in show second method");
    }
    
}
class pd_nayee extends jayesh
{
    void show(){
        System.out.println("I am in first show method");
    }
    public static void main(String[] args) {
        pd_nayee p1 = new pd_nayee();
        p1.show();
    }
    
}



























