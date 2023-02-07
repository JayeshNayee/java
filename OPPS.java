class Example {

    public static void main(String[] args) {
    
    Example t = new Example();
    try{
    t.divide();
    
    }   catch(Exception e){
      e.printStackTrace();
    }
    }
    public static void divide(){
      int a = 10 , b = 2 , rec;
            if(b == 5){
              throw new ArithmeticException("Can not divided by 5");
            }
            else{
              System.out.println("Result is "+a/b);
            }
    }
 
}

