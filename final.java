/*final keyword with method */
//  class A {


//      final void show(){
//         System.out.print("I am in 1st method");
//     }

//     }
// class pr extends A {
//     void show(){
//         System.out.print("I am in 2nd method");
//     }
//     public static void main(String[] args) {
//         pr p1 = new pr();
//     }
// }
/**final keyword with variable  */
// class pr{
//     public static void main(String[] args) {
//         final int i = 10;
//         i += 20;
//         System.out.print(i);
//     }
// }
// /*final keyword with class */

//   final class A {

//     }
// class pr  {
    
//     public static void main(String[] args) {
//         System.out.print("H");
//     }
// }
/*SUPER KEYWORD  */
// class pr
// {
//     int i = 2;
// }
// class print extends pr {

//     int i = 20;
//     void show(int i){
//         System.out.println(i); // 30
//         System.out.println(this.i); //20
//         System.out.println(super.i);  // 2
//     }
//     public static void main(String[] args) {
//         print p1 = new print();
//         p1.show(30);
//     }
// }