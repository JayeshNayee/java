class Dinesh{

    void showA(){
        System.out.println("IN SHOW A");
    }
}
class jayesh extends Dinesh
{
    void showB(){
        System.out.println("IN SHOW B");
    }
    public static void main(String[] args) {
        jayesh j1 = new jayesh();
        j1.showB();
        j1.showA();
    }
}