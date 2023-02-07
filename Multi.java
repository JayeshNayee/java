public class Multi {
    void show(int a, String b){
        System.out.println("10");
    }
    void show(String a , int b){
        System.out.println("20");
    }
    
    public static void main(String[] args) {
        Multi  m1 = new Multi();
        m1.show(10 ,"abc");

    }
}
