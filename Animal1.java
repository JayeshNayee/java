// class Animal
// {
//     String color;
//     int age;
//     // using method ****1*****
//    public void inObj(String c, int a)
//    {
//     color = c;
//     age = a;
//    }
//    public void disply()
//    {
//     System.out.println(" Method using Color is a " + color  + "Age is " +age);
//    }
//    public static void main(String[] args) {
//     Animal dog = new Animal();
//     //* using refernce variable **********/
//     dog.color = "yellow";
//     dog.age = 22;
//     System.out.println("Reference variable using "+dog.color + " "+ dog.age);
//     dog.inObj("red  ", 10);
//     dog.disply();
//    }
// };



/*Constructor****/
// class Animal
// {
//     /* (1) Using default constructor */
//     void run(){
//         System.out.println("Hey i am in run method");
//     }
//     /* (2) Using Parameterized constructor */
//     Animal(){
//         System.out.println("Hey i am in Animal Constructor ");
//     }
//     /* (3) Using type of Parameterized constructor */
//     Animal(int a){
//         System.out.println(a + " 'int' type of Constructor");
//     }
//     Animal(String j){
//         System.out.println(j +" \"String\" type of constructor");
//     }
//     public static void main(String[] args) {
//        Animal A1 = new Animal();
//        A1.run();
//        Animal A2 = new Animal(10);
//        Animal A3 = new Animal("jayuu");
//     }
// }
/* FINAL KEYWORD     */
// final class Animal
// {
//     final void run()
//     {
//         System.out.println("Hey i am in run method");
//     }  
//     public static void main(String[] args) {

//         Animal A1 = new Animal();
//         A1.run();
//         Animal1 A2= new Animal1();
//         A2.run();
//     /* Final keyword using for variable */
//     //   final  int i = 10;
//     //   i = i + 20;
//     // System.out.println(i);
//     }
// }
// class Animal1 extends Animal
// {
//    void run(){
//         System.out.println("Animal1");
//     }
// }
/* Super keyword can be used to invoke parent class of instance variable */
class A
{
    int i=30;
     
}
class B extends A
{
  
    public static void main(String[] args) {
        B obj = new B();
         obj.show(10);
    }  
    void show(int i){
        i = 20;
        System.out.println("Current "+i); // 10
        System.out.println("This "+this.i); // 20 
        System.out.println("Super "+super.i); // 30
    }
}







