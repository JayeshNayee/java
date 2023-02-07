import javax.naming.ldap.ManageReferralControl;
import javax.print.DocFlavor.STRING;

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
// class B
// {
//     void show(){
//         System.out.println("I am in B class");
//     }
// }
// class OverRide extends B{

//     void show()
//     {
//         super.show();
//         System.out.println("I am in OverRide class");
//     }
//     public static void main(String[] args) {
//         OverRide o1 = new OverRide();
//         o1.show();
       
//     }
// }
// /******************Examples******************* */
// abstract class Shape
// {
//     abstract double area();   
// }
// class Triangle extends Shape
// { 
//     int B ,H;
//     Triangle(int b , int h){
//         B = b;
//         H = h;
//     }
//     double area(){
//       return (0.5*B*H);
//     }
// }
// class Rectangle extends Shape
// {
//     int L , W;
//     Rectangle(int l , int w){
//         L = l;
//         W = w;
//     }
//     double  area(){
//        return (L*W);
//     }
// }
// class Circule extends Shape
// {

//     float r;
//     Circule(float R){
//         r = R;
//     }
//     double area(){
//          return (3.14*r*r);
//     }
//     public static void main(String[] args) {
//         Circule c1 = new Circule(3.0f);
//         System.out.println("Area of circule is "+c1.area());

//         Rectangle r1 = new Rectangle(9,10);
//         System.out.println("Area of Rectangle is "+r1.area());

//         Triangle t1 = new Triangle(5,6);
//         System.out.println("Area of Triangle is "+t1.area());

//     }
// }

abstract class Vegetable
{
    String Vegcol;
    abstract  public String toString();
}
class Potato extends Vegetable
{
   public String toString(){

     Vegcol = "yellow";
        return Vegcol;
    }
}
class Brinjal extends Vegetable
{
   public  String toString(){
        Vegcol = "Violet";
        return Vegcol;
    }
}
class Tomato extends Vegetable
{
  public  String toString(){

    Vegcol = "Red";
    return Vegcol;
    }
    public static void main(String[] args) {
        Potato p1 = new Potato();
        System.out.println("Potato : "+ p1.toString());

        Brinjal b1 = new Brinjal();
        System.out.println("Brinjal "+b1.toString());

        Tomato t1 = new Tomato();
        System.out.println("Tomato "+ t1.toString());

    }
}