import java.io.*;
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
/* Super keyword can be used to invoke parent class of instance variable 
class A
{  
    //  int i = 10;
     A(){
        System.out.println("I am in ShowA");
    }
}
class B extends A
{
    // int i =20;  
     B(){
        super();
        // super.showA();
        // System.out.println(super.i );
        // System.out.println(this.i);
        System.out.println("I am in ShowB");
    }
    public static void main(String[] args) {
        B obj = new B();
         
    }
}*/

/************************************************ */
// class B{
// public static void main(String[] args) {
//     File f1 = new File("e:\\ICT.JAVA\\Jd.txt");
//     // create karo
//     try{
//             if(f1.createNewFile()){
//                 System.out.println("File sucessfully created...");
//             }
//             else{
//                 System.out.println("File is already existy");
//             }

//         }
//         catch(IOException i){

//         }
//     }
    
//}
/*************************************************** */
/*INFORMACTIO 
class B{
     public static void main(String[] args)throws IOException {
        File f_infomaction = new File("e:\\ICT.JAVA\\Jd.txt");

        if(f_infomaction.exists()){
                System.out.println("Name of File : "+ f_infomaction.getName());
                System.out.println("file location : "+f_infomaction.getAbsolutePath());
                System.out.println("File is writeable: "+ f_infomaction.canWrite());
                System.out.println("File is Readable :"+ f_infomaction.canRead());
                System.out.println("File size : "+ f_infomaction.length());
                System.out.println("File Delete : "+ f_infomaction.delete());
            }
        else{
            System.out.println("File does not exists");
        }
     }
}*/


class B{
    public static void main(String[] args)throws IOException{
            FileWriter f_Writer = new FileWriter("e:\\ICT.JAVA\\Jd.txt") ;
        
            try
                {
                f_Writer.write(" ER.Jayesh Nayee");
                }
            finally
            {
                f_Writer.close();
            }
            System.out.println("Sucessfully data wrote in file");
    }
   
        }







