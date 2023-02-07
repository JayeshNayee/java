class ClassR
{
    public static int chanGeArr(int arr[],int i ,int val){
        // base  case
        if(i == arr.length){
           return 0;
        }
        arr[i] = val;
        chanGeArr(arr, i+1, val+1);
    }
    public static void print(int arr[]){

        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        chanGeArr(arr,0,1);
        print(arr);
    }
};