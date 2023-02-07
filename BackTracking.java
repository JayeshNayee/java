public class BackTracking {

    public static void main(String[] args) {
        
        int arr[] = new int[5];
        chArr(arr,0,1);
    }
     public static void chArr(int arr[], int i, int value){
        //base case
        if(i==arr.length()){
            return;
        }
        arr[i] = value;
        chArr(arr, i+1, value+1);

     }
}
