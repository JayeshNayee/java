import javax.sound.midi.Soundbank;

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
/******************Examples******************* */
abstract class Shape
{
    abstract void area();   
}
class Triangle extends Shape
{
    void area(int b , int h){
        System.out.println("Area of Triangle is "+.5*b*h);
    }
}
class Rectangle extends Shape
{

    void area(int L , int w){
        System.out.println("Area of Rectangle is "+L*w);
    }
}
class Circule extends Shape
{

    void area(int r){
        System.out.println("Area of circule is "+ 3.14*r*r);
    }
    public static void main(String[] args) {
        Circule c1 = new Circule();
        c1.area(4);

        Rectangle r1 = new Rectangle();
        r1.area(4,6);

        Triangle t1 = new Triangle();
        t1.area(20 , 3);

    }
}