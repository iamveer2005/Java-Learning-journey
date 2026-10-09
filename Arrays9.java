// Check if given array is sorted.
import java.util.*;
public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){
            System.out.println("Array is Sorted");
            }else{
            System.out.println("Array is not Sorted");
            }
        }
    }
}
