class Second
{
    // ( 1 )parent class k Acces modifier chota hona chahiye as comare to  child class default public and protected

      Object show(){
        System.out.println("II");
        return null;
    }
};
class first extends Second
{
    // child class kai acces modifier Badi honu chahiye
  
    Boolean show(){
     System.out.println("I");
        return false;
    }
     public static void main(String[] args) {
        first f1= new first();
        f1.show();
        Second s1 = new Second();
        s1.show();
    }
};
