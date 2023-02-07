
// class jay implements Runnable
// {

//     public void run(){
//         System.out.println("jay: "+Thread.currentThread().getName());
//     }
//     public static void main(String[] args) {
//         System.out.println("main : "+Thread.currentThread().getName());

//         jay j1 = new jay();
//         Thread t0 = new Thread(j1);
//         t0.setName("Nayi");
//         t0.start();

//         Test t1 = new Test();
//         Thread th = new Thread(t1);
//         th.start();
//         th.setName("jay");
//         th.isAlive();

//         nextTest nt = new nextTest();
//         Thread th2 = new Thread(nt);
//         th2.start();
//         th2.isAlive();

//     }
// }; 
// class Test extends Thread
// {
//     public void run(){
//         System.out.println("Test: "+Thread.currentThread().getName()+" "+isAlive());
//     }
// }  
// class nextTest extends Thread
// {
//     public void run(){
//         System.out.println("newTest: "+Thread.currentThread().getName()+ " "+isAlive());
//     }
// }

// class jay extends Thread
// {
//     public void run(){
//         if(Thread.currentThread().isDaemon()){
//             System.out.println("daemon method");
//         }
//         else {
//             System.out.println("child method");
//         }
//     }
//     public static void main(String[] args) {
//         Thread.currentThread().setDaemon(true);
//         System.out.println(" main method ");
//         jay j1 = new jay();
       
//         j1.setDaemon(true);
//         j1.start();
//     }
// }
// class jay extends Thread 
// {
//     public static void main(String[] args)throws Exception{
    
//         for(int i = 1; i<=5; i++){
//             Thread.sleep(1000);
//             System.out.println(i);
//         }
//     }

// }
//--------------------------------------------------------------------
/*___PRIORITY______ 
class jay extends Thread {

    public void run(){
        System.out.println("Run priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        jay j1 = new jay();
        System.out.println("old priority : "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("new priority : "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        j1.setPriority(4);
        j1.start();
    }
}*/
//--------------------------------------------------------------------
/*class jay extends Thread
{
    public void run(){
        try {
            for(int i = 1; i<=5; i++){
                Thread.sleep(1000);
                System.out.println(i+" " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        jay j1 = new jay();
        j1.start();

        jay j2 = new jay();
        j2.run();
    }
}*/
//--------------------------------------------------------------------
/*yield method
class jay extends Thread {
    public void run(){
        Thread.yield();
        try
        {
        for(int i = 1; i<=5; i++)
        {
            
            System.out.println(" One Chocolate --" + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        }
    catch(Exception e){
        System.out.println(e);
    }
}
    public static void main(String[] args){
    
        for(int i = 1; i<=5; i++){
           
            System.out.println(" Many Packets --" + Thread.currentThread().getName());
        }
        jay j1 = new jay();
        // Thread.yield();
        j1.start();
    }
}*/
//--------------------------------------------------------------------
/*join method 
class Medical extends Thread
{
    public void run()
    {
        try{
        System.out.println("(1) Start Medical Process");
        Thread.sleep(2000);
        System.out.println("  End Medical Process");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
};
class TestDrive extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("------------------");
        System.out.println("(2) Start Test-Drive Process ");
        Thread.sleep(4000);
        System.out.println("  End Test-Drive Process");
     
     }
    catch(Exception e){
        System.out.println(e);
    }
    }
};
class OffSign extends Thread
{
    public void run()
    {
        try
        {
        System.out.println("------------------");
        System.out.println("(3) Start Sign-Process");
        Thread.sleep(5000);
        System.out.println("  End Sign-Process");
        System.out.println("***** Get the licence card *****");
     }
    catch(Exception e){
        System.out.println(e);
    }
    }
};
class DriveDemo 
{
    public static void main(String[] args)throws Exception {

    Medical mCal = new Medical();
    System.out.println("***** Start the licence process *****");
    Thread.sleep(1000);
    mCal.start();
    mCal.join();
    

    TestDrive tDrive = new TestDrive();
    tDrive.start();
    tDrive.join();


    OffSign oSign = new OffSign();
    oSign.start();
    oSign.join();

    }
}*/

//--------------------------------------------------------------------
/* Interrupt method  
class Test extends Thread
{
    public void run(){
     System.out.println("A1:-" +Thread.interrupted());// true -> false
    // System.out.println("B1:-"+Thread.currentThread().isInterrupted()); // true -> true 

        try
        {
            for(int i = 1; i<=5; i++){
            System.out.println(i);
            Thread.sleep(1000);
            //System.out.println("A1:-" +Thread.interrupted());
            }
        }
        catch(Exception e){
            System.out.println("Exception:- "+e);
        }
    }
}
class jay{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        t1.interrupt();
    }
}*/
//------------------------------------------------------------------------------
// Synchronnization
/*class BookSeats
{
   static int total_seats = 20;
   synchronized void bookSeats(int seats)
    {
      
        if(total_seats >= seats){
            System.out.println(seats +" booked Sucessful ");
            total_seats = total_seats - seats;
            System.out.println("Left the seats : "+total_seats);
        }
        else{
            System.out.println(seats+" Sorry not avaliable");
        }
    
}
}
class MovieTickets extends Thread {
    
    static BookSeats  b;
    int seats;
    public void run()
    {
    
        b.bookSeats(seats);
    }
    public static void main(String[] args) {
         b = new BookSeats();
         MovieTickets Deepak = new MovieTickets();
         Deepak.seats = 7;
         Deepak.start();

         MovieTickets jay = new MovieTickets();
         jay.seats = 8;
         jay.start();

         MovieTickets yash = new MovieTickets();
         yash.seats = 9;
         yash.start();
    }
}*/
//---------------------------------------------------------
/*class Earning extends Thread{
    
    int total= 0;
    public void run()
    {
   synchronized(this)
   {
        for(int i = 1; i<=10; i++)
        {
            total = total + 100;
        }
        this.notify();
    }
    
}
};

class jay
{
    public static void main(String[] args)throws Exception {
        
    Earning E1 = new Earning();
    E1.start();
    synchronized(E1)
    {
    E1.wait();
    System.out.println("Total Earning = "+E1.total);
    }
}
}*/
   
class BookSeats
{
   static int total_seats = 20;
   synchronized static void bookSeats(int seats)
    {
      
        if(total_seats >= seats){
            System.out.println(seats +" booked Sucessful ");
            total_seats = total_seats - seats;
            System.out.println("Left the seats : "+total_seats);
        }
        else{
            System.out.println(seats+" Sorry not avaliable");
        } 
}
}
class MyThread1 extends Thread{

    int seat;
    BookSeats b;
    MyThread1(int seat , BookSeats b){
        this.b = b;
        this.seat = seat;
    }
    public void run(){
        b.bookSeats(seat);
    }
};

class MyThread2 extends Thread{
    int seat;
    BookSeats b;
    MyThread2(int seat , BookSeats b){
        this.b = b;
        this.seat = seat;
    }
    public void run(){
        b.bookSeats(seat);
    }
}
class jay{
    public static void main(String[] args) {
        BookSeats b1 = new BookSeats();

        MyThread1 t1 = new MyThread1(17, b1);
        t1.start();
        MyThread1 t2 = new MyThread1(2, b1);
        t2.start();

        BookSeats b2 = new BookSeats();

        MyThread1 t3 = new MyThread1(2, b2);
        t3.start();
        MyThread1 t4 = new MyThread1(3, b2);
        t4.start();
        



    }
}






