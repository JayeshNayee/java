import java.util.Scanner;

import javax.management.openmbean.OpenDataException;
class Fact
{

    /*...fibonachi... 0 1 1 2 3 5 8 13 */

    // public static void main(String[] args){

    //     System.out.print("Enter any number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int fibo = fibo(n);
    //     System.out.println(fibo);   
    // }
    // public static int fibo(int n){
    //     int a = 0 , b = 1 , c ;
    //     if(n == 0){
    //         return a;
    //     }
    //     for(int i = 2; i<= n; i++)
    //     {
    //         c = a+b;
    //         a = b;
    //         b = c;
    //     }
    //     return b;
    // }


    // public static void main(String[] args) {
        
    //     System.out.print("Enter any number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int fibo = fibo(n);
    //     System.out.print(fibo);
    // }
    // public static int  fibo(int n){
    //     if(n<=1){
    //         return n;
    //     }
    //    return fibo(n-1)+ fibo(n-2);
    // }

   /* public static void main(String[] args) {
        int arr[] = {1,2,13,4,5};
       System.out.println(iSorted(arr, 0));
    }
    public static boolean iSorted(int arr[], int i){
        // base case

        if(i == arr.length-1){
            return true;
        }
        else if(arr[i]>arr[i+1]){
            return false;
        }
        return iSorted(arr, i+1);
    }
    */
    // public static void main(String[] args) {
    //     int arr[] = {4,2,4,5,4,7};
    //     int key = 4;

    //     System.out.println(occErance(arr,key, 0));
    // }
    // public static int occErance(int arr[],int key,int i){

    //     if(i==arr.length){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //      return occErance(arr, key, i+1);
    // }


/*print sum of the N natural number */

// public static void main(String[] args) {
//     int sum = sum(1,5);

//     System.out.println(sum);
// }
// public static int sum(int s , int e){

//     if(s<=e){
//         return e + sum(s, e-1);
//     }
//     else {
//         return e;
//     }
//}
/*POWER CALCULATE  */

    // public static void main(String[] args) {
        
    //     System.out.println("optimized power is "+ power(2,10));
    // }
    // public static int power(int x, int n){
        
    //     //base case
    //     if(n == 0){
    //         return 1;
    //     }
    //     return x*power(x, n-1);

    // }
    /*OPTIMIZED POWER CALCULATE */
    public static void main(String[] args) {

    System.out.println(oPTimized(2,10));

    }
    public static int oPTimized(int x , int n){

        if(n == 0){
            return 1;
        }
        int halfPwer = oPTimized(x, n/2) * oPTimized(x, n/2);
        if(n%2!=0){
            halfPwer = x * halfPwer;
        }
        return halfPwer;
    }
};
