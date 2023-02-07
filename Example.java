import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Example{
    // public static void main(String[] args) {
    
    //     Example t = new Example();
    //     try{
    //     t.divide();
        
    //     }   catch(Exception e){
    //       e.printStackTrace();
    //     }
    //     System.out.println("Hii");
    //     }
    //     public static void divide(){
    //       int a = 10 , b = 5 , rec;
    //             if(b == 5){
    //               throw new ArithmeticException("Can not divided by 5");
    //             }
    //             else{
    //               System.out.println("Result is "+a/b);
    //             }
    //     }
    // public static void main(String[] args)throws Exception {
    
    //     // for(int i = 0; i<=10 ; i++){
    //     //     System.out.println(i);
    //     //     try{
    //     //     Thread.sleep(1000);
    //     //     }
    //     //     catch(Exception e){
            
    //     //         System.out.println(e);
    //     //     }
    //     //}
    //     for(int i = 0; i<=10 ; i++){

    //         System.out.println(i);
    //         Thread.sleep(1000);
    //     }
    // }
   
    void readFile()throws FileNotFoundException{
        // try{
        // FileInputStream fis = new FileInputStream("d:/abc.txt");
            
        // } catch (Exception e) {
    
        //     System.out.println(e);
        // }

        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
    void saveFile()throws FileNotFoundException{
       FileOutputStream fos = new FileOutputStream("d:/abc.txt");
    }

class Test{

        public static void main(String[] args) {
            Example e1 = new Example();
            try 
            {
                e1.readFile();  
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
            // e1.saveFile();  
        }
    }

};