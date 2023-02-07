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
/* 
class jay extends Thread{
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
/* yield method
class jay extends Thread {
    public void run(){
        Thread.yield();
        for(int i = 1; i<=5; i++){
            
            System.out.println(" Child Thread --" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++){
           
            System.out.println(" main Thread --" + Thread.currentThread().getName());
        }
        jay j1 = new jay();
        j1.start();
    }
}*/
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
class Test extends Thread
{
    public void run(){
        try{
            for(int i = 1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class DriveDemo{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
    }
}

