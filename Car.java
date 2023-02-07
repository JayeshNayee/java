abstract class Person
{ 
abstract void speeak();
};

class Jayesh  extends Person
{
void speeak()
{
    System.out.println("Jayesh is speek");
}
public static void main(String[] args) {
    Nayee n2 = new Nayee();
    n2.speeak();
    Jayesh j2 = new Jayesh();
    j2.speeak();
}
}
class Nayee extends Person
{
    void speeak()
    {
        System.out.println("Nivi is speek");
    }
}