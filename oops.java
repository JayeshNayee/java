/*Thread using two ways  */
/*Performming single task to multi thread --->TRUE
 * Performing multi task to single thread ---> False
 */
// class oops extends Thread {
  
//     public static void main(String[] args){

//         newClass j1 = new newClass();
//         j1.start();
        
//        /*  newClass j2 = new newClass();
//         j2.start();

//         newClass j3 = new newClass();
//         j3.start();

//         newClass j4 = new newClass();
//         j4.start();*/
        
//         // nextNewClass nNC1 = new nextNewClass();
//         // nNC1.start();

//         // multiClass mC1 = new multiClass();
//         // mC1.start();
//     }
// };
// class  newClass extends Thread{

//     public void run() {
//         System.out.println("I am in newClass class");
//     }

// }
// class nextNewClass extends Thread {

//     public void run() {
//         System.out.println("I am in nextNewClass class");
//     }
// };
// class multiClass  extends Thread {
//    public void run(){
//         System.out.println("I am in multiClass class");
//     }
// }*/
/*------------------------------------------------------------------------ */
// public class oops  extends Thread {

//    public void run(){
//      Thread.yield();
//         try{
//             for(int i = 1; i<=5; i++){
//                 Thread.sleep(1000);
//                System.out.println("one pen"+i);
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//      }
//      public static void main(String[] args) {
//         oops o1 = new oops();
//         //Thread.yield();
//         for(int i = 1; i<=5; i++){
//             System.out.println("Many pens: "+i);
//          }
//         o1.start();
//      }
// }
/*----------------------------------------------------------------------------- */
/*INTERRUPTED METHOD */
// class Test extends Thread
// {
//     public void run(){
//     // System.out.println("A1:-" +Thread.interrupted());// true -> false
//     // System.out.println("B1:-"+Thread.currentThread().isInterrupted()); // true -> true 

//         try
//         {
//             for(int i = 1; i<=5; i++){
//             System.out.println(i);
//             Thread.sleep(1000);
//             //System.out.println("A1:-" +Thread.interrupted());
//             }
//         }
//         catch(Exception e){
//             System.out.println("Exception:- "+e);
//         }
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.start();
//         t1.interrupt();
//     }
// }
/*------------------------------------------------------------------------- */
// class Medical extends Thread {
//     public void run(){
//         try{
//             System.out.println("Start the process");
//             Thread.sleep(2000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
       
//     }
// }
// class TestDrive extends Thread{ 
//     public void run(){
//         try{

//         System.out.println("Start the Test drive process");
//         Thread.sleep(4000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class SignCard extends Thread{
//     public void run(){
//         try{
//         System.out.println("Sign then after take card");
//         Thread.sleep(5000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class oops{
//    public static void main(String[] args)throws Exception {
//     Medical M1 = new Medical();
//     System.out.println("Driving process");
//     Thread.sleep(1000);
//     M1.start();
//     M1.join();

//     TestDrive t1 = new TestDrive();
//     t1.start();
//     t1.join();

//     SignCard s1 = new SignCard();
//     s1.start();
//     s1.join();
// }
// }
/*--------------------------------------------------------------- */
