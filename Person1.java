//*this keyword ni help throug instance variable ne invoke kari skya che currnent class na  */
// class Person1 {
//     int roll; // instance variable
//     String name;
//     Person1(int roll, String name) {
//         this.roll = roll;
//         this.name = name;
//     }

//     void show() {
//         System.out.println(this.roll +" " + this.name);
//     }

//     public static void main(String[] args) {
//         Person1 myobj = new Person1(11, "Jayesh");

//         myobj.show();

//}
//   }
//*************this keyword ni help through method ne invoke kari skya che currnent class na */
//class Person1
//{

//     void study(){
//         System.out.println("Students are study.. ");
//         this.chatt();
//     }
//     void chatt(){
//         System.out.println("Students are chatting.. ");
//     }
//     public static void main(String[] args) {
//         Person1 p1 = new Person1();
//         p1.study();
//       //  this.chatt();
//     }
//   }

// class Person1 {

//     String namString;

//     Person1(){
//         this("joni");
//         System.out.println("THIS ARE DEFAULT CONSTRUCTOR");
//     }
//     Person1(String namString) {

//         this.namString = namString;
//         System.out.println("THIS ARE Parametrixed CONSTRUCTOR");
//     }

//     void print() {
//         System.out.println(this.namString);
//     }

//     public static void main(String[] args) {
//         Person1 p1 = new Person1();
//         p1.print();

//     }
// }

/*THIS can be used to return current class instance from the method */
// class Person1
// {

//     void print(){
//         System.out.println("THImethod ");
    
//     }
//     Person1 person1()
//     {
//         System.out.println("THIS can be used to return current class instance from the method ");
//         // return new Person1();
//         return this;
//     }
//   public static void main(String[] args) {
//     Person1 p1 = new Person1();
//     p1.print();
//     p1.person1();

//   }
// }

/*THIS can be used to pass as argument in the constructor call */
