import java.util.Scanner;

public class BinarySearch {

    private static int binarySearch(int[] arr, int value) {
        // int start = 0;
        // int end = arr.length-1;
        // int mid = (start+end)/2;

        // while(arr[mid] != value && start <= end){   /// Here important is thet START will be less and equal than END
        //     if(arr[mid] > value){
        //         end = mid - 1;
        //     }
        //     if(arr[mid] < value){
        //         start = mid + 1;
        //     }
        //     mid = (start+end)/2;
        // }
        // if(arr[mid] == value){
        //     return mid;
        // }else{
        //     return -1;
        // }

        
        /// 2ND METHOD AND SAFE 
        

        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = (start + end) / 2;
    
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    
        return -1;
        
    }
    
    public static void main(String[] var0) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to find ");
        int value  = sc.nextInt();

        int result = binarySearch(arr, value);
        
            if(result != -1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found ");
        }

   }

}
