import java.util.Scanner;

public class LinearSearch{

    public static  int linearSearching(int arr[], int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int [] arr = {10, 20, 50, 80, 30, 20, 40, 90};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find ");
        int value = sc.nextInt();

        int result = linearSearching(arr, value);
        
        if(result != -1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found ");
        }
    }
}